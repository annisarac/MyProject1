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
public class Bola {
    //atribut
    public int jariJari;
    
    //methods
    public void hitungVol(){
        double hasil = 4 / 3 * 3.14 * jariJari * jariJari * jariJari;
        System.out.println("Volume bolanya adalah : " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * 3.14 * jariJari * jariJari;
        System.out.println("Luas selimut bolanya adalah " + hasil);
    }
}
