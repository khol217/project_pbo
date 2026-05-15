/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import bangun.*;
import thread.*;
import utils.*;
import exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainGUI extends JFrame {

    // =========================
    // CARD LAYOUT
    // =========================
    private CardLayout cardLayout;

    private JPanel mainPanel;

    // =========================
    // LEVEL 1
    // =========================
    private JComboBox<String> comboBangun;

    private JButton btnNext;

    // =========================
    // LEVEL 2
    // =========================
    private JPanel inputPanel;

    private JTextField tfR;

    private JTextField tfTinggi;

    private JTextField tfSudut;

    private JTextField tfR2;

    private JButton btnHitung;

    private JButton btnKembali;

    // =========================
    // LEVEL 3
    // =========================
    private JTextArea hasilArea;

    private JButton btnMenu;

    // =========================
    // PILIHAN
    // =========================
    private String pilihan;

    // =========================
    // CONSTRUCTOR
    // =========================
    public MainGUI() {

        setTitle(
                "Program Bangun Lingkaran");

        setSize(700, 500);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        cardLayout =
                new CardLayout();

        mainPanel =
                new JPanel(cardLayout);

        buatLevel1();

        buatLevel2();

        buatLevel3();

        add(mainPanel);

        setVisible(true);
    }

    // =================================================
    // LEVEL 1
    // =================================================
    private void buatLevel1() {

        JPanel panel1 =
                new JPanel();

        panel1.setLayout(null);

        JLabel title =
                new JLabel(
                        "PROGRAM BANGUN LINGKARAN");

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        title.setBounds(
                120,
                50,
                500,
                40);

        String[] menu = {

                "Lingkaran",
                "Tabung",
                "Kerucut",
                "Bola",
                "Kerucut Terpancung",
                "Juring",
                "Tembereng",
                "Cincin",
                "Multithreading Test",
                "Stress Test"
        };

        comboBangun =
                new JComboBox<>(menu);

        comboBangun.setBounds(
                200,
                150,
                250,
                40);

        btnNext =
                new JButton(
                        "LANJUT");

        btnNext.setBounds(
                250,
                230,
                150,
                40);

        panel1.add(title);

        panel1.add(comboBangun);

        panel1.add(btnNext);

        mainPanel.add(
                panel1,
                "LEVEL1");

        btnNext.addActionListener(e -> {

            pilihan =
                    comboBangun
                    .getSelectedItem()
                    .toString();

            tampilInput();

            cardLayout.show(
                    mainPanel,
                    "LEVEL2");
        });
    }

    // =================================================
    // LEVEL 2
    // =================================================
    private void buatLevel2() {

        inputPanel =
                new JPanel();

        inputPanel.setLayout(null);

        JLabel lblTitle =
                new JLabel(
                        "INPUT DATA");

        lblTitle.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22));

        lblTitle.setBounds(
                250,
                20,
                300,
                40);

        JLabel lblR =
                new JLabel(
                        "Radius");

        lblR.setBounds(
                100,
                100,
                100,
                30);

        tfR =
                new JTextField();

        tfR.setBounds(
                250,
                100,
                200,
                30);

        JLabel lblT =
                new JLabel(
                        "Tinggi");

        lblT.setBounds(
                100,
                150,
                100,
                30);

        tfTinggi =
                new JTextField();

        tfTinggi.setBounds(
                250,
                150,
                200,
                30);

        JLabel lblSudut =
                new JLabel(
                        "Sudut");

        lblSudut.setBounds(
                100,
                200,
                100,
                30);

        tfSudut =
                new JTextField();

        tfSudut.setBounds(
                250,
                200,
                200,
                30);

        JLabel lblR2 =
                new JLabel(
                        "Radius Dalam");

        lblR2.setBounds(
                100,
                250,
                120,
                30);

        tfR2 =
                new JTextField();

        tfR2.setBounds(
                250,
                250,
                200,
                30);

        btnHitung =
                new JButton(
                        "HITUNG");

        btnHitung.setBounds(
                180,
                340,
                120,
                40);

        btnKembali =
                new JButton(
                        "KEMBALI");

        btnKembali.setBounds(
                330,
                340,
                120,
                40);

        inputPanel.add(lblTitle);

        inputPanel.add(lblR);
        inputPanel.add(tfR);

        inputPanel.add(lblT);
        inputPanel.add(tfTinggi);

        inputPanel.add(lblSudut);
        inputPanel.add(tfSudut);

        inputPanel.add(lblR2);
        inputPanel.add(tfR2);

        inputPanel.add(btnHitung);
        inputPanel.add(btnKembali);

        mainPanel.add(
                inputPanel,
                "LEVEL2");

        btnKembali.addActionListener(e -> {

            cardLayout.show(
                    mainPanel,
                    "LEVEL1");
        });

        btnHitung.addActionListener(e -> {

            prosesPerhitungan();
        });
    }

    // =================================================
    // LEVEL 3
    // =================================================
    private void buatLevel3() {

        JPanel panel3 =
                new JPanel();

        panel3.setLayout(null);

        JLabel title =
                new JLabel(
                        "HASIL PERHITUNGAN");

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22));

        title.setBounds(
                180,
                30,
                300,
                40);

        hasilArea =
                new JTextArea();

        hasilArea.setEditable(false);

        JScrollPane scroll =
                new JScrollPane(
                        hasilArea);

        scroll.setBounds(
                100,
                100,
                450,
                220);

        btnMenu =
                new JButton(
                        "MENU UTAMA");

        btnMenu.setBounds(
                230,
                360,
                150,
                40);

        panel3.add(title);

        panel3.add(scroll);

        panel3.add(btnMenu);

        mainPanel.add(
                panel3,
                "LEVEL3");

        btnMenu.addActionListener(e -> {

            clearField();

            cardLayout.show(
                    mainPanel,
                    "LEVEL1");
        });
    }

    // =================================================
    // CLEAR FIELD
    // =================================================
    private void clearField() {

        tfR.setText("");

        tfTinggi.setText("");

        tfSudut.setText("");

        tfR2.setText("");

        hasilArea.setText("");
    }

    // =================================================
    // TAMPIL INPUT
    // =================================================
    private void tampilInput() {

        tfR.setVisible(false);

        tfTinggi.setVisible(false);

        tfSudut.setVisible(false);

        tfR2.setVisible(false);

        switch(pilihan) {

            case "Lingkaran":
            case "Bola":

                tfR.setVisible(true);

                break;

            case "Tabung":
            case "Kerucut":

                tfR.setVisible(true);

                tfTinggi.setVisible(true);

                break;

            case "Kerucut Terpancung":

                tfR.setVisible(true);

                tfR2.setVisible(true);

                tfTinggi.setVisible(true);

                break;

            case "Juring":
            case "Tembereng":

                tfR.setVisible(true);

                tfSudut.setVisible(true);

                break;

            case "Cincin":

                tfR.setVisible(true);

                tfR2.setVisible(true);

                break;
        }
    }

    // =================================================
    // PROSES HITUNG
    // =================================================
    private void prosesPerhitungan() {

        try {

            String hasil = "";

            switch(pilihan) {

                // =====================================
                // LINGKARAN
                // =====================================
                case "Lingkaran":

                    Validator.validasiInput(
                            tfR.getText());

                    double r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    Lingkaran l =
                            new Lingkaran(r);

                    hasil =
                            "===== LINGKARAN ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nLuas : "
                            + l.luas()
                            +
                            "\nKeliling : "
                            + l.keliling();

                    break;

                // =====================================
                // TABUNG
                // =====================================
                case "Tabung":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfTinggi.getText());

                    r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    double t =
                            Validator.validasiAngka(
                                    tfTinggi.getText());

                    Tabung tb =
                            new Tabung(r, t);

                    hasil =
                            "===== TABUNG ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nTinggi : "
                            + t
                            +
                            "\nVolume : "
                            + tb.volume()
                            +
                            "\nLuas Permukaan : "
                            + tb.luasPermukaan();

                    break;

                // =====================================
                // KERUCUT
                // =====================================
                case "Kerucut":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfTinggi.getText());

                    r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    t =
                            Validator.validasiAngka(
                                    tfTinggi.getText());

                    Kerucut k =
                            new Kerucut(r, t);

                    hasil =
                            "===== KERUCUT ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nTinggi : "
                            + t
                            +
                            "\nVolume : "
                            + k.volume();

                    break;

                // =====================================
                // BOLA
                // =====================================
                case "Bola":

                    Validator.validasiInput(
                            tfR.getText());

                    r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    Bola b =
                            new Bola(r);

                    hasil =
                            "===== BOLA ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nVolume : "
                            + b.volume();

                    break;

                // =====================================
                // KERUCUT TERPANCUNG
                // =====================================
                case "Kerucut Terpancung":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfR2.getText());

                    Validator.validasiInput(
                            tfTinggi.getText());

                    double R =
                            Validator.validasiAngka(
                                    tfR.getText());

                    double r2 =
                            Validator.validasiAngka(
                                    tfR2.getText());

                    t =
                            Validator.validasiAngka(
                                    tfTinggi.getText());

                    KerucutTerpancung kt =
                            new KerucutTerpancung(
                                    R,
                                    r2,
                                    t);

                    hasil =
                            "===== KERUCUT TERPANCUNG ====="
                            +
                            "\nRadius Besar : "
                            + R
                            +
                            "\nRadius Kecil : "
                            + r2
                            +
                            "\nTinggi : "
                            + t
                            +
                            "\nVolume : "
                            + kt.volume();

                    break;

                // =====================================
                // JURING
                // =====================================
                case "Juring":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfSudut.getText());

                    r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    double s =
                            Validator.validasiAngka(
                                    tfSudut.getText());

                    Juring j =
                            new Juring(r, s);

                    hasil =
                            "===== JURING ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nSudut : "
                            + s
                            +
                            "\nLuas Juring : "
                            + j.luasJuring();

                    break;

                // =====================================
                // TEMBERENG
                // =====================================
                case "Tembereng":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfSudut.getText());

                    r =
                            Validator.validasiAngka(
                                    tfR.getText());

                    s =
                            Validator.validasiAngka(
                                    tfSudut.getText());

                    Tembereng tm =
                            new Tembereng(r, s);

                    hasil =
                            "===== TEMBERENG ====="
                            +
                            "\nRadius : "
                            + r
                            +
                            "\nSudut : "
                            + s
                            +
                            "\nLuas Tembereng : "
                            + tm.luasTembereng();

                    break;

                // =====================================
                // CINCIN
                // =====================================
                case "Cincin":

                    Validator.validasiInput(
                            tfR.getText());

                    Validator.validasiInput(
                            tfR2.getText());

                    double luar =
                            Validator.validasiAngka(
                                    tfR.getText());

                    double dalam =
                            Validator.validasiAngka(
                                    tfR2.getText());

                    Cincin c =
                            new Cincin(
                                    luar,
                                    dalam);

                    hasil =
                            "===== CINCIN ====="
                            +
                            "\nRadius Luar : "
                            + luar
                            +
                            "\nRadius Dalam : "
                            + dalam
                            +
                            "\nLuas Cincin : "
                            + c.luasCincin();

                    break;

                // =====================================
                // MULTITHREADING
                // =====================================
                case "Multithreading Test":

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

                    hasil =
                            "MULTITHREADING BERJALAN\n"
                            +
                            "Cek terminal.";

                    break;

                // =====================================
                // STRESS TEST
                // =====================================
                case "Stress Test":

                    int totalData =
                            Konstanta.TOTAL_DATA;

                    int totalThread =
                            Konstanta.MAX_THREAD;

                    int bagian =
                            totalData
                            / totalThread;

                    long start =
                            System.currentTimeMillis();

                    ExecutorService executor =
                            Executors.newFixedThreadPool(
                                    totalThread);

                    for(int i = 0;
                        i < totalThread;
                        i++) {

                        int awal =
                                i * bagian + 1;

                        int akhir =
                                (i + 1) * bagian;

                        executor.execute(
                                new StressTestThread(
                                        awal,
                                        akhir));
                    }

                    executor.shutdown();

                    while(!executor.isTerminated()) {

                    }

                    long end =
                            System.currentTimeMillis();

                    hasil =
                            "===== STRESS TEST ====="
                            +
                            "\nTotal Data : "
                            + totalData
                            +
                            "\nTotal Thread : "
                            + totalThread
                            +
                            "\nWaktu Eksekusi : "
                            + (end - start)
                            + " ms";

                    break;
            }

            hasilArea.setText(hasil);

            cardLayout.show(
                    mainPanel,
                    "LEVEL3");
        }

        catch(Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage());
        }
    }

    // =================================================
    // MAIN
    // =================================================
    public static void main(String[] args) {

        new MainGUI();
    }
}