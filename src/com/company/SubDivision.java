package com.company;

/**
 * Это класс для получения значений о подразделении и их вывода
 */

public class SubDivision {
    private int id;
    private String title;

    /**
     * Конструктор для класса SubDivision
     * @param t - название подразделения
     * @param id_subd - идентификатор подразделения
     */

    SubDivision(String t, int id_subd) {
        title = t;
        id = id_subd;
    }
    int getId() {
        return this.id;
    }
    String getTitle() {
        return this.title;
    }

}