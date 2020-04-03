package ba.unsa.etf.rs.tut4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public TextArea ulaz;
    public TextArea izlaz;
    public ChoiceBox<Artikal> izaberi;
    public Spinner sp;
    public TextArea rac_iz;

    public void ok(ActionEvent actionEvent) {
        String ulazni = ulaz.getText();
        String[] red = ulazni.split("\n");
        ArrayList<Artikal> ar = new ArrayList<>();
        for (int j=0; j<red.length; j++){
            String[] razvojeno = red[j].split (",");
            if (razvojeno.length==3) {
                Artikal artikal = new Artikal(razvojeno[0],razvojeno[1],Double.parseDouble(razvojeno[2]));
                ar.add(artikal); }
            else {
                throw new IllegalArgumentException("Niste unijeli 3 elementa"); } }
        Artikal.izbaciDuplikate(ar);
        String izlazni = "";
        for (Artikal i:ar){
            izlazni=izlazni+i.toString();
        }
        izlaz.setText(izlazni);
        ObservableList<Artikal> t = FXCollections.observableArrayList(ar);
        izaberi.setItems(t);
    }
    public void racun(ActionEvent actionEvent) {
        String s = izaberi.getSelectionModel().getSelectedItem().toString();
        int kol = (int) sp.getValue();
        String izlazni = s.trim() + " " + kol + "\n";
        rac_iz.setText(rac_iz.getText() + izlazni);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Artikal> items = FXCollections.observableArrayList(
                new ArrayList<>(Arrays.asList(
                        new Artikal("HLB001","Crni hljeb", 1.0),
                        new Artikal("HLB002","Bijeli hljeb",1.20),
                        new Artikal("MLK001","Mlijeko Meggle",1.10)
                ))
        );
        izaberi.setItems(items);
        izaberi.getSelectionModel().selectFirst();
    }
}
