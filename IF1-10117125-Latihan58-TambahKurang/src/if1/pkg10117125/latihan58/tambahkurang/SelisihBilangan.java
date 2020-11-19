/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan58.tambahkurang;

/**
 *
 * @author Zulfi
 */
public class SelisihBilangan extends Bilangan{
     public void tampilSelisih() {
        Bilangan bilangan = new Bilangan();
        bilangan.getX();
        bilangan.getY();
        int hasil = getX() - getY();
        System.out.println("Hasil Selisih " + bilangan.getX() + " - " + 
                           bilangan.getY() + " = " + hasil);
     }
}
