/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author erick.latocheski
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* calculadora calc = new calculadora();
        System.out.println(calc.somar(2, 3, 6));
*/
       gato gato = new gato();
       cachorro cachorro = new cachorro();
       pato pato = new pato();
       gato.comunicar();
       cachorro.comunicar();
       gato.comunicar();
    }

}
