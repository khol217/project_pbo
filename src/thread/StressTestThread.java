/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import bangun.Tabung;
import exceptions.RadiusException;
import exceptions.TinggiException;

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

        try {

            for(int i = awal;
                i <= akhir;
                i++) {

                Tabung t =
                        new Tabung(
                                i,
                                i + 5);

                t.volume();
            }

            System.out.println(
                    Thread.currentThread()
                    .getName()
                    + " selesai");
        }

        catch(RadiusException | TinggiException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
