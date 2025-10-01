package jobsheet5;

import java.util.Scanner;
public class ifCetakKRS25 {
    
public static void main(String[] args){
     Scanner sc=new Scanner(System.in);

        // Input status pembayaran UKT
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();

       // Tambahan: Versi menggunakan Ternary Operator
        String pesanVerifikasi = uktlunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Pembayaran UKT belum terverifikasi\nSilakan lunasi UKT terlebih dahulu";
        System.out.println(pesanVerifikasi);


    
        sc.close();
    }
}