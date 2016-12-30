/**
 * Created by moise on 16-12-30.
 */
public class Recurence {

    private Imei imei;
    private Imsi imsi;
    private Msisdn msisdn;

    public Recurence (){

        // constructeur par defaut
    }

    public Recurence (Imei imei ,Imsi imsi ,Msisdn msisdn ){

        this.imei=imei;
        this.imsi=imsi;
        this.msisdn=msisdn;
    }

    public String toString() {
        return String.format("IMEI = %s IMSI = %s  MSISDN = %S" ,imei,imsi,msisdn);
    }

}
