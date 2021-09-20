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
public class Tabung {
    //atribut
    public int jariJari;
    public int tinggi;
    
    //methods
    public void hitungVol(){
        double hasil = 3.14 * jariJari * jariJari * tinggi;
        System.out.println("Volume tabungnya adalah : " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * 3.14 * jariJari * tinggi;
        System.out.println("Luas selimut tabungnya adalah " + hasil);
    }
}
