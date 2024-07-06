package com.oops.polymorphism.methodoverloading;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data {
    private JPanel main;
    private JTextField noTextField;
    private JTextField nameTextField;
    private JTextField departmentTextField;
    private JButton INSERTButton;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    Connection con;
    PreparedStatement pst;

    public Data() {

        INSERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name, Department;
                Name = nameTextField.getText();
                Department = departmentTextField.getText();
                try {
                    pst = con.prepareStatement("insert into Student(Name,Department) values(?,?)");
                    pst.setString(1, Name);
                    pst.setString(2, Department);
                    pst.executeUpdate();
                    nameTextField.setText("");
                    departmentTextField.setText("");
                    JOptionPane.showMessageDialog(null, "Record inserted");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
            });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Data");
        frame.setContentPane(new Data().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
