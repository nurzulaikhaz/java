package org.example.controllers;

import org.example.services.DataService;
import org.example.utils.FileUtil;

import java.io.IOException;
import java.util.ArrayList;


public class MainController {

    private FileUtil fileUtil;
    private DataService dataService;

    public MainController() {
        this.fileUtil = new FileUtil();
        this.dataService = new DataService();
    }

    public void run(String filePath) throws IOException {
        ArrayList<String[]> data = fileUtil.readCSVFile(filePath);

        dataService.countAndMatch(data);
    }
}
