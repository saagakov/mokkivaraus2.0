package com.example.mokkivaraus2;

public class VarauksenPalvelut {
    private int varausID;
    private int palveluID;
    private int lkm;

    public int getVarausID() {
        return varausID;
    }

    public void setVarausID(int varausID) {
        this.varausID = varausID;
    }

    public int getPalveluID() {
        return palveluID;
    }

    public void setPalveluID(int palveluID) {
        this.palveluID = palveluID;
    }

    public int getLkm() {
        return lkm;
    }

    public void setLkm(int lkm) {
        this.lkm = lkm;
    }
}
