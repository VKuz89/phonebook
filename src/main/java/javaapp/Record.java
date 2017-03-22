package javaapp;

import java.util.List;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public class Record {
    private static int count = 0; //счетчик на количество рекордов; static - один класс для всех экземпляров
    private int id;
    private String name; // нельзя менять кроме самого класса
    private String phone; //для созданных строк нужно добавить getter and setter (правая кнопка Generate)
    private String adress;
    private String number;
    private final List<String> phones = new Arraylist<>();

    public Record() { //событие, при котором создается new record
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void addPhones(String... phones) {
        this.phone.addAll(Arrays.asList(phones));
    }

    @Override
    public String toString() { //конвертация объекта в строку
        return id + " " + number + " " + name + " " + phone + " " + adress;
    }
}
