/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan54.koordinat;

/**
 *
 * @author user
 */
public class WarnaKoordinat extends Koordinat {
 
public String warna;

    public WarnaKoordinat(String warna, int x, int y) {
        super(x, y);
        this.warna = warna;
    }



    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }


    
    
}
