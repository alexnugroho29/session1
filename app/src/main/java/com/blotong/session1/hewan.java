package com.blotong.session1;

public class hewan {
    private int kaki;
    private String alat_nafas;
    //private String jawab;

    public hewan(int kaki, String alat_nafas){
        this.alat_nafas = alat_nafas;
        this.kaki = kaki;}
    public hewan(String alat_nafas){
        this.alat_nafas = alat_nafas;
    }
    public void setKaki(int kaki){
        this.kaki = kaki;
    }
    public void setAlat_Nafas(String alat_nafas){
        this.alat_nafas = alat_nafas;
    }
    public int getKaki(){
        return kaki;
    }
    public String getAlat_Nafas(){
        return alat_nafas;
    }
//    public String getJawab(){
//        return jawab;
//    }
}
