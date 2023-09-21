package org.example;

import org.example.utils.FileUtil;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/interview.csv";

        FileUtil.readCSVFile(filePath);
    }
}