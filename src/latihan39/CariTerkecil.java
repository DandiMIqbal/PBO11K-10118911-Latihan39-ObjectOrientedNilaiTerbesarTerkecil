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
public class CariTerkecil {
    private int kecil;
    public int cari(int i,int arr[]) {
        kecil = arr[1];
        for (int m = kecil; m <= i;m++) {
            if (arr[m] < kecil )
                kecil = arr[m];
        }
        return kecil;
    }
    
}
