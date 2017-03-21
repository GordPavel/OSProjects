package com.company;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * Created by s3rius on 21.03.17.
 */
public class Boss extends Thread {

    private String bossstr;
    private Semaphore semaphore;

    @Override
    public  void run()
    {
        semaphore = new Semaphore(2, true);
        bossstr = "";
        Scanner in = new Scanner(System.in);
        try {
            semaphore.acquire();

        System.out.println("Введите колличество процоссов");

        int n = in.nextInt();
            for (int i = 0; i < n ; i++) {
                Scout sc = new Scout(in);
                sc.run();
                bossstr += sc.getString();
            }
            System.out.println(bossstr);

        semaphore.release();
        } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}

