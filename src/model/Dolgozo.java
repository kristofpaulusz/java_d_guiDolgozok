package model;

public class Dolgozo {
    private String nev;
    private Integer kor;
    private String nem;
    private Integer munkToltEv;

    public Dolgozo(String nev, Integer kor, String nem, Integer munkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.munkToltEv = munkToltEv;
    }
    public Dolgozo(String nev, Integer kor, String nem) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.munkToltEv = 0;
    }

    public Integer getMunkToltEv() {
        return munkToltEv;
    }

    public Integer getKor() {
        return kor;
    }

    public String getNem() {
        return nem;
    }

    public String getNev() {
        return nev;
    }
}
