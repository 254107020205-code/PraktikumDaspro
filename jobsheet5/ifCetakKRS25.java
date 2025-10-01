package jobsheet5;

import java.util.Scanner;
public class ifCetakKRS25 {
    
public static void main(String[] args){
     Scanner sc=new Scanner(System.in);


     System.out.print("--- Cetak KRS SIAKAD --- ");
        System.out.print("Apakah UKT sudah lunas? (True/false): ");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
            System.out.print("Pembayaran UKT terverivikasi");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.print("Pembayaran UKT belum terverivikasi");
            System.out.print("Silahkan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}