package com.company;

/**
 * Этот класс нужен для получени значений из csv файла и их вывода.
 */

public class Person {

    private String id;
    private String name;
    private String gender;
    private String salary;
    private String BirthDate;
    private SubDivision subd;

    /**
     * Это конструктор для инициализации Person
      * @param id - идентификатор человека
     * @param name - имя человека
     * @param gender - пол человека
     * @param salary - зарплата человека
     * @param BirthDate - дата рождения
     * @param t - название подразделения
     * @param id_subd - идентификатор подразделения
     */

    Person(String id, String name, String gender, String salary, String BirthDate, String t, int id_subd) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.BirthDate = BirthDate;
        subd = new SubDivision(t, id_subd);
    }

    /**
     * конструктор без параметров
     */
    public Person() { }

    String getId() { return this.id; }
    String getName() { return this.name; }
    String getGender() { return this.gender; }
    String getSalary() { return this.salary; }
    String getBirthDate() { return this.BirthDate; }
    String getSubdTitle() { return subd.getTitle(); }
    int getSubdId() { return subd.getId(); }


}
