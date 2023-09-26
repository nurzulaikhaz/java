package org.example.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<Person[]> countAndMatch(List<Person> dataList) throws JsonProcessingException {
        List<Person[]> matchingRows = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            Person currentPerson = dataList.get(i);
            for (int j = i + 1; j < dataList.size(); j++) {
                Person otherPerson = dataList.get(j);
                int matchedElements = 0;

                if (currentPerson.getUser_id() == otherPerson.getUser_id()) {
                    matchedElements++;
                }
                if (currentPerson.getName().equals(otherPerson.getName())) {
                    matchedElements++;
                }
                if (currentPerson.getCode().equals(otherPerson.getCode())) {
                    matchedElements++;
                }
                if (currentPerson.getIc_num() == otherPerson.getIc_num()) {
                    matchedElements++;
                }
                if (currentPerson.getBirthdate().equals(otherPerson.getBirthdate())) {
                    matchedElements++;
                }

                if (matchedElements >= 2) {
                    matchingRows.add(new Person[]{currentPerson, otherPerson});
                    ObjectMapper objectMapper = new ObjectMapper();
                    String currentPersonJson = objectMapper.writeValueAsString(currentPerson);
                    String otherPersonJson = objectMapper.writeValueAsString(otherPerson);

                    System.out.println("Matched Row " + i + ": " + currentPersonJson);
                    System.out.println("Matched Row " + j + ": " + otherPersonJson);
                    System.out.println();
                }
            }
        }
        return matchingRows;
    }
}
