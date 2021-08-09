package pp;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class Pp {

    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.err.println("A hora é "+relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayLanguage());
        
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getHeight() + " x " + Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        
    }
    
}
