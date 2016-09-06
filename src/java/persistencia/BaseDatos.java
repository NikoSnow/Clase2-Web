package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Niko-Show
 */
public class BaseDatos {
   
    public void persistir(String text)throws IOException{
        File bd = new File("base de datos.txt");
        System.out.println(bd.getAbsolutePath());
        FileWriter salida = new FileWriter(bd, true);
        salida.write(text + "\n");
        salida.flush();
        salida.close();
    }
    
}
