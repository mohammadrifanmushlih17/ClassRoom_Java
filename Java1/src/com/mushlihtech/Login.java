package com.mushlihtech;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame {

    private JPanel rootpanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JButton loginButton;
    private JButton exitButton;

    public Login(){
        add (rootpanel);
        setSize(400,500);



        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evo) {

                if (textField1.getText().equalsIgnoreCase("username") && String.valueOf(passwordField1.getPassword()).equalsIgnoreCase("password") && comboBox1.getSelectedItem().toString().equalsIgnoreCase("admin")) {

                    JOptionPane.showMessageDialog(null,"username dan password benar, anda berhasil login");
                    textField1.setText("");
                    passwordField1.setText("");
                    comboBox1.setSelectedItem("User");
                    ;
                } else
                    JOptionPane.showMessageDialog(null, "username dan password salah, anda gagal login");
                textField1.setText("");
                passwordField1.setText("");
                comboBox1.setSelectedItem("User");
            }


        });

        textField1.setText("");
        passwordField1.setText("");
        comboBox1.setSelectedItem("User");





        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int exitbutton = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin keluar ?", "Konfirmasi keluar", JOptionPane.YES_NO_OPTION);

                if (exitbutton == JOptionPane.YES_OPTION){
                    System.exit(0);

                }
            }
        });
    }

}
