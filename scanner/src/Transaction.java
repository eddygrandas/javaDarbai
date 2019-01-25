public class Transaction {
    private Account gavejas;
    private Account siuntejas;
    private double suma;

    public Transaction(Account gavejas, Account siuntejas, double suma) {
        this.gavejas = gavejas;
        this.siuntejas = siuntejas;
        this.suma = suma;
    }

    public Account getGavejas() {
        return gavejas;
    }

    public void setGavejas(Account gavejas) {
        this.gavejas = gavejas;
    }

    public Account getSiuntejas() {
        return siuntejas;
    }

    public void setSiuntejas(Account siuntejas) {
        this.siuntejas = siuntejas;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "gavejas=" + gavejas +
                ", siuntejas=" + siuntejas +
                ", suma=" + suma +
                '}';
    }
    public String spausdinti() {
        return "Transaction{" +
                "gavejas=" + gavejas +
                ", siuntejas=" + siuntejas +
                ", suma=" + suma +
                '}';
    }

    public void siunciam(){
        if(siuntejas.getBalansas()>=suma){
            siuntejas.setBalansas(siuntejas.getBalansas()-suma);
            gavejas.setBalansas(gavejas.getBalansas()+suma);
            //spausdinti();
        }else{
            System.out.println("ubagas esi");        }
    }
}
