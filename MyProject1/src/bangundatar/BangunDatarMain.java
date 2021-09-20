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
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 25;
        pp1.lebar = 38;
        pp1.hitungLuas();
        pp1.hitungKeliling();
        
        System.out.println("-----------------------------");
        
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.namaPersegi = "A";
        p1.hitungLuas();
        p1.hitungKeliling();
        
        System.out.println("-----------------------------");
        
        Persegi p2 = new Persegi();
        p2.sisi = 15;
        p2.namaPersegi = "B";
        p2.hitungLuas();
        p2.hitungKeliling();
        
        System.out.println("-----------------------------");
        
        Lingkaran l1 = new Lingkaran();
        l1.jarijari = 25;
        l1.namaLingkaran = "X";
        l1.hitungLuas();
        l1.hitungKeliling();
        
        System.out.println("-----------------------------");
        
        Lingkaran l2 = new Lingkaran();
        l2.jarijari = 37;
        l2.namaLingkaran = "Z";
        l2.hitungLuas();
        l2.hitungKeliling();
    }
}
