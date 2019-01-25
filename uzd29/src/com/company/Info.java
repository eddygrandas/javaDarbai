package com.company;

public class Info {

    private int id;
    private String tekstas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTekstas() {
        return tekstas;
    }

    public void setTekstas(String tekstas) {
        this.tekstas = tekstas;
    }

    public Info(int id, String tekstas) {
        this.id = id;
        this.tekstas = tekstas;

    }
    public boolean arYraTekste(String zodis){
    return true;
    }
    @Override
    public String toString(){
        return null;
    }

}
