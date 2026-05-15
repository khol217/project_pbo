/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import exceptions.*;

public class Validator {

    // =========================================
    // VALIDASI INPUT KOSONG
    // =========================================
    public static void validasiInput(
            String input)
            throws EmptyInputException {

        if(input == null ||
                input.trim().isEmpty()) {

            throw new EmptyInputException(
                    "Input tidak boleh kosong!");
        }
    }

    // =========================================
    // VALIDASI ANGKA
    // =========================================
    public static double validasiAngka(
            String input)
            throws NumberFormatException {

        try {

            return Double.parseDouble(
                    input);

        }

        catch(java.lang.NumberFormatException e) {

            throw new NumberFormatException(
                    "Input harus berupa angka!");
        }
    }

    // =========================================
    // VALIDASI RADIUS
    // =========================================
    public static void validasiRadius(
            double r)
            throws RadiusException {

        if(r <= 0) {

            throw new RadiusException(
                    "Radius harus lebih dari 0!");
        }
    }

    // =========================================
    // VALIDASI TINGGI
    // =========================================
    public static void validasiTinggi(
            double t)
            throws TinggiException {

        if(t <= 0) {

            throw new TinggiException(
                    "Tinggi tidak valid!");
        }
    }

    // =========================================
    // VALIDASI SUDUT
    // =========================================
    public static void validasiSudut(
            double s)
            throws SudutException {

        if(s <= 0 || s > 360) {

            throw new SudutException(
                    "Sudut harus antara 1 - 360!");
        }
    }

    // =========================================
    // VALIDASI CINCIN
    // =========================================
    public static void validasiCincin(
            double luar,
            double dalam)
            throws RadiusException {

        if(dalam >= luar) {

            throw new RadiusException(
                    "Radius dalam tidak boleh lebih besar dari radius luar!");
        }
    }
}
