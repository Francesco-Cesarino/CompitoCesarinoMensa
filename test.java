/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bancone b1 = new Bancone();
        Cuoco c1 = new Cuoco("alberto", b1);
        Dipendente d1 = new Dipendente("Gigi", b1);
        Dipendente d2 = new Dipendente("Niru", b1);
        Dipendente d3 = new Dipendente("Miky", b1);
        Dipendente d4 = new Dipendente("Beri", b1);
        c1.start();
        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
    
}
