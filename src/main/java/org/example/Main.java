package org.example;

import org.example.controllers.MainController;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/interview.csv";

        MainController controller = new MainController();
        controller.run(filePath);

    }
}