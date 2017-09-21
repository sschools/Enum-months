package com.example;

import com.example.common.Month;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        Scanner scanner = new Scanner(System.in);

        for (Month month : Month.values()) {
            System.out.println(month.getEnglishName());
        }

        System.out.println("\nPlease choose a month:");
        String input = scanner.nextLine();

        List<String> afterMonths = new ArrayList<>();

        for (Month month : Month.values()) {
            if (input.equals(month.getEnglishName())) {
                for (Month testMonth : Month.values()) {
                    if (testMonth.ordinal() >= month.ordinal()) {
                        afterMonths.add(testMonth.getEnglishName());
                    }
                }
            }
        }

        System.out.println(afterMonths);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(Month.MAY);
        System.out.println(json);

    }
}
