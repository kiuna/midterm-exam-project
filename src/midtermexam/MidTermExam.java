/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author Sam
 */
public class MidTermExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mass = 6.9;
          double  height = 1.0;
   double weight = 60.5;
  System.out.println(60.5/1.0+ "BMI=");
   for(double i=0.0; i<3.0; i++){
       
       height++;
       weight++;
       
       if (getBMI(weight, height)>25){
           System.out.println(getBMI(weight, height)+" is overweight");
       
           
            if (getBMI(weight, height)>18.5){
           System.out.println(getBMI(weight, height)+" is underweight");
           
           
            if (getBMI(weight, height)>24.9){
           System.out.println(getBMI(weight, height)+" is healthy");
       }
       }
   }
    
    
    
    }
    }
    
    public static double getBMI(double w, double h)        
            
    {
    
        double bmi = w/h; 
        
        return bmi;
        
    }
    
}
  


   
    
    
    

