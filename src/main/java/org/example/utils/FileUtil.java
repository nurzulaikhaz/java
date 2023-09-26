package org.example.utils;

import org.example.models.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<Person> readCSVFile(String filePath) throws IOException {
        File file = new File(filePath);
        String text;
        List<Person> arrayList = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            while ((text = read.readLine()) != null) {
                String[] array = text.split(",");
                if (array.length >= 5) {
                    int user_id = Integer.parseInt(array[0]);
                    String name = array[1];
                    String code = array[2];
                    int ic_num = Integer.parseInt(array[3]);
                    String birthdate = array[4];

                    Person person = new Person(user_id, name, code, ic_num, birthdate);
                    arrayList.add(person);
                }
            }
        }
        return arrayList;
    }
}
