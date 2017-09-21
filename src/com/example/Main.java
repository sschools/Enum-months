package com.example;

import com.example.common.Month;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (Month month : Month.values()) {
            System.out.println(month.englishName);
        }

        System.out.println("\nPlease choose a month:");
        String input = scanner.nextLine();

        List<String> afterMonths = new ArrayList<>();

        for (Month month : Month.values()) {
            if (input.equals(month.englishName)) {
                for (Month testMonth : Month.values()) {
                    if (testMonth.ordinal() >= month.ordinal()) {
                        afterMonths.add(testMonth.englishName);
                    }
                }
            }
        }

        System.out.println(afterMonths);

    }
}
