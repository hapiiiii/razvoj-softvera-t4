package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;
import java.util.Objects;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal(String s, String p, double k) {
        setSifra(s);
        setNaziv(p);
        setCijena(k);
    }
    public static void izbaciDuplikate(ArrayList<Artikal> li) {
        for (int i=0;i<li.size();i++) {
            for (int k=i+1;k<li.size();k++) {
                if (li.get(i).equals(li.get(k))) {
                    li.remove(k);k--;}}}}
    public String getSifra(){
        return sifra;
    }
    public void setSifra(String sifra) {
        if (sifra.isEmpty()) throw new IllegalArgumentException("Sifra je prazna");
        this.sifra = sifra;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        if (naziv.isEmpty()) throw new IllegalArgumentException("Naziv je prazan");
        this.naziv = naziv;
    }
    public double getCijena() {
        return cijena;
    }
    public void setCijena(double cijena) {
        if (cijena<0) throw new IllegalArgumentException("Cijena je negativna");
        this.cijena = cijena;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikal artikal = (Artikal) o;
        return Double.compare(artikal.cijena, cijena) == 0 &&
                Objects.equals(sifra, artikal.sifra) &&
                Objects.equals(naziv, artikal.naziv);
    }
    @Override
    public String toString() {
        return sifra+","+ naziv+","+ cijena + "\n"; }
}
