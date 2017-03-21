package com.company;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * Created by s3rius on 21.03.17.
 */
public class Boss extends Thread {

    private String Bossstr;
    private Semaphore semaphore;

    @Override
    public  void run()
    {
        System.out.println("Введите колличество процоссов");
        Bossstr = "";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        synchronized (Bossstr) {
            for (int i = 0; i < n; i++) {
                Scout sc = new Scout(in);
                sc.run(Bossstr);
            }
        }
    }
}

