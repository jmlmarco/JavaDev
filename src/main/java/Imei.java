/**
 * Created by moise on 16-12-30.
 */
public class Imei {

    private String imei;

    public Imei(){
        //Constructeur par defaut
    }
    public Imei(String imei){
        this.imei=imei;
    }

    public String getIMEI(){
        return this.imei;
    }
    public String setIMEI(String imei){
        return this.imei=imei; }

}
