package org.example.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {

    public static ArrayList<String[]> readCSVFile(String filePath) throws IOException {
        File file = new File(filePath);
        String text;
        ArrayList<String[]> arrayList = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            while ((text = read.readLine()) != null) {
                String[] array = text.split(",");
                arrayList.add(array);
            }
        }
        return arrayList;
    }
}
