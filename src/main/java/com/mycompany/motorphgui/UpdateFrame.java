/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cha
 */
public class UpdateFrame implements ActionListener{
    JFrame frame;
    JPanel panel1,panel2;
    JButton savebtn,returnbtn;
    
    
    JLabel enumlbl,lnamelbl,fnamelbl,bdaylbl,addlbl,phonenumlbl,sssnumlbl,phnumlbl,
           tinnumlbl,pgnumlbl,statuslbl,poslbl,suplbl,basiclbl,ricelbl,phonelbl,clothlbl,semratelbl,
           hratelbl;
   
    JTextField enumtf,lnametf,fnametf,bdaytf,addtf,phonenumtf,sssnumtf,phnumtf,
           tinnumtf,pgnumtf,statustf,postf,suptf,basictf,ricetf,phonetf,clothtf,semratetf,
           hratetf;
    
    UpdateFrame(){
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 520, 600);
        frame.add(panel1);
        
        savebtn = new JButton("Save Changes");
        savebtn.setBounds(10,10,150,30);
        panel1.add(savebtn);
        savebtn.addActionListener(this);
        
        returnbtn = new JButton("Return to Options");
        returnbtn.setBounds(345,10,150,30);
        panel1.add(returnbtn);
        returnbtn.addActionListener(this);
        
        
         
        enumlbl = new JLabel("Employee Number:");
        enumlbl.setBounds(10,75 , 120, 20);
        panel1.add(enumlbl);
        
        lnamelbl = new JLabel("Last Name:");
        lnamelbl.setBounds(10,100 , 120, 20);
        panel1.add(lnamelbl);
        
        fnamelbl = new JLabel("First Name:");
        fnamelbl.setBounds(10,125 , 120, 20);
        panel1.add(fnamelbl);
        
        bdaylbl = new JLabel("Birthday:");
        bdaylbl.setBounds(10,150 , 120, 20);
        panel1.add(bdaylbl);
        
        addlbl = new JLabel("Address:");
        addlbl.setBounds(10,175 , 120, 20);
        panel1.add(addlbl);
        
        phonenumlbl = new JLabel("Phone Number:");
        phonenumlbl.setBounds(10,200 , 120, 20);
        panel1.add(phonenumlbl);
        
        sssnumlbl = new JLabel("SSS Number:");
        sssnumlbl.setBounds(10,225 , 120, 20);
        panel1.add(sssnumlbl);
        
        phnumlbl = new JLabel("Philhealth Number:");
        phnumlbl.setBounds(10,250 , 120, 20);
        panel1.add(phnumlbl);
        
        tinnumlbl = new JLabel("TIN:");
        tinnumlbl.setBounds(10,275 , 120, 20);
        panel1.add(tinnumlbl);
        
        pgnumlbl = new JLabel("PAGIBIG Number:");
        pgnumlbl.setBounds(10,300 , 120, 20);
        panel1.add(pgnumlbl);
        
        statuslbl = new JLabel("Status:");
        statuslbl.setBounds(10,325 , 120, 20);
        panel1.add(statuslbl);
        
        poslbl = new JLabel("Position:");
        poslbl.setBounds(10,350 , 120, 20);
        panel1.add(poslbl);
        
        suplbl = new JLabel("Supervisor:");
        suplbl.setBounds(10,375 , 120, 20);
        panel1.add(suplbl);
        
        basiclbl = new JLabel("Basic Salary:");
        basiclbl.setBounds(10,400 , 120, 20);
        panel1.add(basiclbl);
        
        ricelbl = new JLabel("Rice Allowance:");
        ricelbl.setBounds(10,425 , 120, 20);
        panel1.add(ricelbl);
        
        phonelbl = new JLabel("Phone Allowance:");
        phonelbl.setBounds(10,450 , 120, 20);
        panel1.add(phonelbl);
        
        clothlbl = new JLabel("Clothing Allowance:");
        clothlbl.setBounds(10,475 , 120, 20);
        panel1.add(clothlbl);
        
        semratelbl = new JLabel("Semi-Monthly Rate:");
        semratelbl.setBounds(10,500 , 120, 20);
        panel1.add(semratelbl);
        
        hratelbl = new JLabel("Hourly Rate:");
        hratelbl.setBounds(10,525 , 120, 20);
        panel1.add(hratelbl);

        
        
        enumtf = new JTextField();
        enumtf.setBounds(130, 75, 150, 20);
        panel1.add(enumtf);
        
        lnametf = new JTextField();
        lnametf.setBounds(130, 100, 150, 20);
        panel1.add(lnametf);
        
        fnametf = new JTextField();
        fnametf.setBounds(130, 125, 150, 20);
        panel1.add(fnametf);
        
        bdaytf = new JTextField();
        bdaytf.setBounds(130, 150, 150, 20);
        panel1.add(bdaytf);
        
        addtf = new JTextField();
        addtf.setBounds(130, 175, 360, 20);
        panel1.add(addtf);
        
        phonenumtf = new JTextField();
        phonenumtf.setBounds(130, 200, 150, 20);
        panel1.add(phonenumtf);
        
        sssnumtf = new JTextField();
        sssnumtf.setBounds(130, 225, 150, 20);
        panel1.add(sssnumtf);
        
        phnumtf = new JTextField();
        phnumtf.setBounds(130, 250, 150, 20);
        panel1.add(phnumtf);
        
        tinnumtf = new JTextField();
        tinnumtf.setBounds(130, 275, 150, 20);
        panel1.add(tinnumtf);
        
        pgnumtf = new JTextField();
        pgnumtf.setBounds(130, 300, 150, 20);
        panel1.add(pgnumtf);
        
        statustf = new JTextField();
        statustf.setBounds(130, 325, 150, 20);
        panel1.add(statustf);
        
        postf = new JTextField();
        postf.setBounds(130, 350, 150, 20);
        panel1.add(postf);
        
        suptf = new JTextField();
        suptf.setBounds(130, 375, 150, 20);
        panel1.add(suptf);
        
        basictf = new JTextField();
        basictf.setBounds(130, 400, 150, 20);
        panel1.add(basictf);
        
        ricetf = new JTextField();
        ricetf.setBounds(130,425 , 150, 20);
        panel1.add(ricetf);
        
        phonetf = new JTextField();
        phonetf.setBounds(130,450 , 150, 20);
        panel1.add(phonetf);
        
        clothtf = new JTextField();
        clothtf.setBounds(130,475 , 150, 20);
        panel1.add(clothtf);
        
        semratetf = new JTextField();
        semratetf.setBounds(130,500 , 150, 20);
        panel1.add(semratetf);
        
        hratetf = new JTextField();
        hratetf.setBounds(130,525 , 150, 20);
        panel1.add(hratetf);

        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==savebtn){
            String csvfile = "MotorPH Employee Data.csv";
            try {
                CSVReader csvreader = new CSVReader(new FileReader(csvfile));
                
                boolean employeeNumFound = false;
                
                String[] updated=new String[19];
                String empnum = enumtf.getText();       
                        
                String line[];
                while((line=csvreader.readNext())!=null){
                    if(line[0].equals(enumtf.getText())){
                        updated[0]=enumtf.getText();
                        updated[1]=lnametf.getText();
                        updated[2]=fnametf.getText();
                        updated[3]=bdaytf.getText();
                        updated[4]=addtf.getText();
                        updated[5]=phonenumtf.getText();
                        updated[6]=sssnumtf.getText();
                        updated[7]=phnumtf.getText();
                        updated[8]=tinnumtf.getText();
                        updated[9]=pgnumtf.getText();
                        updated[10]=statustf.getText();
                        updated[11]=postf.getText();
                        updated[12]=suptf.getText();
                        updated[13]=basictf.getText();
                        updated[14]=ricetf.getText();
                        updated[15]=phonetf.getText();
                        updated[16]=clothtf.getText();
                        updated[17]=semratetf.getText();
                        updated[18]=hratetf.getText();
                        
                        employeeNumFound = true;
                        break;
                    }
                }
                csvreader.close();
                
                if(employeeNumFound){
                    CSVWriter csvwriter = new CSVWriter(new FileWriter(csvfile+".tmp"));
                    csvreader = new CSVReader(new FileReader(csvfile));
                    
                    while((line=csvreader.readNext())!=null){
                        if(line[0].equals(enumtf.getText())){
                            System.arraycopy(updated, 0, line, 0, 19);
                        }
                        csvwriter.writeNext(line);
                    }
                    
                    csvreader.close();
                    csvwriter.close();
                    
                    new File(csvfile).delete();
                    new File(csvfile+".tmp").renameTo(new File(csvfile));
                    
                    JOptionPane.showMessageDialog(null, "Records are updated.");
                    new Options();
                    frame.dispose();
                }
                
                
                
                
                
                
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UpdateFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UpdateFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(e.getSource()==returnbtn){
            new Options();
            frame.dispose();
        }
    }
    
    
}
