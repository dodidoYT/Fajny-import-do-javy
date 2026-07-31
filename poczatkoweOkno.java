package fajnyimport;

import javax.swing.*;
import java.awt.*;

public class poczatkoweOkno {
  public static void stworzPoczatkoweOkno() {
    JFrame okno = new JFrame();
    okno.setSize(1000, 700);
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel poczatek = new JLabel("To poczatkowe okno :]");
    okno.add(poczatek);
    okno.setVisible(true);
  }
}