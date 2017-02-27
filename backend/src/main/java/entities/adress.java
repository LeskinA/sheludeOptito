package entities;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public class adress {
    private long id;
    private int aud;
    private String adress;

    public adress(long id, int aud, String adress) {
        this.id = id;
        this.aud = aud;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAud() {
        return aud;
    }

    public void setAud(int aud) {
        this.aud = aud;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
