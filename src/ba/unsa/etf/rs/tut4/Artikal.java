package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal(String unos) {
        String[] red = unos.split( "\n");
        String[] atributi;
        for(int i=0; i<red.length; i++) {
            atributi = red[i].split( ",");
            setSifra(atributi[0]);
            setNaziv(atributi[1]);
            setCijena(Double.parseDouble(atributi[2]));
        }
    }

    public Artikal(String abc, String proizvod, int i) {
        setSifra(abc);
        setNaziv(proizvod);
        setCijena(i);
    }

    public static void izbaciDuplikate(ArrayList<Artikal> lista) {
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()) throw new IllegalArgumentException("Sifra je prazna");
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()) throw new IllegalArgumentException("Naziv je prazan");
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if(cijena<0) throw new IllegalArgumentException("Cijena je negativna");
        this.cijena = cijena;
    }
}