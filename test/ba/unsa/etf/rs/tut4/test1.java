package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class test1 {

    @Test
    void test1_1() {
        ArrayList<Artikal> lista = new ArrayList<>();
        Artikal artikal = new Artikal("mlj1","mljeko" ,4.5);
        lista.add(artikal);
        Racun.R stavka = new Racun.R(lista, 6);
        assertEquals(6, stavka.getKolicina());
    }
    @Test
    void test2_1() {
        ArrayList<Artikal> lista = new ArrayList<>();
        Artikal artikal = new Artikal("mlj1","mljeko" ,4.5);
        lista.add(artikal);
        Racun.R stavka = new Racun.R(lista, 2);
        assertEquals(2, stavka.getKolicina());
    }
    @Test
    void test3_1() {
        ArrayList<Artikal> lista = new ArrayList<>();
        Artikal artikal = new Artikal("mlj1","mljeko" ,4.5);
        lista.add(artikal);
        Racun.R stavka = new Racun.R();
        assertEquals(null, stavka.getArtikli());
    }



}