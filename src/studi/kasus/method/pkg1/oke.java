/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.method.pkg1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class oke {
    void resto(){
        //scanner
        Scanner input = new Scanner(System.in);
        //variabel
        String[] makanan = {"Ayam", "Gurami", "Lele"};
        int[] Hargamakanan = {50000, 12000, 4000};
        int harga = 0;
        int banyak;
        int uang;
        
        System.out.println("=== Selamat Datang di Warung Ruwet ===");
        //boolean
        boolean repeat = true;
        while (repeat) {
        //program for    
        System.out.print("Menu makanan : ");
        for (int i = 0; i < makanan.length; i++){
            System.out.println(i+"."+makanan[i]+"="+Hargamakanan[i]);
        }
        //switch
        System.out.print("Masukan pilihan : ");
        int pilihan = input.nextInt();
            switch (pilihan){
                case 0;
                    System.out.print("Banyak Pesanan : ");
                    banyak = input.nextInt();
                    harga += Hargamakanan[0] * banyak;
                    break;
                case 1;
                    System.out.print("Banyak Pesanan : ");
                    banyak = input.nextInt();
                    harga += Hargamakanan[1] * banyak;
                    break;
                case 2;
                    System.out.print("Banyak Pesanan : ");
                    banyak = input.nextInt();
                    harga += Hargamakanan[2] * banyak;
                    break;
                case 3;
                    System.out.print("Banyak Pesanan : ");
                    banyak = input.nextInt();
                    harga += Hargamakanan[3] * banyak;
                    break;
                default ;
                    harga += 0;
                    
            }
        System.out.print("Apakah ingin menambah ? (y/n) : ");
        String tambah = input.next();
        
        repeat = tambah.equalsIgnoreCase("y");
        System.out.println("==================");
        }
        
        System.out.println("Total Harga : "+harga);
        
        do{
        System.out.print("Silahkan Masukan Uang Anda : ");
        uang = input.nextInt();
        //if else
        if (uang > harga){
            System.out.println("Kembalian Anda : "+(uang-harga));
        }else if (uang == harga){
            System.out.println("Pesanan Anda Akan Segera di antar");
        }else
            System.out.println("Uang Anda Kurang");
        }while(uang < harga);
    }
    
   
}
