/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Dipendente extends Thread{

    Bancone b;
    public Dipendente(String name, Bancone b) {
        super(name);
        this.b = b;
        
    }

    @Override
    public void run() {
       
        
        try{
            System.out.println(super.getName()+" aspetta servizio.");
            Bancone.semaforoPieno.acquire();
            Bancone.SvuotaBuffer();
            System.out.println(super.getName()+" prende il piatto dal bancone");
            Bancone.semaforoPieno.release();
                
            }
        catch(Exception e)
            {
                    
            }
        
    }
    
    
    
}
