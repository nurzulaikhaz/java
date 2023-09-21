package org.example.biz;

import java.util.ArrayList;
import java.util.List;

public class DataBiz {
    public static List<String[]> countAndMatch(ArrayList<String[]> dataList){

        List<String[]> matchingRows = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            String[] currentRow = dataList.get(i);
            for (int j = i + 1; j < dataList.size(); j++) {
                String[] otherRow = dataList.get(j);
                int matchedElements = 0;
                for (int k = 0; k < currentRow.length && k < otherRow.length; k++) {
                    if (currentRow[k].equals(otherRow[k])) {
                        matchedElements++;
                    }
                }
                if (matchedElements >= 2) {
                    matchingRows.add(currentRow);
                    matchingRows.add(otherRow);
                    System.out.println("Matched Row " + i + ": " + String.join(", ", currentRow));
                    System.out.println("Matched Row " + j + ": " + String.join(", ", otherRow));
                    System.out.println();
                }
            }
        }

        return matchingRows;
    }
}
