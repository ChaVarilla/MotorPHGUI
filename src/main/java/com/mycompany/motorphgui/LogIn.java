/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;

/**
 *
 * @author Cha
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogIn implements ActionListener{
    private static JFrame frame;
    private static ImageIcon icon;
    private static JPanel panel;
    private static JLabel imagelbl,userlbl,pwlbl;
    private static JTextField usertf;
    private static JButton loginbtn;
    private static JPasswordField pwtf;
    
    LogIn(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(200, 300);
        
        
        icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel);
        
        
        imagelbl = new JLabel();
        imagelbl.setVerticalAlignment(JLabel.TOP);
        imagelbl.setHorizontalAlignment(JLabel.CENTER);
        imagelbl.setIcon(icon);
        panel.add(imagelbl);
        
        userlbl = new JLabel("Username");
        usertf = new JTextField(10);
        userlbl.setLabelFor(usertf);
        panel.add(userlbl);
        panel.add(usertf);
        
        pwlbl = new JLabel("Password");
        pwtf = new JPasswordField(10);
        userlbl.setLabelFor(pwtf);
        panel.add(pwlbl);
        panel.add(pwtf);
        
        loginbtn = new JButton("Login");
        loginbtn.addActionListener(this);
        loginbtn.setHorizontalAlignment(JButton.CENTER);
        panel.add(loginbtn);
        
        
        
        frame.setVisible(true);
    }
   
   
    public void actionPerformed(ActionEvent e) {
        if(usertf.getText().equals("Cha") && pwtf.getText().equals("1234")){
            
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Invalid Username or Password. Please try again or contact our beautiful IT Support Cha", 
                    "",
                    JOptionPane.ERROR_MESSAGE);
                    new MotorPHGUI();
                    usertf.setText("");
                    pwtf.setText("");

        }
    }
}
