/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan54.koordinat;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Titik Koordinat warna dan warnanya
 */
public class PBO310117104Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk;
        wk = new WarnaKoordinat("jingga",10,4);
        wk.setWarna("jingga");
        wk.setX(10);
        wk.setY(4);
        
        System.out.println("Warna Koordinat : "+wk.getWarna());
        System.out.println("Warna Koordinat Sumbu x : "+wk.getX()+", y : "
                +wk.getY());
    
    }
    
}
