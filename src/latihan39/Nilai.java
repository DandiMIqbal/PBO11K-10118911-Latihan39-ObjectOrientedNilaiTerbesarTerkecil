/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Nilai {
   private int nb, nk;
   public void hasil(String VarNamaP, int varI, int varNilaiArr[]) {
        CariTerbesar bsr = new CariTerbesar();
        CariTerkecil kcl = new CariTerkecil();
        nb = bsr.cari(varI, varNilaiArr);
        nk = kcl.cari(varI, varNilaiArr);
        System.out.println("\nNilai terbesar adalah "+nb);
        System.out.println("Nilai terkecil adalah "+nk);
        System.out.println("\nNama petugas : "+ VarNamaP);
    }
    
}
