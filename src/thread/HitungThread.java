/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

public class HitungThread extends Thread {

    private String namaBangun;

    public HitungThread(String namaBangun) {

        this.namaBangun = namaBangun;
    }

    @Override
    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(
                    namaBangun
                    +
                    " sedang dihitung ke-"
                    + i);

            try {

                Thread.sleep(500);

            } catch(Exception e) {

                System.out.println(e);
            }
        }
    }
}
