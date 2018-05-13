package com.bridge.challenge;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/appendstring")
public class StringReverseService {

    List<String> reversedStrings;

    public StringReverseService() {
        System.out.println("Someone is calling StringReverse constructor");
        this.reversedStrings = new ArrayList<String>();
    }

	@Path("{inputString}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getReversedStrings(@PathParam("inputString") String inputString) {
		System.out.println("Someone is calling the getReversedStrings command with: " + inputString);
		String reversedString = new StringBuilder(inputString).reverse().toString();

        this.reversedStrings.add(reversedString);
		int stringCount = this.reversedStrings.size() - 1;

		if(stringCount > -1) {
		    return String.format("{\"reversedStrings\": [\"%s\"]}", this.reversedStrings.get(stringCount));
		}
		return "{\"reversedStrings\": [\"\"]}";
	}

}
