package edu.ntudp.fit.chursyna.lab4;
import edu.ntudp.fit.chursyna.lab4.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class JsonManager {
    public static void writeUniversityToJson(University university, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File(filePath), university);
            System.out.println("Object successfully written to JSON file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static University readUniversityFromJson(String filePath) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            University university = objectMapper.readValue(new File(filePath), University.class);
            System.out.println("Object successfully read from JSON file.");
            return university;
        } catch (IOException e) {
            System.err.println("Error reading object from JSON file: " + e.getMessage());
            return null;
        }
    }
}
