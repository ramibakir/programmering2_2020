package no.hiof.larseknu.javalin.model;

import java.time.LocalDate;

public class Sjimpanse extends Dyr{
    private int iq;

    public Sjimpanse(String navn, int iq) {
        super(navn);
        this.iq = iq;
    }

    public Sjimpanse(String navn, LocalDate fodselsDato, int iq) {
        super(navn, fodselsDato);
        this.iq = iq;
    }

    /*@Override
    public int getId() {
        return 1337;
    }*/

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

}
