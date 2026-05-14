/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import bangun.*;

public class StressTestThread
implements Runnable {

    private int awal;
    private int akhir;

    public StressTestThread(
            int awal,
            int akhir) {

        this.awal = awal;
        this.akhir = akhir;
    }

    @Override
    public void run() {

        for(int i = awal;
            i <= akhir;
            i++) {

            double r =
                    (i % 100) + 1;

            Tabung t =
                    new Tabung(r, 10);

            Bola b =
                    new Bola(r);

            Kerucut k =
                    new Kerucut(r, 12);

            t.volume();
            b.volume();
            k.volume();
        }

        System.out.println(
                Thread.currentThread()
                .getName()
                + " selesai.");
    }
}
