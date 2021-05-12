
import java.util.concurrent.Semaphore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Bancone {
    
    static int numeroPiatto = 0;
    
    protected static boolean bufferBancone = false;
    protected static Semaphore semaforoVuoto = new Semaphore(1);
    protected static Semaphore semaforoPieno = new Semaphore(0);
            
    
    synchronized protected static void incrementaPiatto()
    {
        numeroPiatto ++;
    }
    
    
    synchronized protected static void PienoBuffer()
    {
        bufferBancone = true;
    }
    synchronized protected static void SvuotaBuffer()
    {
        bufferBancone = false;
    }
}
