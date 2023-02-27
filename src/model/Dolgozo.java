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
//    @Override
//    public String toString() {
//        return "Dolgozo{" + "nev=" + nev + ", kor=" + kor + ", nem=" + nem + ", munkToltEv=" + munkToltEv + '}';
//    }
}
