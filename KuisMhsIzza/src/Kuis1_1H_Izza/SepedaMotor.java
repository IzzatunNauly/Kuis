/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H_Izza;

/**
 *
 * @author lenovo
 */
public class SepedaMotor {
    public String merk;
    public boolean kontakMotor;
    public int kecepatanMotor;
    
    SepedaMotor(){
        
    }
    
   SepedaMotor(String merk){
        System.out.println("Pilih Merk");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.println("3. Ducati");
        System.out.println("4. Suzuki");
   }
    void nyalakanMotor(boolean kontakMotor){
      
    }
    void matikanMotor(boolean kontakMotor){
        
    }
    void tambahKecepatanMotor(int kecepatanMotor){
        kecepatanMotor = kecepatanMotor + 5;
    }
    void kurangiKecepatanMotor(int kecepatanMotor){
        kecepatanMotor = kecepatanMotor - 5;
    }
    void info(){
        
    }
}

