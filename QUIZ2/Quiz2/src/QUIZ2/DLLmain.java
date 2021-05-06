/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ2;

/**
 *
 * @author lenovo
 */
//Temukan data Mahasiswa urutan pertama
//Cari data Mahasiswa (melalui NIM)*
//Urut data Mahasiswa (melalui IPK)*
import java.util.Scanner;
public class DLLmain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DLL dll = new DLL();

        char pilih = 0;
        do {
            int menu, idx;
            String nim, nama, jurusan = null, prodi = null;
            double ipk;
            System.out.println("====================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah data Mahasiswa");
            System.out.println("2. Tambah data Mahasiswa posisi akhir");
            System.out.println("3. Tambah data Mahasiswa posisi awal");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Hapus data Mahasiswa posisi awal");
            System.out.println("6. Hapus data Mahasiswa posisi akhir");
            System.out.println("7. Cetak data Mahasiswa");
            System.out.println("8. Temukan data Mahasiswa urutan pertama");
            System.out.println("9. Cari data Mahasiswa (melalui NIM)");
            System.out.println("10. Urut data Mahasiswa (melalui IPK)");
            System.out.println("11.Keluar");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan Menu\t: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa d = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    System.out.print("Data Mahasiswa ini akan dimasukkan di indeks ke-");
                    idx = sc.nextInt();
                    dll.add(d,idx);
                    pilih = 'y';
                break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addFirst(dt);
                    pilih = 'y';
                break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa data = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addLast(data);
                    pilih = 'y';
                break;
                case 4:
                    System.out.print("Masukkan posisi indeks : ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    pilih = 'y';
                break;
                case 5:
                    dll.removeFirst();
                    pilih = 'y';
                break;
                case 6:
                    dll.removeLast();
                    pilih = 'y';
                break;
                case 7:
                    System.out.println("Cetak Data Mahasiswa");
                    dll.print();
                    pilih = 'y';
                break;
                case 8:
                    System.out.println("Data Mahasiswa Urutan Pertama");
                    dll.pertama();
                case 9:
                    System.out.println("Cari data Mahasiswa");
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();
                    dll.SequentialSearch(nim);
                    pilih = 'y';
                break;
                case 10:
                    dll.SelectionSort();
                    System.out.println("Data berhasil diurutkan");
                    pilih = 'y';
                break;
                case 11:
                    pilih = 'n';
                break;
            }
        } while (pilih == 'y');
    }
    
}
