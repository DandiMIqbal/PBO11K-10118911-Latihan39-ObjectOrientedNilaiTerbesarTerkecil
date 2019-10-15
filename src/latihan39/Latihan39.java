/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan39 {
public static Scanner input = new Scanner(System.in);
    public static void insertNilai(int i,String namaP) {
        int[] nilaiArr = new int[1000];
        for(int j = 1; j <= i;j++) {
        System.out.print("Masukan nilai mahasiswa Ke-"+j+" = ");
            nilaiArr[j] = input.nextInt();
        }
        Nilai nilai = new Nilai();
        nilai.hasil(namaP, i, nilaiArr);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String namaP;
        System.out.println("==== Program Nilai Terbesar dan Terkecil Mahasiswa ====");
        System.out.print("Masukan nama petugas : ");
        namaP = input.nextLine();
        System.out.print("Masukan banyaknya mahasiswa : ");
        n = input.nextInt();
        insertNilai(n, namaP);
    }
    
}
