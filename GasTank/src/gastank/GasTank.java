/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gastank;

/**
 *
 * @author Joseph
 */
 class GasTankk{
 double amount=0;
 
 void addGas(double litre){
if(litre!=0){
amount=litre*80;
}
}  
 
 double useGas(double usage){
     amount=amount-usage;
     return amount;
 }

 public double getGasLevel(){
      return amount;
}

}



public class GasTank {
 public static void main(String[] args) {
       GasTankk g=new GasTankk();
       g.addGas(2.0f);
       System.out.println(g.getGasLevel()+" rupees for adding gas");
       g.useGas(1.2f);
       System.out.println(g.getGasLevel()+" rupees for using gas");
 }
    
}
