package ba.unsa.etf.rs.tut4;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javax.swing.*;
import java.beans.PropertyEditor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//////////////////////////////////////////////////////////////////////////////////////////
public class Controller {
    public ChoiceBox<String> izaberi;
    public TextArea ulaz; 
    public TextArea izlaz;
    public void ok(ActionEvent actionEvent) {
        String st=new String();
        String str=new String();
        str=ulaz.getText();
        String[] str1=str.split("\n");
        List<String> SpisakArray=new ArrayList<String>();
        SpisakArray=Arrays.asList(str1);
        for (String re:SpisakArray) {
            st=st+re+"\n";
            izlaz.setText(st); }
        ArrayList<String> sifreartikala=new ArrayList<>();
        String dos=new String();
        dos=izlaz.getText();
        String slovo=new String();
        String[] st2=dos.split("\n");
        String r=new String();
        for (int i=0;i<st2.length;i++) {
            r=st2[i];
            for (int j=0;j<r.length();j++) {
                if (r.charAt(j)!=',') { slovo=slovo+r.charAt(j); }
                else{ sifreartikala.add(new String(slovo)); slovo=" ";break; } }
        }
        ObservableList<String> lista=FXCollections.observableList(sifreartikala);
        izaberi.setItems(lista);
        izaberi.getSelectionModel().selectFirst(); }
}