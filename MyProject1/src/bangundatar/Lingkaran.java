/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author AVITA
 */
public class Lingkaran {
    //atribut
    public String namaLingkaran;
    public int jarijari;
    
    //methods
    public void hitungLuas(){
        double jarijariDouble = jarijari;
        
        double hasil = 3.14 * jarijari * jarijari;
        System.out.println("Luas lingkaran " + namaLingkaran + " adalah " + hasil);
    }
    
    public void hitungKeliling(){
        double jarijariDouble = jarijari;
        
        double hasil = 2 * 3.14 * jarijari;
        System.out.println("Keliling lingkaran " + namaLingkaran + " adalah " + hasil);
    }
}
