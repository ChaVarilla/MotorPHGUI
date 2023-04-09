/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;

/**
 *
 * @author Cha
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Options implements ActionListener {
    
    
     JFrame frame;
     JButton infobtn,payrollbtn,exitbtn;
     JPanel panel;
     
     
    
    Options(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(200, 300);
        
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 200, 300);
        panel.setBackground(Color.pink);
        frame.add(panel);
       
        
        infobtn = new JButton("Employee Information");
        infobtn.setBounds(10, 30, 170, 40);
        panel.add(infobtn);
        infobtn.addActionListener(this);
        
        
        payrollbtn = new JButton("Employee Payroll");
        payrollbtn.setBounds(10, 100, 170, 40);
        panel.add(payrollbtn);
        payrollbtn.addActionListener(this);
        
        exitbtn =new JButton("Exit");
        exitbtn.setBounds(10, 170, 170, 40);
        panel.add(exitbtn);
        exitbtn.addActionListener(this);
 
        
        frame.setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==infobtn){
            new EmployeeInfo();
            frame.dispose();
            
        }
        
        else if(e.getSource()==payrollbtn){
            new Payroll();
            frame.dispose();
        }
        
        else if(e.getSource()==exitbtn){
            new LogIn();
            frame.dispose();
        }
        
        
    }
    
}
