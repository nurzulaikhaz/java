package org.example.controllers;

import org.example.models.Person;
import org.example.services.DataService;
import org.example.utils.FileUtil;

import java.io.IOException;
import java.util.List;


public class MainController {

    private FileUtil fileUtil;
    private DataService dataService;

    public MainController() {
        this.fileUtil = new FileUtil();
        this.dataService = new DataService();
    }

    public void run(String filePath) throws IOException {
        List<Person> data = fileUtil.readCSVFile(filePath);
        dataService.countAndMatch(data);
    }
}
