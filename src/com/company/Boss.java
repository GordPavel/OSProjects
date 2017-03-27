package com.company;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Boss extends Thread{

    String bossString = "";

    @Override
    public void run(){
        Scanner   bossScanner   = new Scanner( System.in );
        Scanner   scoutsScanner = new Scanner( System.in );
        Semaphore semaphore     = new Semaphore( 2 );
        System.out.println( "Введите кол-во Шпиёнаф, бистра! Швуйне, швуйне!" );
        for( int i = 0, scoutsQ = bossScanner.nextInt() ; i < scoutsQ ; i++ ){
            Thread scout = new Thread( new Scout( i + 1, this, semaphore, scoutsScanner ) );
            scout.run();
        }
        bossScanner.close();
        System.out.println( bossString );
    }
}

class Scout implements Runnable{

    Integer   number;
    Boss boss;
    Semaphore semaphore;
    Scanner   scanner;

    public Scout( Integer number, Boss boss, Semaphore semaphore, Scanner scanner ){
        this.number = number;
        this.boss = boss;
        this.semaphore = semaphore;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        try{
            semaphore.acquire();

            System.out.println( "Я шпиён " + number + ". Дай мне число." );
            boss.bossString += scanner.nextLine() + " ";

            semaphore.release();
        }catch( InterruptedException e ){
            e.printStackTrace();
        }
    }
}




