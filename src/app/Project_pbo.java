/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import bangun.*;
import thread.*;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Project_pbo {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println(" PROGRAM BANGUN LINGKARAN ");
            System.out.println("==============================");

            System.out.println("1. Lingkaran");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut");
            System.out.println("4. Bola");
            System.out.println("5. Kerucut Terpancung");
            System.out.println("6. Juring");
            System.out.println("7. Tembereng");
            System.out.println("8. Cincin");
            System.out.println("9. Multithreading");
            System.out.println("10. Stress Test");
            System.out.println("0. Exit");

            System.out.print("Pilih : ");

            pilih = input.nextInt();

            switch(pilih) {

                case 9:

                    HitungThread h1 =
                            new HitungThread(
                                    "Tabung");

                    HitungThread h2 =
                            new HitungThread(
                                    "Bola");

                    HitungThread h3 =
                            new HitungThread(
                                    "Kerucut");

                    h1.start();
                    h2.start();
                    h3.start();

                    break;

                case 10:

                    int totalData = 10000;

                    int totalThread = 10;

                    int bagian =
                            totalData /
                            totalThread;

                    long start =
                            System.currentTimeMillis();

                    ExecutorService executor =
                            Executors.newFixedThreadPool(
                                    totalThread);

                    for(int i = 0;
                        i < totalThread;
                        i++) {

                        int awal =
                                i * bagian + 1;

                        int akhir =
                                (i + 1) * bagian;

                        executor.execute(
                                new StressTestThread(
                                        awal,
                                        akhir));
                    }

                    executor.shutdown();

                    while(!executor.isTerminated()) {

                    }

                    long end =
                            System.currentTimeMillis();

                    System.out.println(
                            "\nStress Test selesai");

                    System.out.println(
                            "Total Data : "
                            + totalData);

                    System.out.println(
                            "Total Thread : "
                            + totalThread);

                    System.out.println(
                            "Waktu Eksekusi : "
                            + (end - start)
                            + " ms");

                    break;
            }

        } while(pilih != 0);
    }
}
