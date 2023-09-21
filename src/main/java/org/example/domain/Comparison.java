package org.example.domain;

import java.util.ArrayList;

public class Comparison {

    public static String getLine(ArrayList<String[]> arrayList){

        for(int i = 0; i < arrayList.size(); i++){
            for(int j = i+1; j < arrayList.size(); j++){
                String[] a1 = arrayList.get(i);
                String[] a2 = arrayList.get(j);

                int counter = 0;
                if(a1[1].equals(a2[1])){
                    counter++;
                }
                if(counter >= 2){
                    System.out.println("Matched " + a1[0] +" "+ a2[1]);
                }
            }
        }

        return "";
    }
}
