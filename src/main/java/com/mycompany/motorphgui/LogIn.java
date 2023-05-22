/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;

/**
 *
 * @author Cha
 */
import com.opencsv.CSVReader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        try {
            CSVReader csvreader = new CSVReader(new FileReader("Credentials.csv"));
            
            String[] line;
            
            boolean trial = false;
            
            while((line=csvreader.readNext())!=null){
                if(line[0].equals(usertf.getText())){
                    trial = true;
                    break;    
                }
                
            }
            csvreader.close();
            
            if(trial==true){
                if(line[1].equals(pwtf.getText())){
                        new Options(); 
                        frame.dispose();
                    } 
                else{
                    JOptionPane.showMessageDialog(null, 
                        "Invalid Password. Please try again or contact our beautiful IT Support Cha", 
                        "",
                        JOptionPane.ERROR_MESSAGE);
                        new MotorPHGUI();
                        usertf.setText("");
                        pwtf.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, 
                        "Invalid Username. Please try again or contact our beautiful IT Support Cha", 
                        "",
                        JOptionPane.ERROR_MESSAGE);
                        new MotorPHGUI();
                        usertf.setText("");
                        pwtf.setText("");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
