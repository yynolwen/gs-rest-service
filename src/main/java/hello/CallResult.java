package hello;

/**
 * Created by YongYanOspiea on 16/08/2016.
 */
public class CallResult {

    private String name;
    private String tel;
    private boolean rdvPrise;


    public CallResult() {
    }

    public CallResult(String name, String tel, boolean rdvPrise) {
        this.name = name;
        this.tel = tel;
        this.rdvPrise = rdvPrise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isRdvPrise() {
        return rdvPrise;
    }

    public void setRdvPrise(boolean rdvPrise) {
        this.rdvPrise = rdvPrise;
    }
}
