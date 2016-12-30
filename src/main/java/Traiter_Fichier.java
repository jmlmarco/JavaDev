import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by moise on 16-12-30.
 */
public class Traiter_Fichier {

    public static String chaine="";
    public static String chimsi="";
    public static String chimeisv="";
    public static String chmsisdn="";

    public  Traiter_Fichier()  {

        //construteur par defaut
    }
    public static ArrayList ouvrir() throws IOException {

        FileReader fr = new FileReader("Lireimsi");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList Tab= new ArrayList();
        int i=0;
        while ((line = br.readLine()) != null) {
            chaine = line.trim();
            if (line.contains("imsi = ")) {
                chimsi = SimCardImsi(chaine);
            } else if (line.contains("imeisv = ")) {
                chimeisv = SimCardImeisv(chaine);
            } else if (line.contains("msisdn = ")) {
                chmsisdn = SimCardMsisdn(chaine);
               //System.out.println(chimsi + ", " + chimeisv + ", " + chmsisdn);
                Tab.add(chimsi+" - "+chimeisv+" - "+chmsisdn+"\n");
                i++;
            }
           // Tab[i] = chimsi.toString() + ", " + chimeisv.toString() + ", " + chmsisdn.toString();
            // i++;
        }
        //chimsi=chimeisv=chmsisdn=null;
        //System.out.println(Tab[0]);
        // while (line != null) ;// end of while
        fr.close();
        br.close () ;
        return Tab;

    }
        public static String SimCardImsi(String chImsi){
            String recupImsi="";
            //if(chImsi.startsWith("imsi = 302")){
            recupImsi=chImsi.substring(0,22);
            //}
            return recupImsi;
        }

        public static String SimCardImeisv(String chImeisv){
            String recupImeisv="";
            //if(chImeisv.startsWith("imeisv = 352")){
            recupImeisv=chImeisv.substring(0,25);
            //}
            return recupImeisv;
        }

        public static String SimCardMsisdn(String chMsisdn){
            String recupMsisdn="";
            //if(chImeisv.startsWith("imeisv = 352")){
            recupMsisdn=chMsisdn.substring(0,20);
            //}
            return recupMsisdn;
        }



    }
