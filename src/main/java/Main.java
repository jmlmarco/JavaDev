import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by moise on 16-12-30.
 */
public class Main {

    public static void main(String args[]) throws IOException {

        ArrayList tabimisi =Traiter_Fichier.ouvrir();
       // for (int i = 0 ; i<tabimisi.size();i++)
        System.out.println(tabimisi);



    }
}
