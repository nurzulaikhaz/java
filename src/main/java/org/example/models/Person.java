package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    private int user_id;
    private String name;
    private String code;
    private int ic_num;
    private String birthdate;

    public Person(int user_id, String name, String code, int ic_num, String birthdate) {
        this.user_id = user_id;
        this.name = name;
        this.code = code;
        this.ic_num = ic_num;
        this.birthdate = birthdate;
    }
}
