
package carreras;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 *
 * @author manue
 */
public class Carreras {
    Timer timer;

    public Carreras(int segundos) {
        timer = new Timer();
        timer.schedule(new Recordatorio(), segundos * 1000);//Programa la tarea
    }
    

    class Recordatorio extends TimerTask {

        public void run() {
            System.out.println("Tiene un recordatorio!");
            timer.cancel(); //Termina el hilo del timer
        }
    }
    
}
