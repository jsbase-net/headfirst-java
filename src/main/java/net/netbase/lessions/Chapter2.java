package net.netbase.lessions;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.netbase.entities.Example;

import java.util.Random;

public class Chapter2 {
    public static void learn() {
        try {
            // data types
            int number = 0;
            byte x = 1;
            boolean y = false;
            number += x;
            number += y ? 1 : 0;
            System.out.println(number);

            // generate a-z string
            String alphabet = "";
            for (char a = 'a'; a < 'z'; a++) {
                alphabet += a;
            }
            System.out.println(alphabet);
            // generate a repeated characters string
            String generatedString = "";
            for (int i = 0; i < 5; i++) {
                generatedString += String.valueOf(alphabet.charAt(i)).repeat(i + 1);
            }
            System.out.println(generatedString.toUpperCase());

            Random rand = new Random();
            Example example = new Example();
            String exampleId = Integer.toString(rand.nextInt(1, 1000));
            example.setId(exampleId);
            example.title = "Title";
            example.description = "Des";
            System.out.println(example.title + " " + example.description + " " + rand.nextInt() + " " + example.isVisible);
            System.out.println(example.toJsonString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
