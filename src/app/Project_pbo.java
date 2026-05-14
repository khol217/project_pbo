/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import bangun.*;
import thread.HitungThread;

import java.util.Scanner;

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
            System.out.println("0. Exit");

            System.out.print("Pilih menu : ");

            pilih = input.nextInt();

            switch (pilih) {

                case 1 -> {
                    System.out.print(
                            "Masukkan radius : ");

                    double r =
                            input.nextDouble();

                    Lingkaran l =
                            new Lingkaran(r);

                    l.tampilInfo();

                    System.out.println(
                            "Luas = "
                                    + l.luas());
                    
                    System.out.println(
                            "Keliling = "
                                    + l.keliling());
                }

                case 2 -> {
                    System.out.print(
                            "Radius : ");
                    double r = input.nextDouble();
                    System.out.print(
                            "Tinggi : ");
                    double t =
                            input.nextDouble();
                    Tabung tb =
                            new Tabung(r, t);
                    tb.tampilInfo();
                    System.out.println(
                            "Volume = "
                                    + tb.volume());
                    System.out.println(
                            "Luas Permukaan = "
                                    + tb.luasPermukaan());
                }

                case 3 -> {
                    System.out.print(
                            "Radius : ");
                    double r = input.nextDouble();
                    System.out.print(
                            "Tinggi : ");
                    double t = input.nextDouble();
                    Kerucut k =
                            new Kerucut(r, t);
                    k.tampilInfo();
                    System.out.println(
                            "Volume = "
                                    + k.volume());
                }

                case 4 -> {
                    System.out.print(
                            "Radius : ");
                    double r = input.nextDouble();
                    Bola b =
                            new Bola(r);
                    b.tampilInfo();
                    System.out.println(
                            "Volume = "
                                    + b.volume());
                }

                case 5 -> {
                    System.out.print(
                            "Radius besar : ");
                    double R =
                            input.nextDouble();
                    System.out.print(
                            "Radius kecil : ");
                    double rk =
                            input.nextDouble();
                    System.out.print(
                            "Tinggi : ");
                    double t = input.nextDouble();
                    KerucutTerpancung kt =
                            new KerucutTerpancung(
                                    R, rk, t);
                    kt.tampilInfo();
                    System.out.println(
                            "Volume = "
                                    + kt.volume());
                }

                case 6 -> {
                    System.out.print(
                            "Radius : ");
                    double r = input.nextDouble();
                    System.out.print(
                            "Sudut : ");
                    double s =
                            input.nextDouble();
                    Juring j =
                            new Juring(r, s);
                    j.tampilInfo();
                    System.out.println(
                            "Luas Juring = "
                                    + j.luasJuring());
                }

                case 7 -> {
                    System.out.print(
                            "Radius : ");
                    double r = input.nextDouble();
                    System.out.print(
                            "Sudut : ");
                    double s = input.nextDouble();
                    Tembereng tm =
                            new Tembereng(r, s);
                    tm.tampilInfo();
                    System.out.println(
                            "Luas Tembereng = "
                                    + tm.luasTembereng());
                }

                case 8 -> {
                    System.out.print(
                            "Radius luar : ");

                    double rl =
                            input.nextDouble();

                    System.out.print(
                            "Radius dalam : ");

                    double rd =
                            input.nextDouble();

                    Cincin c =
                            new Cincin(rl, rd);

                    c.tampilInfo();

                    System.out.println(
                            "Luas Cincin = "
                                    + c.luasCincin());
                }

                case 9 -> {
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
                }

                case 0 -> System.out.println(
                            "Program selesai.");

                default -> System.out.println(
                            "Menu tidak tersedia.");
            }

        } while (pilih != 0);
    }
}
