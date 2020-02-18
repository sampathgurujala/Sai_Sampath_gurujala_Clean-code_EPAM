import java.lang.*;
public class MyClass {
public static double simpleIntrest(double principal_amt,double rate,double time_period)
 {
     double si=principal_amt*time_period*rate/100;
     return si;
 }
 public static double compoundInterest(double principal_amt,double rate,double time_period,double times_intrest_applied)
 {  double cmpnd_amt=principal_amt*(Math.pow((1+(rate)/times_intrest_applied), time_period*times_intrest_applied));
     double ci=cmpnd_amt-principal_amt;
     return ci;
 }
 public static double estimator(String material_standard,double area_of_house,Boolean automated_type)
    {  
        double price_estimate=0;
            material_standard=material_standard.toLowerCase();
            if(material_standard.compareTo("standard")==0)
            {
               price_estimate= area_of_house*1200;
            }else if(material_standard.compareTo("above standard")==0)
            {
                price_estimate=area_of_house*1500;
            }else if(material_standard.compareTo("high standard")==0  )
            {    if(automated_type)
                price_estimate=area_of_house*2500;
                else
                price_estimate=area_of_house*1800;
            }
            return price_estimate;
    }
   
}


