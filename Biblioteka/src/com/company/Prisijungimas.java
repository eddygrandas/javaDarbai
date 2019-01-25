package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prisijungimas {
    private JRadioButton darbuotojasRadioButton;
    private JRadioButton vartotojasRadioButton;
    private JButton pasirinktiButton;
    private JTextField bibliotekaTextField;
    private JPanel jPanel;


    public Prisijungimas() {
        pasirinktiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Tipo veikia kazkas");
            }
        });
    }

    public static void main(String[] args) {

        JFrame jFrame= new JFrame("Biblioteka");
        jFrame.setContentPane(new Prisijungimas().jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
