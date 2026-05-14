/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import bangun.Lingkaran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

    public static void main(String[] args) {

        JFrame frame =
                new JFrame(
                        "Program Lingkaran");

        JLabel label =
                new JLabel(
                        "Masukkan Radius");

        JTextField field =
                new JTextField();

        JButton tombol =
                new JButton(
                        "Hitung");

        JTextArea hasil =
                new JTextArea();

        frame.setSize(400,300);

        frame.setLayout(null);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        label.setBounds(
                20,20,150,30);

        field.setBounds(
                20,60,150,30);

        tombol.setBounds(
                20,100,100,30);

        hasil.setBounds(
                20,150,300,80);

        frame.add(label);
        frame.add(field);
        frame.add(tombol);
        frame.add(hasil);

        tombol.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                double r =
                        Double.parseDouble(
                                field.getText());

                Lingkaran l =
                        new Lingkaran(r);

                hasil.setText(
                        "Luas = "
                        + l.luas()
                        +
                        "\nKeliling = "
                        + l.keliling()
                );
            }
        });

        frame.setVisible(true);
    }
}
