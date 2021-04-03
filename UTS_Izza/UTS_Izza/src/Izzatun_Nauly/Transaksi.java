/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Izzatun_Nauly;

/**
 *
 * @author lenovo
 */
public class Transaksi {
    
   public double saldo;
   public double saldoAwal;
   public double saldoAkhir;
   public String tanggalTransaksi;
   public String type;
   
   public Transaksi(double a, double b, double c, String d, String e){
       saldo = a;
       saldoAwal = b;
       saldoAkhir = b;
       tanggalTransaksi = d;
       type = e;
   }
   void tampil(){
       System.out.println("saldo = " + saldo);
       System.out.println("Saldo Awal = "+ saldoAwal);
       System.out.println("Saldo Akhir = " + saldoAkhir);
       System.out.println("Tanggal Transaksi = "+ tanggalTransaksi);
       System.out.println("Type = " + type);
   }
   Transaksi(){
       
   }
}
