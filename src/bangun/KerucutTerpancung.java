/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import abstracts.AbstractBangunRuang;
import utils.Validator;
import exceptions.*;

public class KerucutTerpancung
extends AbstractBangunRuang {

    private Lingkaran lingkaranBesar;

    private Lingkaran lingkaranKecil;

    private double tinggi;

    public KerucutTerpancung(
            double radiusBesar,
            double radiusKecil,
            double tinggi)
            throws RadiusException,
            TinggiException {

        Validator.validasiRadius(radiusBesar);

        Validator.validasiRadius(radiusKecil);

        Validator.validasiTinggi(tinggi);

        lingkaranBesar =
                new Lingkaran(radiusBesar);

        lingkaranKecil =
                new Lingkaran(radiusKecil);

        this.tinggi = tinggi;

        this.nama =
                "Kerucut Terpancung";
    }

    @Override
    public double volume() {

        double R =
                lingkaranBesar.getRadius();

        double r =
                lingkaranKecil.getRadius();

        return (1.0 / 3.0)
                * Math.PI
                * tinggi
                * (R * R + R * r + r * r);
    }
}
