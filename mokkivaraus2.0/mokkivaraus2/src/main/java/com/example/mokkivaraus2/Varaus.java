package com.example.mokkivaraus2;

public class Varaus {
    private int varausID;
    private int asiakasID;
    private int mokkiID;
    private String varattuPvm;
    private String vahvistusPvm;
    private String varattuAlkuPvm;
    private String varattuLoppuPvm;

    public int getVarausID() {
        return varausID;
    }

    public void setVarausID(int varausID) {
        this.varausID = varausID;
    }

    public int getAsiakasID() {
        return asiakasID;
    }

    public void setAsiakasID(int asiakasID) {
        this.asiakasID = asiakasID;
    }

    public int getMokkiID() {
        return mokkiID;
    }

    public void setMokkiID(int mokkiID) {
        this.mokkiID = mokkiID;
    }

    public String getVarattuPvm() {
        return varattuPvm;
    }

    public void setVarattuPvm(String varattuPvm) {
        this.varattuPvm = varattuPvm;
    }

    public String getVahvistusPvm() {
        return vahvistusPvm;
    }

    public void setVahvistusPvm(String vahvistusPvm) {
        this.vahvistusPvm = vahvistusPvm;
    }

    public String getVarattuAlkuPvm() {
        return varattuAlkuPvm;
    }

    public void setVarattuAlkuPvm(String varattuAlkuPvm) {
        this.varattuAlkuPvm = varattuAlkuPvm;
    }

    public String getVarattuLoppuPvm() {
        return varattuLoppuPvm;
    }

    public void setVarattuLoppuPvm(String varattuLoppuPvm) {
        this.varattuLoppuPvm = varattuLoppuPvm;
    }
}
