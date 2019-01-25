import java.util.Random;

public class Account {
    private String vardas;
    private String email;
    private String saskaitosNr;
    private double balansas;
    private boolean kreditas;
    private int kreditoLimitas;

    public Account(String vardas, String email, double balansas) {
        this.vardas = vardas;
        this.email = email;
        this.saskaitosNr = generated();
        this.balansas = balansas;
        this.kreditas = false;
        this.kreditoLimitas = 0;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalansas() {
        return balansas;
    }

    public void setBalansas(double balansas) {
        this.balansas = balansas;
    }

    @Override
    public String toString() {
        return "Account{" +
                "vardas='" + vardas + '\'' +
                ", email='" + email + '\'' +
                ", saskaitosNr='" + saskaitosNr + '\'' +
                ", balansas=" + balansas +
                ", kreditas=" + kreditas +
                ", kreditoLimitas=" + kreditoLimitas +
                '}';
    }
    private String generated(){
        Random rnd = new Random();
        String result = "LT";
        for(int i = 0; i < 18; i++){
            result += String.valueOf(rnd.nextInt(9));
        }
        return result;
    }
}
