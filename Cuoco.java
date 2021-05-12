
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Cuoco extends Thread{

    Bancone b;
    public Cuoco(String name, Bancone b) {
        super(name);
        this.b = b;
        
    }
    
    @Override
    public void run() {
        
        try{
                Bancone.semaforoVuoto.acquire();
                b.incrementaPiatto();
                sleep(new Random().nextInt(2000));
                Bancone.PienoBuffer();
                System.out.println("Il cuoco ha lasciato il piatto n."+Bancone.numeroPiatto+" sul bancone.");
                Bancone.semaforoPieno.release();
                
                
                
            }
        catch(Exception e)
            {
                    
            }
        
    }
    
    
    
    
}
