package javaapp;


import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<>();
    private List<Phone> recordPhones = new ArrayList<>();

    //

    @Command
    public void create(String name, String email, String... phones) { //... означает, что переменная это массив
        // должно указываться в конце
        //System.out.println (phone.Length);
        //subshell cliche library
        /*for (String s : phone)
        {
            System.out.println(s);
        } */

        Record r = new Record();
        r.setName(name);
        r.setPhone(email);
        r.setPhone(email);

        recordList.add(r); //Запись записываемых строк
    }

    @Command
    public List<Record> list() { //отображение на экране
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) { //Проход по всем ID, для добавления нового телефона к нужной записи
        for (Record r : recordList) {
            if (r.getId() == id) {
                r.addPhones(phone);
                break;
            }
        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            if (name.contains(str)) {
                result.add(r);
            }
        }
        return result;
    }


}

