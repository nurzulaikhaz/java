package org.example.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Person;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class TestDataService {

    private DataService dataService;

    @BeforeEach
    public void setUp() {
        dataService = new DataService();
    }

    @Test
    public void countAndMatchTest() throws JsonProcessingException {

        List<Person> dataList = List.of(
                new Person(1, "Alice", "A123", 12345, "1990-01-01"),
                new Person(2, "Bob", "C789", 54321, "1998-08-08"),
                new Person(3, "Charlie", "C789",54321 , "1988-08-08")
                // Add more test data as needed
        );

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
    }
}
