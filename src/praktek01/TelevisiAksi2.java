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
public class TelevisiAksi2 {
    public static void main(String[] args) {
        Televisi Tiko = new Televisi();
        
        Tiko.Layar="Cembung";
        Tiko.Merk="Samsung";
        Tiko.Kelebihan="Touchscreen";
        Tiko.Harga=60000000;
        Tiko.Listrik="110 Watt";
        
        Tiko.cetakInfo();
    }
}
