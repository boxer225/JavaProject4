package com.company;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Главный класс, где мы находим csv файл, создаем случайным образом идентификатор подразделения,
 * заносим значения в соответствующий класс и выводим их в консоль.
 */

public class Main {

    public static  void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\JavaProject4.1\\src\\com\\company\\foreign_names.csv");
        CSVReader reader = new CSVReader(file, ';');
        String[] nextLine;
        List<Person> person = new ArrayList<>();

        while ((nextLine = reader.readNext()) != null) {
            Random random = new Random();
            int num = random.nextInt(25000);
            person.add(new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[5], nextLine[3], nextLine[4],num));

        }
        for (int i = 1; i < person.size(); i++) {
            System.out.print(person.get(i).getId()+"; ");
            System.out.print(person.get(i).getName()+"; ");
            System.out.print(person.get(i).getGender()+"; ");
            System.out.print(person.get(i).getBirthDate()+"; ");
            System.out.print(person.get(i).getSubdTitle()+"; ");
            System.out.print(person.get(i).getSubdId()+"; ");
            System.out.print(person.get(i).getSalary()+"; ");
            System.out.println();
        }

    }
}
