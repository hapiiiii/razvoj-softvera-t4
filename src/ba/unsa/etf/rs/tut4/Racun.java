package ba.unsa.etf.rs.tut4;
import java.util.ArrayList;

public class Racun {
    public static class R {
        private ArrayList<Artikal> art;
        private Integer kol;
        public R(Artikal artikal, int k) {
            this.art = art;
            this.kol = kol; }
        public R() { }
        public R(ArrayList<Artikal> artikli, Integer koli) {
            setArtikli(artikli);
            setKolicina(koli); }
        public ArrayList<Artikal> getArtikli() {
            return art; }
        public void setArtikli(ArrayList<Artikal> a) {
            this.art = a; }
        public Integer getKolicina() {
            return kol; }
        public void setKolicina(Integer koli) {
            this.kol = koli;
        }}
    public ArrayList<R> r1;
    public Racun(){
        r1= new ArrayList<>(); }
    public void dodajStavku(Artikal artik, int i) {
        r1.add(new R(artik, i)); }
    public double ukupanIznos() {
        double s=0;
        for (R sr : r1) {
            s += sr.getKolicina();  }
        return s; }
}