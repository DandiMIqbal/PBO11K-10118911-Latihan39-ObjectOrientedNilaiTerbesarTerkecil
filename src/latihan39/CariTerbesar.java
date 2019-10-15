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
public class CariTerbesar {
    private int besar;
    public int cari(int besar, int arr[]) {
        for (int z = 1;z<=besar;z++) {
            if (arr[z] > besar)
                besar = arr[z];
        }
        return besar;
    }
    
}
