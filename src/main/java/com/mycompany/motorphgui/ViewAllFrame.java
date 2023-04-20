/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.format;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author Cha
 */
public class ViewAllFrame implements ActionListener {
    
    JFrame frame,frame2;
    JPanel panel2;
    JTable table;
    String[] collbl;
    JScrollPane scrollpane;
    Object rowdata[][];
    JButton vmbtn,returnbtn;
    JComboBox year1cb,month1cb,day1cb,year2cb,month2cb,day2cb;
    int selectedRow;
    JLabel selectRowlbl, selectdatelbl, startlbl,endlbl,yr1lbl,m1lbl,d1lbl,yr2lbl,m2lbl,d2lbl;
    
    Data data=new Data();
    Attendance attend = new Attendance();
    Computations compute = new Computations();
    
    Object[][] getRowData(){
        rowdata = new Object[25][7];

        for(int i =0; i<25; i++){
            rowdata[i][0] = data.getempNum()[i];
            rowdata[i][1] = data.getlastName()[i];
            rowdata[i][2] = data.getfirstName()[i];
            rowdata[i][3] = data.getsssNum()[i];
            rowdata[i][4] = data.getphNum()[i];
            rowdata[i][5] = data.gettinNum()[i];
            rowdata[i][6] = data.getpgbNum()[i];

        }
        return rowdata;
    }
    
   
    
    ViewAllFrame(){
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLayout(null);  
        
        frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400, 300);
        frame2.setResizable(false);
        frame2.setLayout(null);  
        
        
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 800,180 );
        frame.add(panel2);

  
        vmbtn = new JButton("View Details and Salary");
        vmbtn.setBounds(10, 10, 180, 30);
        panel2.add(vmbtn);
        vmbtn.addActionListener(this);
        
        returnbtn = new JButton("Return to Options");
        returnbtn.setBounds(625,10,150,30);
        panel2.add(returnbtn);
        returnbtn.addActionListener(this);
        
        
        
        
        collbl =new String[]{"Employee Number","Last Name","First Name","SSS Number","Philhealth Number",
                "TIN","PAGIBIG Number"};   
        rowdata = getRowData();
        
        
        
        table = new JTable(rowdata,collbl);
       

        scrollpane = new JScrollPane(table);
        scrollpane.setBounds(10, 180, 765, 350);
        frame.getContentPane().add(scrollpane);
        
        selectdatelbl = new JLabel("Select Date for Salary Computation");
        selectdatelbl.setBounds(300, 0,300 , 20);
        panel2.add(selectdatelbl);
       
        startlbl = new JLabel("Start Date:");
        startlbl.setBounds(250, 30,80 , 20);
        panel2.add(startlbl);
        
        yr1lbl = new JLabel("Year:");
        yr1lbl.setBounds(200, 55, 80, 20);
        panel2.add(yr1lbl);    
        
        m1lbl = new JLabel("Month:");
        m1lbl.setBounds(200, 80, 80, 20);
        panel2.add(m1lbl);
        
        d1lbl = new JLabel("Day:");
        d1lbl.setBounds(200, 105, 80, 20);
        panel2.add(d1lbl);
        
        
        String[] yr = {"None","2022"};
        year1cb = new JComboBox(yr);
        year1cb.setBounds(270, 55, 80, 20);
        panel2.add(year1cb);
        
        
        String[] m = {"None","09","10","11","12"};
        month1cb = new JComboBox(m);
        month1cb.setBounds(270, 80, 80, 20);
        panel2.add(month1cb);   
        
        String[] d = {"None","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15",
                       "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        day1cb = new JComboBox(d);
        day1cb.setBounds(270, 105, 80, 20);
        panel2.add(day1cb);
       
        
        endlbl = new JLabel("End Date:");
        endlbl.setBounds(500, 30,80 , 20);
        panel2.add(endlbl);
        
        yr2lbl = new JLabel("Year:");
        yr2lbl.setBounds(450, 55, 80, 20);
        panel2.add(yr2lbl);       
        
        
        m2lbl = new JLabel("Month:");
        m2lbl.setBounds(450, 80, 80, 20);
        panel2.add(m2lbl);
        
        
        d2lbl = new JLabel("Day:");
        d2lbl.setBounds(450, 105, 80, 20);
        panel2.add(d2lbl);
        
        selectRowlbl = new JLabel("Select Employee in Table");
        selectRowlbl.setBounds(320,150,300,20);
        panel2.add(selectRowlbl);
        
       
        year2cb = new JComboBox(yr);
        year2cb.setBounds(520, 55, 80, 20);
        panel2.add(year2cb);
        
        

        
        month2cb = new JComboBox(m);
        month2cb.setBounds(520, 80, 80, 20);
        panel2.add(month2cb);   
        
  

        
        day2cb = new JComboBox(d);
        day2cb.setBounds(520, 105, 80, 20);
        panel2.add(day2cb);
        
      
        
        frame.setVisible(true);
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel model = table.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                              
               ListSelectionModel lsm = (ListSelectionModel) e.getSource();
               selectedRow=lsm.getMinSelectionIndex(); 
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vmbtn){
            if(table.getSelectionModel().isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "No selected row.");
                
            }
            else if(!table.getSelectionModel().isSelectionEmpty()){
                int n = selectedRow;
                ViewMoreFrame vm =new ViewMoreFrame();
                
                vm.enumtf.setText(String.valueOf(data.getempNum()[n]));
                vm.lnametf.setText(data.getlastName()[n]);
                vm.fnametf.setText(data.getfirstName()[n]);
                vm.bdaytf.setText(data.getbirthday()[n]);
                vm.addtf.setText(data.getaddress()[n]);
                vm.phonenumtf.setText(data.getphoneNum()[n]);
                vm.sssnumtf.setText(data.getsssNum()[n]);
                vm.phnumtf.setText(data.getphNum()[n]);
                vm.tinnumtf.setText(data.gettinNum()[n]);
                vm.pgnumtf.setText(data.getpgbNum()[n]);
                vm.statustf.setText(data.getstatus()[n]);
                vm.postf.setText(data.getposition()[n]);
                vm.suptf.setText(data.getsup()[n]);
                vm.basictf.setText(String.valueOf(format("%.2f",data.getsal()[n])));
                vm.ricetf.setText(String.valueOf(data.getrice()[n]));
                vm.phonetf.setText(String.valueOf(data.getphone()[n]));
                vm.clothtf.setText(String.valueOf(data.getcloth()[n]));
                vm.semratetf.setText(String.valueOf(format("%.2f",data.getsal()[n]/2)));
                vm.hratetf.setText(String.valueOf(format("%.2f",data.getsal()[n]/(21*8))));
                
                String sdate = month1cb.getSelectedItem()+"/"+day1cb.getSelectedItem()+"/"+
                               year1cb.getSelectedItem();
                String edate = month2cb.getSelectedItem()+"/"+day2cb.getSelectedItem()+"/"+
                               year2cb.getSelectedItem();
                vm.salperiodtf.setText(sdate+" to "+edate);
            try{
                
                float h = attend.computeHours(n, sdate, edate);
                
                vm.salearnedtf.setText(String.valueOf(format("%.2f",(data.getsal()[n]/(21*8))*h)));
                vm.rice1tf.setText(String.valueOf(data.getrice()[n]));
                vm.phone1tf.setText(String.valueOf(data.getrice()[n]));
                vm.cloth1tf.setText(String.valueOf(data.getcloth()[n]));
                vm.grosstf.setText(String.valueOf(format("%.2f",compute.computegs(n, h))));
                
                vm.sssdeducttf.setText(String.valueOf(format("%.2f",compute.computesss(n))));
                vm.sssdeducttf.setText(String.valueOf(format("%.2f",compute.computesss(n))));
                vm.phdeducttf.setText(String.valueOf(format("%.2f",compute.computeph(n))));
                vm.pgdeducttf.setText(String.valueOf(format("%.2f",compute.computepg(n))));
                vm.taxdeducttf.setText(String.valueOf(format("%.2f",compute.computetax(n))));
                vm.totaldeducttf.setText(String.valueOf(format("%.2f",compute.computeTotalDeduction(n))));
            
                vm.nettf.setText(String.valueOf(format("%.2f",compute.computenet(n, h))));
            }
            catch(Exception e2){
                JOptionPane.showMessageDialog(null, "Date is invalid. Try Again.", "", JOptionPane.ERROR_MESSAGE);
                month1cb.setSelectedItem(0);
                day1cb.setSelectedIndex(0);
                year1cb.setSelectedIndex(0);
                month1cb.setSelectedIndex(0);
                day2cb.setSelectedIndex(0);
                year2cb.setSelectedIndex(0);
                
            }
       
                frame.dispose();
            } 
            
        }
        else if(e.getSource()==returnbtn) {
                new Options();
                frame.dispose();
        }
    }
    
   
}


