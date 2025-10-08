package jobsheet5.jobsheet6;


import java.util.Scanner;

public class casemethod1_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        System.out.println("\n---- Mata Kuliah 1: Algoritma dan Pemrograman ----");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();

        System.out.println("\n---- Mata Kuliah 2: Struktur Data ----");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();

        
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

       
        String huruf1 = konversiHuruf(akhir1);
        String huruf2 = konversiHuruf(akhir2);

        String status1 = (akhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (akhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        
        double rata = (akhir1 + akhir2) / 2;

        
        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %-5s %-5s %-5s %-10s %-10s %-10s\n", 
                          "Mata Kuliah", "UTS", "UAS", "TGS", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %-5.0f %-5.0f %-5.0f %-10.2f %-10s %-10s\n",
                          "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("%-20s %-5.0f %-5.0f %-5.0f %-10.2f %-10s %-10s\n",
                          "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.println("-----------------------------------------------");

        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rata);

        // Status semester (Nested if)
        if (akhir1 >= 60 && akhir2 >= 60) {
            if (rata >= 70) {
                System.out.println("Status Semester : LULUS");
            } else {
                System.out.println("Status Semester : TIDAK LULUS (Rata-rata < 70)");
            }
        } else {
            System.out.println("Status Semester : TIDAK LULUS (Salah satu MK tidak lulus)");
        }

        input.close();
    }

    
    public static String konversiHuruf(double nilai) {
        if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 55) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }
}

