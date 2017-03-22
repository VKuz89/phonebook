package javaapp;

import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by JavaCourses on 15.03.2017..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("hello", "This is phone book", new PhoneBook()) //передали библиотеке объект javaapp.Main
                .commandLoop(); //ожидание ввода пользователя
    }


}
