package com.bridge.challenge;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class StringReverse {

    List<String> reversedStrings;

    public StringReverse() {
        System.out.println("Someone is calling StringReverse constructor");
        this.reversedStrings = new ArrayList<String>();
    }

    public String getReversedString() {
        System.out.println("Someone is calling the getReversedString command");
        int stringCount = this.reversedStrings.size() - 1;

        if(stringCount > -1) {
            return this.reversedStrings.get(stringCount);
        }
        return "";
    }

    public void setInputString(String inputString) {
        System.out.println("Someone is calling the setInputString command");
        String reversedString = new StringBuilder(inputString).reverse().toString();
        this.reversedStrings.add(reversedString);
    }

}
