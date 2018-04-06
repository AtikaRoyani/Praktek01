/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author username
 */
public class TelevisiAksi {
    public static void main(String[] args) {
        Televisi Tika = new Televisi();
        
        Tika.Layar="LED";
        Tika.Merk="LG";
        Tika.Kelebihan="Touchscreen";
        Tika.Harga=25000000;
        Tika.Listrik="70 Watt";
        
        Tika.cetakInfo();
    }
}
