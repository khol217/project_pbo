/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import bangun.*;
import exceptions.RadiusException;
import exceptions.TinggiException;
import utils.Konstanta;

public class HitungThread
extends Thread {

    private String namaBangun;

    public HitungThread(
            String namaBangun) {

        this.namaBangun =
                namaBangun;
    }

    @Override
    public void run() {

        try {

            switch(namaBangun) {

                case "Tabung":

                    Tabung t =
                            new Tabung(7, 10);

                    System.out.println(
                            "Volume Tabung = "
                            + t.volume());

                    break;

                case "Bola":

                    Bola b =
                            new Bola(7);

                    System.out.println(
                            "Volume Bola = "
                            + b.volume());

                    break;

                case "Kerucut":

                    Kerucut k =
                            new Kerucut(7, 10);

                    System.out.println(
                            "Volume Kerucut = "
                            + k.volume());

                    break;
            }

            Thread.sleep(
                    Konstanta.DELAY);

        }

        catch(RadiusException | TinggiException | InterruptedException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
