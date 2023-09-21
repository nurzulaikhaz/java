package org.example.domain;

import java.io.*;
import java.util.ArrayList;

public class fileR {


    public static String csvReader() throws IOException {
        File file = new File("src/main/resources/interview.csv");
        String text;
        ArrayList<String[]> arrayList = new ArrayList();
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            while((text = read.readLine()) != null){
                String[] array = text.split(",");
                arrayList.add(array);
            }

            Comparison.getLine(arrayList);

        }catch(IOException e){
            return "error";
        }

        return "";
    }
}
