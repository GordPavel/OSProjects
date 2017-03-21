package com.company;

import java.util.Scanner;

/**
 * Created by s3rius on 21.03.17.
 */
public class Scout extends Thread {

    private String string;
    private Scanner scanner;

    public Scout(Scanner scanner){
       this.scanner = scanner;
    }

//    public String getString() {
//        return string;
//    }


    public String getString() {
        return string;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Вас беспокоит шпиён...");;
        string = scanner.nextLine();
    }
}
