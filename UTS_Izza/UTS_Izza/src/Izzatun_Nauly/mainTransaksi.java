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
import java.util.Scanner;
public class mainTransaksi {
    static Scanner sc = new Scanner(System.in);
    static int menuUtama(){
        int menu;
        System.out.println("==========================================================================");
        System.out.println("\t\t\t         MENU UTAMA");
        System.out.println("==========================================================================");
        System.out.println("1. Tampilkan Data Rekening ");
        System.out.println("2. Tampilkan Data Transaksi");
        System.out.println("3. Mencari Saldo > 500.000");
        System.out.println("4. Sorting By Name");
        System.out.println("5. Keluar");
        System.out.println("==========================================================================");
        System.out.print("Pilih Menu \t\t: ");
        menu = sc.nextInt();
        return menu;
        }
    
    public static void main(String[] args) {
               String ulang;
                int z = 0;
        do{
            int x = menuUtama();
            if (x == 1){ 
                Rekening b1 = new Rekening();
                b1.noRekening = "160309273084";
                b1.namaAwal = "Aruffin";
                b1.namaAkhir = "bin Abdul Salam";
                b1.Phone = "14582643263";
                b1.Email = "ligula.Nullam@tacitisociosqu.edu";
                b1.tampil();
                
                Rekening b2 = new Rekening();
                b2.noRekening = "169712042416";
                b2.namaAwal = "Mohammad";
                b2.namaAkhir = "Al Hafeezy";
                b2.Phone = "16834168323";
                b2.Email = "ut.pellentesque@luctusutpellentesque.com";
                b2.tampil();
                
                Rekening b3 = new Rekening();
                b3.noRekening = "161007278862";
                b3.namaAwal = "Ehsan";
                b3.namaAkhir = "bin Azzarudin";
                b3.Phone = "6505379";
                b3.Email = "Proin.eget@velitegestaslacinia.ca";
                b3.tampil();
                
                Rekening b4 = new Rekening();
                b4.noRekening = "161807297229";
                b4.namaAwal = "Jeanne Roselia";
                b4.namaAkhir = "Fadhullah";
                b4.Phone = "8638209";
                b4.Email = "Pellentesque.ut.ipsum@neque.ca";
                b4.tampil();
                
                Rekening b5 = new Rekening();
                b5.noRekening = "169503136823";
                b5.namaAwal = "Shinnosuke";
                b5.namaAkhir = "Nohara";
                b5.Phone = "5926919";
                b5.Email = "tellus.justo.sit@commodoauctor.net";
                b5.tampil();
               
                Rekening b6 = new Rekening();
                b6.noRekening = "168507083528";
                b6.namaAwal = "Hiroshi";
                b6.namaAkhir = "Nohara";
                b6.Phone = "11153397678";
                b6.Email = "dictum@nec.edu";
                b6.tampil();
               
                Rekening b7 = new Rekening();
                b7.noRekening = "160802059329";
                b7.namaAwal = "Misae";
                b7.namaAkhir = "Nohara";
                b7.Phone = "18917032664";
                b7.Email = "vel@ullamcorpermagna.co.uk";
                b7.tampil();
               
                Rekening b8 = new Rekening();
                b8.noRekening = "160806282695";
                b8.namaAwal = "Himawari";
                b8.namaAkhir = "Nohara";
                b8.Phone = "19786325110";
                b8.Email = "Aliquam.gravida@vestibulumMauris.net";
                b8.tampil();
                
                Rekening b9 = new Rekening();
                b9.noRekening = "160309273084";
                b9.namaAwal = "Aruffin";
                b9.namaAkhir = "bin Abdul Salam";
                b9.Phone = "14582643263";
                b9.Email = "ligula.Nullam@tacitisociosqu.edu";
                b9.tampil();
                
                Rekening b10 = new Rekening();
                b10.noRekening = "160309273084";
                b10.namaAwal = "Aruffin";
                b10.namaAkhir = "bin Abdul Salam";
                b10.Phone = "14582643263";
                b10.Email = "ligula.Nullam@tacitisociosqu.edu";
                b10.tampil();
                
                Rekening b11 = new Rekening();
                b11.noRekening = "160309273084";
                b11.namaAwal = "Aruffin";
                b11.namaAkhir = "bin Abdul Salam";
                b11.Phone = "14582643263";
                b11.Email = "ligula.Nullam@tacitisociosqu.edu";
                b11.tampil();
                
                Rekening b12 = new Rekening();
                b12.noRekening = "160309273084";
                b12.namaAwal = "Aruffin";
                b12.namaAkhir = "bin Abdul Salam";
                b12.Phone = "14582643263";
                b12.Email = "ligula.Nullam@tacitisociosqu.edu";
                b12.tampil();
                
                Rekening b13 = new Rekening();
                b13.noRekening = "160309273084";
                b13.namaAwal = "Aruffin";
                b13.namaAkhir = "bin Abdul Salam";
                b13.Phone = "14582643263";
                b13.Email = "ligula.Nullam@tacitisociosqu.edu";
                b13.tampil();
                
                Rekening b14 = new Rekening();
                b14.noRekening = "160309273084";
                b14.namaAwal = "Aruffin";
                b14.namaAkhir = "bin Abdul Salam";
                b14.Phone = "14582643263";
                b14.Email = "ligula.Nullam@tacitisociosqu.edu";
                b14.tampil();
                
            }if (x==2){
                Transaksi t1 = new Transaksi();
                t1.saldo = 898214;
                t1.saldoAwal = 49404835;
                t1.saldoAkhir = 239101;
                t1.tanggalTransaksi = "2021-03-09";
                t1.type = "07:54:42";
                t1.tampil();
                
                Transaksi t2 = new Transaksi();
                t2.saldo = 898214;
                t2.saldoAwal = 49404835;
                t2.saldoAkhir = 239101;
                t2.tanggalTransaksi = "2021-03-09";
                t2.type = "07:54:42";
                t2.tampil();
                
                Transaksi t3 = new Transaksi();
                t3.saldo = 898214;
                t3.saldoAwal = 49404835;
                t3.saldoAkhir = 239101;
                t3.tanggalTransaksi = "2021-03-09";
                t3.type = "07:54:42";
                t3.tampil();
                
                Transaksi t4 = new Transaksi();
                t4.saldo = 898214;
                t4.saldoAwal = 49404835;
                t4.saldoAkhir = 239101;
                t4.tanggalTransaksi = "2021-03-09";
                t4.type = "07:54:42";
                t4.tampil();
                
                Transaksi t5 = new Transaksi();
                t5.saldo = 898214;
                t5.saldoAwal = 49404835;
                t5.saldoAkhir = 239101;
                t5.tanggalTransaksi = "2021-03-09";
                t5.type = "07:54:42";
                t5.tampil();
                
                Transaksi t6 = new Transaksi();
                t6.saldo = 898214;
                t6.saldoAwal = 49404835;
                t6.saldoAkhir = 239101;
                t6.tanggalTransaksi = "2021-03-09";
                t6.type = "07:54:42";
                t6.tampil();
               
                Transaksi t7 = new Transaksi();
                t7.saldo = 898214;
                t7.saldoAwal = 49404835;
                t7.saldoAkhir = 239101;
                t7.tanggalTransaksi = "2021-03-09";
                t7.type = "07:54:42";
                t7.tampil();
                
                Transaksi t8 = new Transaksi();
                t8.saldo = 898214;
                t8.saldoAwal = 49404835;
                t8.saldoAkhir = 239101;
                t8.tanggalTransaksi = "2021-03-09";
                t8.type = "07:54:42";
                t8.tampil();
                
                Transaksi t9 = new Transaksi();
                t9.saldo = 898214;
                t9.saldoAwal = 49404835;
                t9.saldoAkhir = 239101;
                t9.tanggalTransaksi = "2021-03-09";
                t9.type = "07:54:42";
                t9.tampil();
                
                Transaksi t10 = new Transaksi();
                t10.saldo = 898214;
                t10.saldoAwal = 49404835;
                t10.saldoAkhir = 239101;
                t10.tanggalTransaksi = "2021-03-09";
                t10.type = "07:54:42";
                t10.tampil();
                
                Transaksi t11 = new Transaksi();
                t11.saldo = 898214;
                t11.saldoAwal = 49404835;
                t11.saldoAkhir = 239101;
                t11.tanggalTransaksi = "2021-03-09";
                t11.type = "07:54:42";
                t11.tampil();
                
                Transaksi t12= new Transaksi();
                t12.saldo = 898214;
                t12.saldoAwal = 49404835;
                t12.saldoAkhir = 239101;
                t12.tanggalTransaksi = "2021-03-09";
                t12.type = "07:54:42";
                t12.tampil();
                
                Transaksi t13 = new Transaksi();
                t13.saldo = 898214;
                t13.saldoAwal = 49404835;
                t13.saldoAkhir = 239101;
                t13.tanggalTransaksi = "2021-03-09";
                t13.type = "07:54:42";
                t13.tampil();
                
                Transaksi t14 = new Transaksi();
                t14.saldo = 898214;
                t14.saldoAwal = 49404835;
                t14.saldoAkhir = 239101;
                t14.tanggalTransaksi = "2021-03-09";
                t14.type = "07:54:42";
                t14.tampil();
                
            }if (x==3){
                
            }if (x == 4){
                
            } else{
                    System.out.print("Maaf menu yang Anda pilih tidak sesuai");
            }
        
        System.out.println();
        System.out.print("Apakah Anda Ingin Memilih Menu Lainnya (Y/T) ?  ");
        sc.nextLine();
        ulang = sc.nextLine();
        System.out.println();
                 
                } while(ulang.equalsIgnoreCase("Y"));
                z++;
        }
    }    

