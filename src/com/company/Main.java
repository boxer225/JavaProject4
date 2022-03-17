package com.company;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

/**
 * Мейн
 * В нем выполняется считывание из файла csv, генерация id для 2 сущности, добавление в объект типа List людей из файла и печать.
 * "C:\JavaProject4.1\src\com\company\foreign_names.csv"
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите полный путь до нужного вам файла, включая само его название! ");
        String directory = scanner.next();
        int check = 0;
        int num = 0;
        try {


            FileReader file = new FileReader(directory);
            CSVReader reader = new CSVReader(file, ';');
            if (reader == null)
            {
                throw new FileNotFoundException(directory);
            }
            String[] nextStr;
            List<Human> hmn = new ArrayList<>();

            while ((nextStr = reader.readNext()) != null) {
                Random rndm = new Random();
                if (check == 0) {
                    num = rndm.nextInt(4000);
                    check ++;
                }
                else {num++;}
                hmn.add(new Human(nextStr[0], nextStr[1], nextStr[2], nextStr[5], nextStr[3], nextStr[4], num));

            }
            for (int i = 1; i < hmn.size(); i++) {
                System.out.print(hmn.get(i).getId() + "; " + hmn.get(i).getName() + "; " + hmn.get(i).getGender() + "; " + hmn.get(i).getBirthDate() + "; " + hmn.get(i).getSubdTitle() + "; " + hmn.get(i).getSubdId() + "; " + hmn.get(i).getSalary() + "; ");
                System.out.println();
            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

    }
}
