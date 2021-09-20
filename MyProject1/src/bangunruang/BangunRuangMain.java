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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola br1 = new Bola();
        br1.jariJari = 7;
        br1.hitungVol();
        br1.hitungLuasSelimut();
        
        System.out.println("--------------------------");
        
        Tabung br2 = new Tabung();
        br2.jariJari = 10;
        br2.tinggi = 15;
        br2.hitungVol();
        br2.hitungLuasSelimut();
        
        System.out.println("--------------------------");
        
        Kerucut br3 = new Kerucut();
        br3.jariJari = 7;
        br3.tinggi = 10;
        br3.s = 15;
        br3.hitungVol();
        br3.hitungLuasSelimut();
    }
}
