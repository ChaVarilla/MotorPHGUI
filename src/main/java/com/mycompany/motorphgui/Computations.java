/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgui;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.String.format;
import java.text.ParseException;


/**
 *
 * @author Cha
 */
public class Computations {
    Data data = new Data();
    

    public double computesss(int n) throws FileNotFoundException, IOException{
        double sss;// if-elseif-else statement is to check the category of the salary  
        
        CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
        String[] line;
        String m = String.valueOf(n+10001);
        
        float sal =0;
        while((line=csvreader.readNext())!=null){
           if(m.equals(line[0])){
                sal = Float.parseFloat(line[13]);
                break;
           }
        }   
        
            if(sal<=3250){
                sss = 135;
            }
            else if(sal>3250 & sal<=24750) {
               if(sal%1000==250 |sal%1000==750 ){// this check whether the salary is in the lower/upper bound of range. 
                   float mod = (sal-3250)%500; // after deducting 3250, in every 500 increment, the sss increases by 22.5
                    float multiplier = ((sal-3250-mod)/500);              
                    sss = 22.5*(multiplier)+135;                        
               }
                else{// this applies the normal formule is salary falls within the range
                    float mod = (sal-3250)%500; 
                    float multiplier = ((sal-3250-mod)/500);              
                    sss = 22.5*(multiplier+1)+135;           
               }
            }
            else{
                sss = 1125;
            }
            csvreader.close();
            return sss;  
    }
    public double computeph(int n) throws IOException{
           double ph;

           CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
           String[] line;
           String m = String.valueOf(n+10001);

            float sal =0;
            while((line=csvreader.readNext())!=null){
               if(m.equals(line[0])){
                    sal = Float.parseFloat(line[13]);
                    break;
               }
            }   
          
           if(sal<=10000){//if-elseif-else statement checks the range of salary and applies formula in each range
               ph = 300/2;
           }
           else if (sal>10000 & sal<60000){
               ph = sal*(0.03)/2;
           }
           else{
               ph = 1800/2;
           }
           csvreader.close();
           return ph;
    }
    
    public double computepg(int n) throws FileNotFoundException, IOException{
        double pagibig;

        CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
        String[] line;
        String m = String.valueOf(n+10001);
        
        float sal =0;
        while((line=csvreader.readNext())!=null){
           if(m.equals(line[0])){
                sal = Float.parseFloat(line[13]);
                break;
           }
        }   
        
        if(sal>1000 & sal<=1500){//if-else statement checks the range of salary and applies formula in each rang
            pagibig = sal*(float)0.01;
        } 
        else{
            if(sal*0.02 <100){// this nested if-else statement provides the pagibig to be 100 if the values exceeds 100
              pagibig= sal*(float)0.02;
            }
            else{
                pagibig = 100;
            }
        }
        csvreader.close();
        return pagibig;    
    }
    public double computetaxable(int n) throws IOException{
                
       CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
       String[] line;
       String m = String.valueOf(n+10001);

        float sal =0;
        while((line=csvreader.readNext())!=null){
           if(m.equals(line[0])){
                sal = Float.parseFloat(line[13]);
                break;
           }
        }   

        
        double taxable = sal-computesss(n)-computepg(n)-computeph(n);// saves all the deduction to get taxable income and save to variable taxable
        
        csvreader.close();
        return taxable;
    }
    public float computetax(int n) throws FileNotFoundException, IOException{
           double tax;
           
           CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
           String[] line;
           String m = String.valueOf(n+10001);

            float sal =0;
            while((line=csvreader.readNext())!=null){
               if(m.equals(line[0])){
                    sal = Float.parseFloat(line[13]);
                    break;
               }
            }   

            if(sal <=20832){//if-elseif-else statement checks the range of taxable income and applies formula in each range 
                tax = 0;
            }
            else if(sal>20832 & sal<33333){
                tax = (computetaxable(n)-20833)*0.2;               
            }
            else if(sal>=33333 & sal< 66667){
                tax = (computetaxable(n)-33333)*0.25+2500;
            }
            else if(sal>=66667 & sal< 166667){
                tax = (computetaxable(n)-66667)*0.3+10833;
            }
            else if(sal>=166667 & sal< 666667){
                tax = (computetaxable(n)-166667)*0.32+40833.33;
            }
            else{
                tax = (sal-666667)*0.35+200833.33;
            }
           
            csvreader.close();
            return (float) 
                    tax;
    }
    
    public float computeTotalDeduction(int n) throws IOException{

        float td = (float)(computesss(n)+computeph(n)+computepg(n)+computetax(n));
        return td;
    }
    
    public float computeTotalBenefits(int n) throws FileNotFoundException, IOException{
           CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
           String[] line;
           String m = String.valueOf(n+10001);

            float rice =0;
            float phone =0;
            float cloth =0;
            
            while((line=csvreader.readNext())!=null){
               if(m.equals(line[0])){
                    rice = Float.parseFloat(line[14]);
                    phone= Float.parseFloat(line[15]);
                    cloth= Float.parseFloat(line[16]);
                    break;
               }
            }   
        float tb = rice+phone+cloth;
        
        csvreader.close();
        return tb;
        
    }
    
   
    public float computegs(int n, float hw) throws ParseException, IOException{
       CSVReader csvreader = new CSVReader(new FileReader("MotorPH Employee Data.csv"));
       String[] line;
       String m = String.valueOf(n+10001);

        float sal =0;

        while((line=csvreader.readNext())!=null){
           if(m.equals(line[0])){
                sal = Float.parseFloat(line[13]);
                break;
           }
        }   

        float gs = (sal/(21*8))*hw;
        csvreader.close();
        return gs;
    }

     public float computenet(int n,float hw) throws ParseException, IOException{
        
        float net = computegs(n,hw)+computeTotalBenefits(n)-computeTotalDeduction(n);
        return net;
    }
    
    
    public String printPayslip(int n,String sd, String ed, float hw) throws ParseException, IOException{
        String s = 
       
        "\n"+
        "                                                                 PAYSLIP\n"+
        "==================================================================================================\n"+        
        "Name:   \t"+data.getlastName()[n]+","+data.getfirstName()[n]+"\n"+
        "Position:   \t"+data.getposition()[n]+"\n"+
        "Basic Salary: \t"+data.getsal()[n]+"\n"+
        "Salary Period: "+sd+" to "+ed+"\n"+
        "=================================================================================================="+
        "\n                                                               EARNINGS\n"+
        "(Note: Salary Earned is temporarily based on hourly rate)\n\n"+
        "Salary Earned for the Period: "+format("%.2f",computegs(n,hw))+"\n\n"+
        
        "Benefits\n"+
        "Rice Subsidy:\t        "+data.getrice()[n]+"\n"+
        "Phone Allowance:  "+data.getphone()[n]+"\n"+ 
        "Clothing Allowance:"+data.getcloth()[n]+"\n\n"+
        "Gross Salary: "+format("%.2f",computegs(n,hw)+computeTotalBenefits(n))+"\n"+
        "==================================================================================================\n"+        
        "                                                                 DEDUCTIONS\n"+
        "Government Deductions\n"+
        "SSS:\t"+format("%.2f",computesss(n))+"\n"+
        "Philhealth:\t"+format("%.2f",computeph(n))+"\n"+
        "Pag-IBIG:\t"+format("%.2f",computepg(n))+"\n\n"+
        "Taxable Income: "+format("%.2f",computetaxable(n))+"\n"+
        "Withholding Tax: "+format("%.2f",computetax(n))+"\n\n"+
        "Total Deductions: "+format("%.2f",computeTotalDeduction(n))+"\n"+
        "==================================================================================================\n"+
        "Net Salary:\t"+format("%.2f",computenet(n,hw))+"\n"+
        "====================================================================================================";
        
        return s;
             
    }  
    
}
