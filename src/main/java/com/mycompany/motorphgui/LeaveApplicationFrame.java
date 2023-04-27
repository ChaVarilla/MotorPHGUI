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
import javax.swing.*;

/**
 *
 * @author Cha
 */
public class LeaveApplicationFrame implements ActionListener {
    JFrame frame;
    JLabel tablelbl, datelbl,leavelbl, empNumlbl,typelbl,dayslbl,startlbl,yr1lbl,m1lbl,d1lbl,
           endlbl,yr2lbl,m2lbl,d2lbl;
    JTable leavetable;
    JPanel panel1;
    JScrollPane scrollpane;
    Object[][] data;
    JTextField empNumtf,datetf;
    JComboBox leavecb, daycb,y1cb,m1cb,d1cb, y2cb,m2cb,d2cb;
    JButton returnbtn,applybtn;
    
    public Object[][] getRowData() throws FileNotFoundException, IOException{
        String csvfile = "Remaining_Leave.csv";
        CSVReader csvreader = new CSVReader(new FileReader(csvfile));
        
        data =new Object[25][6];
        String[] line;
        
        int i=0;
        while((line = csvreader.readNext())!=null){
            data[i]=line;   
            i++;
        }
        return data;
    }
    
    
    LeaveApplicationFrame() throws IOException{
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        
        tablelbl = new JLabel("Remaining Leaves of All Employees");
        tablelbl.setBounds(300, 10, 300, 20);
        frame.getContentPane().add(tablelbl);
        
        
        String[] collbl={"Employee Number","Last Name","First Name","Sick Leave","Vacation Leave",
                        "Emergency Leave"};
        data = getRowData();
        
        leavetable = new JTable(data,collbl);
        
        scrollpane = new JScrollPane(leavetable);
        scrollpane.setBounds(10, 30, 770, 250);
        frame.add(scrollpane);
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 280, 800, 370);
        frame.add(panel1);
        
        leavelbl = new JLabel("Leave Details:");
        leavelbl.setBounds(20, 0, 150, 20);
        panel1.add(leavelbl);
        
        datelbl = new JLabel("Date Filed:");
        datelbl.setBounds(20, 30, 150, 20);
        panel1.add(datelbl);
        
        empNumlbl = new JLabel("Employee Number: ");
        empNumlbl.setBounds(20, 70, 120, 20);
        panel1.add(empNumlbl);
        
        typelbl = new JLabel("Type of Leave:");
        typelbl.setBounds(20, 110, 120, 20);
        panel1.add(typelbl);
        
        dayslbl = new JLabel("Number of Days:");
        dayslbl.setBounds(20, 150, 120, 20);
        panel1.add(dayslbl);
        
        
        datetf = new JTextField();
        datetf.setBounds(140, 30, 120, 20);
        panel1.add(datetf);
        
        empNumtf = new JTextField();
        empNumtf.setBounds(140, 70, 120, 20);
        panel1.add(empNumtf);
        
        String[] leavetypes = {"Sick Leave","Vacation Leave","Emergency Leave"};
        leavecb = new JComboBox(leavetypes);
        leavecb.setBounds(140, 110, 120, 20);
        panel1.add(leavecb);
        
        String[] numdays ={"1","2","3","4","5","6","7","8","9","10"};
        
        daycb = new JComboBox(numdays);
        daycb.setBounds(140, 150, 120, 20);
        panel1.add(daycb);
        
        startlbl = new JLabel("Start Date of Leave:");
        startlbl.setBounds(350, 60, 120, 20);
        panel1.add(startlbl);
        
        endlbl = new JLabel("End Date of Leave:");
        endlbl.setBounds(600, 60, 120, 20);
        panel1.add(endlbl);
        
        
        yr1lbl = new JLabel("Year:");
        yr1lbl.setBounds(350, 90, 50, 20);
        panel1.add(yr1lbl);
        
        yr2lbl = new JLabel("Year:");
        yr2lbl.setBounds(600, 90, 50, 20);
        panel1.add(yr2lbl);
        
        m1lbl = new JLabel("Month:");
        m1lbl.setBounds(350, 115, 50, 20);
        panel1.add(m1lbl);
        
        m2lbl = new JLabel("Month:");
        m2lbl.setBounds(600, 115, 50, 20);
        panel1.add(m2lbl);
        
        d1lbl = new JLabel("Date:");
        d1lbl.setBounds(350, 140, 50, 20);
        panel1.add(d1lbl);
        
        d2lbl = new JLabel("Date:");
        d2lbl.setBounds(600, 140, 50, 20);
        panel1.add(d2lbl);
        
        String[] yr = {"2023","2024"};
        y1cb = new JComboBox(yr);
        y1cb.setBounds(400, 90, 100, 20);
        panel1.add(y1cb);
        
        y2cb = new JComboBox(yr);
        y2cb.setBounds(650, 90, 100, 20);
        panel1.add(y2cb);
        
        String[] m = {"January","February","March","April","May","June","July","August",
                      "September","October","November","December"};
        
        m1cb = new JComboBox(m);
        m1cb.setBounds(400, 115, 100, 20);
        panel1.add(m1cb);
        
        m2cb = new JComboBox(m);
        m2cb.setBounds(650, 115, 100, 20);
        panel1.add(m2cb);
        
        String[] d = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                       "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        d1cb = new JComboBox(d);
        d1cb.setBounds(400, 140, 100, 20);
        panel1.add(d1cb);
        
        d2cb = new JComboBox(d);
        d2cb.setBounds(650, 140, 100, 20);
        panel1.add(d2cb);
        
        returnbtn = new JButton("Return to Options");
        returnbtn.setBounds(20,200, 150, 30);
        panel1.add(returnbtn);
        returnbtn.addActionListener(this);
        
        applybtn = new JButton("File Leave");
        applybtn.setBounds(600, 200, 150, 30);
        panel1.add(applybtn);
        applybtn.addActionListener(this);
        
        
        
        
        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==returnbtn){
            new Options();
            frame.dispose();
        }
        else if(e.getSource()==applybtn){
            try {
                String lastname=null,firstname=null,remainsl=null,remainvl=null,remainel=null;
                String csvfile = "Remaining_Leave.csv";
                
                CSVReader csvreader = new CSVReader(new FileReader(csvfile));
                CSVWriter csvwriter = new CSVWriter(new FileWriter(csvfile+".tmp"));
                String[] line;
                
                while((line=csvreader.readNext())!=null){
                    if(empNumtf.getText().equals(line[0])){
                        lastname = line[1];
                        firstname=line[2];
                        remainsl = line[3];
                        remainvl=line[4];
                        remainel=line[5];
                        
                        if(leavecb.getSelectedItem().equals("Sick Leave")){
                            int sl=Integer.parseInt(line[3])-Integer.parseInt(String.valueOf(daycb.getSelectedItem()));
                            line[3] = String.valueOf(sl);
                            remainsl = line[3];
                        }
                        else if(leavecb.getSelectedItem().equals("Vacation Leave")){
                            int vl=Integer.parseInt(line[4])-Integer.parseInt(String.valueOf(daycb.getSelectedItem()));
                            line[4] =String.valueOf(vl);
                            remainvl =line[4];
                        }
                        else if(leavecb.getSelectedItem().equals("Emergency Leave")){
                            int el=Integer.parseInt(line[5])-Integer.parseInt(String.valueOf(daycb.getSelectedItem()));
                            line[5]=String.valueOf(el);
                            remainel = line[5];
                        }
                    }
                    csvwriter.writeNext(line);
                }
                csvwriter.close();
                csvreader.close();
                
                new File(csvfile).delete();
                new File(csvfile+".tmp").renameTo(new File(csvfile));
                        
                
                
                csvwriter = new CSVWriter(new FileWriter("Leave_Application.csv"));
                
                String[] line1 = {"Date Filed:",datetf.getText()};
                String[] line2 = {"Employee Number:",empNumtf.getText()};
                String[] line3 = {"Last Name:",lastname};
                String[] line4 = {"First Name:",firstname};
                String[] line5 = {"Type of Leave Applied:",String.valueOf(leavecb.getSelectedItem())};
                String[] line6 = {"Number of Days:",String.valueOf(daycb.getSelectedItem())};
                String[] line7 = {"Start Date:",(String.valueOf(m1cb.getSelectedItem())+" "+
                                  String.valueOf(d1cb.getSelectedItem())+ ", "+
                                  String.valueOf(y1cb.getSelectedItem()))};
                String[] line8 = {"End Date:",(String.valueOf(m2cb.getSelectedItem())+" "+
                                  String.valueOf(d2cb.getSelectedItem())+ ", "+
                                  String.valueOf(y2cb.getSelectedItem()))};  
                String[] line9 = {"Application Status:","Approved"};
                String[] line10 ={"Remarks:",""};
                String[] line11 ={"Remaining Sick Leave:",remainsl};
                String[] line12 ={"Remaining Vacation Leave",remainvl};
                String[] line13 ={"Remaining Emergency Leave:",remainel};
                
                csvwriter.writeNext(line1);
                csvwriter.writeNext(line2);
                csvwriter.writeNext(line3);
                csvwriter.writeNext(line4);
                csvwriter.writeNext(line5);
                csvwriter.writeNext(line6);
                csvwriter.writeNext(line7);
                csvwriter.writeNext(line8);
                csvwriter.writeNext(line9);
                csvwriter.writeNext(line10);
                csvwriter.writeNext(line11);
                csvwriter.writeNext(line12);
                csvwriter.writeNext(line13);
                
                csvwriter.close();
                

                JOptionPane.showMessageDialog(null,"Leave Application is Submitted. Check the generated copy.");
                new Options();
                frame.dispose();
                
                
            } catch (IOException ex) {
                Logger.getLogger(LeaveApplicationFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        
    }
}
