/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author AVITA
 */
public class Kerucut {
    //atribut
    public int jariJari;
    public int tinggi;
    public int s;
    
    //methods
    public void hitungVol(){
        double hasil = ((3.14 * jariJari * jariJari) * tinggi ) / 3;
        System.out.println("Volume kerucutnya adalah : " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * jariJari * s;
        System.out.println("Luas selimut kerucutnya adalah " + hasil);
    }
}
