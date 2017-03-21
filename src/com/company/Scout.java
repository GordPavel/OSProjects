package com.company;

import java.util.Scanner;

/**
 * Created by s3rius on 21.03.17.
 */
public class Scout extends Thread {

    private String string;

    public Scout(Scanner scanner){
        string = scanner.nextLine();
    }

//    public String getString() {
//        return string;
//    }


    public void run(String sc) {
        super.run();
        sc += string;
    }
}
