package com.company;

import java.util.Scanner;

/**
 * Created by s3rius on 21.03.17.
 */
public class Boss extends Thread {

    private String Bossstr;

    @Override
    public  void run()
    {
        System.out.println("Введите колличество процоссов");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            Scout sc = new Scout(in);
            
        }
    }
}

