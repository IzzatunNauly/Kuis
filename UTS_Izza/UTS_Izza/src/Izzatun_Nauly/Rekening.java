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
public class Rekening {
    
    public String noRekening;
    public String namaAwal;
    public String namaAkhir;
    public String Phone;
    public String Email;

    Rekening(){
        
    }
    
    public void Rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        namaAwal = b;
        namaAkhir = c;
        Phone = d;
        Email = e;
    }
    void tampil(){
        System.out.println("no Rekening = " + noRekening);
        System.out.println("nama Awal = " + namaAwal);
        System.out.println("nama Akhir = "+ namaAkhir);
        System.out.println("Phone = " + Phone);
        System.out.println("Email = " + Email);
    }
}
