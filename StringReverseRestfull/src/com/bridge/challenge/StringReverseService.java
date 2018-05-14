package com.bridge.challenge;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.spi.resource.Singleton;

@Path("/appendstring")
@Singleton
public class StringReverseService {

    List<String> reversedStrings;

    public StringReverseService() {
        System.out.println("Someone is calling StringReverse constructor");
        this.reversedStrings = new ArrayList<String>();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getReversedStrings()
            throws JsonGenerationException, JsonMappingException, IOException {

        System.out.println("Someone is calling the getReversedStrings command with no parameters!");
        String json_data = convertListToJson("reversedStrings", reversedStrings);

        System.out.println(json_data);
        return json_data;
    }

    @GET
    @Path("{inputString}")
    public void getReversedStrings(@PathParam("inputString") String inputString)
            throws JsonGenerationException, JsonMappingException, IOException {
        System.out.println("Someone is calling the getReversedStrings command with: " + inputString);

        String reversedString = new StringBuilder(inputString).reverse().toString();
        this.reversedStrings.add(reversedString);
    }

    private String convertListToJson(String listName, List<String> stringList)
            throws IOException, JsonGenerationException, JsonMappingException {

        final ObjectMapper mapper = new ObjectMapper();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        mapper.writeValue(out, stringList);

        final byte[] data = out.toByteArray();
        final int stringCount = this.reversedStrings.size() - 1;

        if (stringCount > -1) {
            return String.format("{\"%s\": %s}", listName, new String(data));
        }
        return String.format("{\"%s\": [\"\"]}", listName);
    }

}

