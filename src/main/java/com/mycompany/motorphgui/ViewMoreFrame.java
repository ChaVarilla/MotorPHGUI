/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Cha
 */
public class ViewMoreFrame implements ActionListener {
    JFrame frame;
    JPanel panel1,panel2,panel3;
    JButton updatebtn,returnbtn;
    
    
    JLabel paylbl,enumlbl,lnamelbl,fnamelbl,bdaylbl,addlbl,phonenumlbl,sssnumlbl,phnumlbl,
           tinnumlbl,pgnumlbl,statuslbl,poslbl,suplbl,basiclbl,ricelbl,phonelbl,clothlbl,semratelbl,
           hratelbl,earningslbl, salperiodlbl,salearnedlbl,rice1lbl,phone1lbl,cloth1lbl,grosslbl,
           deductionslbl, sssdeductlbl,phdeductlbl,pgdeductlbl,taxdeductlbl,totaldeductlbl,netlbl;
   
    JTextField enumtf,lnametf,fnametf,bdaytf,addtf,phonenumtf,sssnumtf,phnumtf,
           tinnumtf,pgnumtf,statustf,postf,suptf,basictf,ricetf,phonetf,clothtf,semratetf,
           hratetf,salperiodtf,salearnedtf,rice1tf,phone1tf,cloth1tf,grosstf,
           sssdeducttf,phdeducttf,pgdeducttf,taxdeducttf,totaldeducttf,nettf;
    
    
  
    
    ViewMoreFrame(){
              
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 500, 500);
        frame.add(panel1);
        
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(500, 0, 300, 500);
        frame.add(panel2);
        
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(0, 500, 800, 100);
        frame.add(panel3);
        
        
        updatebtn = new JButton("Update");
        updatebtn.setBounds(10, 10, 150, 30);
        panel3.add(updatebtn);
        updatebtn.addActionListener(this);
        
       
        
        returnbtn = new JButton("Return to Options");
        returnbtn.setBounds(620, 10, 150, 30);
        panel3.add(returnbtn);
        returnbtn.addActionListener(this);

        
        enumlbl = new JLabel("Employee Number:");
        enumlbl.setBounds(10,20 , 120, 20);
        panel1.add(enumlbl);
        
        lnamelbl = new JLabel("Last Name:");
        lnamelbl.setBounds(10,45 , 120, 20);
        panel1.add(lnamelbl);
        
        fnamelbl = new JLabel("First Name:");
        fnamelbl.setBounds(10,70 , 120, 20);
        panel1.add(fnamelbl);
        
        bdaylbl = new JLabel("Birthday:");
        bdaylbl.setBounds(10,95 , 120, 20);
        panel1.add(bdaylbl);
        
        addlbl = new JLabel("Address:");
        addlbl.setBounds(10,120 , 120, 20);
        panel1.add(addlbl);
        
        phonenumlbl = new JLabel("Phone Number:");
        phonenumlbl.setBounds(10,145 , 120, 20);
        panel1.add(phonenumlbl);
        
        sssnumlbl = new JLabel("SSS Number:");
        sssnumlbl.setBounds(10,170 , 120, 20);
        panel1.add(sssnumlbl);
        
        phnumlbl = new JLabel("Philhealth Number:");
        phnumlbl.setBounds(10,195 , 120, 20);
        panel1.add(phnumlbl);
        
        tinnumlbl = new JLabel("TIN:");
        tinnumlbl.setBounds(10,220 , 120, 20);
        panel1.add(tinnumlbl);
        
        pgnumlbl = new JLabel("PAGIBIG Number:");
        pgnumlbl.setBounds(10,245 , 120, 20);
        panel1.add(pgnumlbl);
        
        statuslbl = new JLabel("Status:");
        statuslbl.setBounds(10,270 , 120, 20);
        panel1.add(statuslbl);
        
        poslbl = new JLabel("Position:");
        poslbl.setBounds(10,295 , 120, 20);
        panel1.add(poslbl);
        
        suplbl = new JLabel("Supervisor:");
        suplbl.setBounds(10,320 , 120, 20);
        panel1.add(suplbl);
        
        basiclbl = new JLabel("Basic Salary:");
        basiclbl.setBounds(10,345 , 120, 20);
        panel1.add(basiclbl);
        
        ricelbl = new JLabel("Rice Allowance:");
        ricelbl.setBounds(10,370 , 120, 20);
        panel1.add(ricelbl);
        
        phonelbl = new JLabel("Phone Allowance:");
        phonelbl.setBounds(10,395 , 120, 20);
        panel1.add(phonelbl);
        
        clothlbl = new JLabel("Clothing Allowance:");
        clothlbl.setBounds(10,420 , 120, 20);
        panel1.add(clothlbl);
        
        semratelbl = new JLabel("Semi-Monthly Rate:");
        semratelbl.setBounds(10,445 , 120, 20);
        panel1.add(semratelbl);
        
        hratelbl = new JLabel("Hourly Rate:");
        hratelbl.setBounds(10,470 , 120, 20);
        panel1.add(hratelbl);

        
        
        enumtf = new JTextField();
        enumtf.setBounds(130, 20, 150, 20);
        panel1.add(enumtf);
        
        lnametf = new JTextField();
        lnametf.setBounds(130, 45, 150, 20);
        panel1.add(lnametf);
        
        fnametf = new JTextField();
        fnametf.setBounds(130, 70, 150, 20);
        panel1.add(fnametf);
        
        bdaytf = new JTextField();
        bdaytf.setBounds(130, 95, 150, 20);
        panel1.add(bdaytf);
        
        addtf = new JTextField();
        addtf.setBounds(130, 120, 360, 20);
        panel1.add(addtf);
        
        phonenumtf = new JTextField();
        phonenumtf.setBounds(130, 145, 150, 20);
        panel1.add(phonenumtf);
        
        sssnumtf = new JTextField();
        sssnumtf.setBounds(130, 170, 150, 20);
        panel1.add(sssnumtf);
        
        phnumtf = new JTextField();
        phnumtf.setBounds(130, 195, 150, 20);
        panel1.add(phnumtf);
        
        tinnumtf = new JTextField();
        tinnumtf.setBounds(130, 220, 150, 20);
        panel1.add(tinnumtf);
        
        pgnumtf = new JTextField();
        pgnumtf.setBounds(130, 245, 150, 20);
        panel1.add(pgnumtf);
        
        statustf = new JTextField();
        statustf.setBounds(130, 270, 150, 20);
        panel1.add(statustf);
        
        postf = new JTextField();
        postf.setBounds(130, 295, 150, 20);
        panel1.add(postf);
        
        suptf = new JTextField();
        suptf.setBounds(130, 320, 150, 20);
        panel1.add(suptf);
        
        basictf = new JTextField();
        basictf.setBounds(130, 345, 150, 20);
        panel1.add(basictf);
        
        ricetf = new JTextField();
        ricetf.setBounds(130,370 , 150, 20);
        panel1.add(ricetf);
        
        phonetf = new JTextField();
        phonetf.setBounds(130,395 , 150, 20);
        panel1.add(phonetf);
        
        clothtf = new JTextField();
        clothtf.setBounds(130,420 , 150, 20);
        panel1.add(clothtf);
        
        semratetf = new JTextField();
        semratetf.setBounds(130,445 , 150, 20);
        panel1.add(semratetf);
        
        hratetf = new JTextField();
        hratetf.setBounds(130,470 , 150, 20);
        panel1.add(hratetf);
        
        paylbl = new JLabel("Payroll Details");
        paylbl.setBounds(80, 20, 150, 20);
        panel2.add(paylbl);
        
        earningslbl = new JLabel("Earnings:");
        earningslbl.setBounds(10, 45, 80, 20);
        panel2.add(earningslbl);
               
        salperiodlbl = new JLabel("Salary Period:");
        salperiodlbl.setBounds(10, 70, 120, 20);
        panel2.add(salperiodlbl);
        
        salearnedlbl = new JLabel("Salary Earned:");
        salearnedlbl.setBounds(10, 95, 120, 20);
        panel2.add(salearnedlbl);
        
        rice1lbl = new JLabel("Rice Allowance:");
        rice1lbl.setBounds(10, 120, 120, 20);
        panel2.add(rice1lbl);
        
        phone1lbl = new JLabel("Phone Allowance:");
        phone1lbl.setBounds(10, 145, 120, 20);
        panel2.add(phone1lbl);
        
        cloth1lbl = new JLabel("Clothing Allowance:");
        cloth1lbl.setBounds(10, 170, 120, 20);
        panel2.add(cloth1lbl);        
       
        grosslbl = new JLabel("Gross Salary:");
        grosslbl.setBounds(10, 195, 120, 20);
        panel2.add(grosslbl);  
        
        deductionslbl = new JLabel("Deductions:");
        deductionslbl.setBounds(10, 245, 120, 20);
        panel2.add(deductionslbl);
        
        sssdeductlbl = new JLabel("SSS:");
        sssdeductlbl.setBounds(10, 270, 120, 20);
        panel2.add(sssdeductlbl);
        
        phdeductlbl = new JLabel("Philhealth:");
        phdeductlbl.setBounds(10, 295, 120, 20);
        panel2.add(phdeductlbl);
        
        pgdeductlbl = new JLabel("PAGIBIG:");
        pgdeductlbl.setBounds(10, 320, 120, 20);
        panel2.add(pgdeductlbl);
   
        
        taxdeductlbl = new JLabel("Witholding Tax:");
        taxdeductlbl.setBounds(10, 345, 120, 20);
        panel2.add(taxdeductlbl);
        
        totaldeductlbl = new JLabel("Total Deductions:");
        totaldeductlbl.setBounds(10, 370, 120, 20);
        panel2.add(totaldeductlbl);
       
        netlbl = new JLabel("Net Salary:");
        netlbl.setBounds(10, 450, 120, 20);
        panel2.add(netlbl);
        
        salperiodtf = new JTextField();
        salperiodtf.setBounds(120, 70, 150, 20);
        panel2.add(salperiodtf);
        
        salearnedtf = new JTextField();
        salearnedtf.setBounds(150, 95, 120, 20);
        panel2.add(salearnedtf);
        
              
        rice1tf = new JTextField();
        rice1tf.setBounds(150, 120, 120, 20);
        panel2.add(rice1tf);
        
        phone1tf = new JTextField();
        phone1tf.setBounds(150, 145, 120, 20);
        panel2.add(phone1tf);
        
        cloth1tf = new JTextField();
        cloth1tf.setBounds(150, 170, 120, 20);
        panel2.add(cloth1tf);
        
        grosstf = new JTextField();
        grosstf.setBounds(150, 195, 120, 20);
        panel2.add(grosstf);
        
        sssdeducttf = new JTextField();
        sssdeducttf.setBounds(150, 270, 120, 20);
        panel2.add(sssdeducttf);
        
        phdeducttf = new JTextField();
        phdeducttf.setBounds(150,295, 120, 20);
        panel2.add(phdeducttf);
        
        pgdeducttf = new JTextField();
        pgdeducttf.setBounds(150, 320, 120, 20);
        panel2.add(pgdeducttf);
        
        taxdeducttf = new JTextField();
        taxdeducttf.setBounds(150, 345, 120, 20);
        panel2.add(taxdeducttf);
        
        totaldeducttf = new JTextField();
        totaldeducttf.setBounds(150, 370, 120, 20);
        panel2.add(totaldeducttf);
        
        nettf = new JTextField();
        nettf.setBounds(150, 450, 120, 20);
        panel2.add(nettf);

        
        frame.setVisible(true);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==returnbtn){
            new Options();
            frame.dispose();
        }
        else if(e.getSource()==updatebtn){
            
            new UpdateFrame();
            frame.dispose();
        }
       
    }

   
   
}