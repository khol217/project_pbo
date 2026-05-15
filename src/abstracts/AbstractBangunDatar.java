/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracts;

import interfaces.BangunDatar;

public abstract class AbstractBangunDatar
implements BangunDatar {

    // =====================================
    // ATRIBUT
    // =====================================
    protected String nama;

    // =====================================
    // CONSTRUCTOR
    // =====================================
    public AbstractBangunDatar() {

    }

    public AbstractBangunDatar(
            String nama) {

        this.nama = nama;
    }

    // =====================================
    // GETTER
    // =====================================
    public String getNama() {

        return nama;
    }

    // =====================================
    // SETTER
    // =====================================
    public void setNama(
            String nama) {

        this.nama = nama;
    }

    // =====================================
    // METHOD UMUM
    // =====================================
    public void tampilInfo() {

        System.out.println(
                "Bangun Datar : "
                + nama);
    }

    // =====================================
    // ABSTRACT METHOD
    // =====================================
    @Override
    public abstract double luas();

    @Override
    public abstract double keliling();
}
