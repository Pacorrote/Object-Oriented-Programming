package Tools;

import javax.swing.*;
import java.net.URL;

public abstract class Utilidades {


    public static ImageIcon createIcon(String path) {
        URL url = System.class.getResource(path);
        if (url == null) {
            System.out.println("Recurso no disponible");
        }
        ImageIcon im = new ImageIcon(url);
        return im;
    }
}
