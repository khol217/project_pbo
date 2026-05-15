/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracts;

import interfaces.BangunRuang;

public abstract class AbstractBangunRuang
implements BangunRuang {

    // =====================================
    // ATRIBUT
    // =====================================
    protected String nama;

    // =====================================
    // CONSTRUCTOR
    // =====================================
    public AbstractBangunRuang() {

    }

    public AbstractBangunRuang(
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
                "Bangun Ruang : "
                + nama);
    }

    // =====================================
    // ABSTRACT METHOD
    // =====================================
    @Override
    public abstract double volume();
}
