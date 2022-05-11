package kuis1_jam;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btn_submit"
    private Button btn_submit; // Value injected by FXMLLoader

    @FXML // fx:id="cb_jenis"
    private ComboBox<?> cb_jenis; // Value injected by FXMLLoader

    @FXML // fx:id="dp_tanggal"
    private DatePicker dp_tanggal; // Value injected by FXMLLoader

    @FXML // fx:id="tf_harga"
    private TextField tf_harga; // Value injected by FXMLLoader

    @FXML // fx:id="tf_merek"
    private TextField tf_merek; // Value injected by FXMLLoader

    @FXML // fx:id="tf_nama"
    private TextField tf_nama; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btn_submit != null : "fx:id=\"btn_submit\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert cb_jenis != null : "fx:id=\"cb_jenis\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert dp_tanggal != null : "fx:id=\"dp_tanggal\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert tf_harga != null : "fx:id=\"tf_harga\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert tf_merek != null : "fx:id=\"tf_merek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert tf_nama != null : "fx:id=\"tf_nama\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
       
    jam datamodel = new jam();    
        
    jam Jam = new jam();
    Jam.setHarga(Integer.parseInt(tf_harga.getText()));
    Jam.setJenis((String) cb_jenis.getValue());
    Jam.setMerek(tf_merek.getText());
    Jam.setNama(tf_nama.getText());
    Jam.setTanggal_pembuatan(dp_tanggal.getValue().toString());
    
    datamodel.addjam(Jam);
        
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        ArrayList <String> list = new ArrayList<String>();
        list.add("Quartz");
        list.add("Automatic");
        list.add("Chronograph");
        list.add("Digital");
        ObservableList items = FXCollections.observableArrayList(list);
        cb_jenis.setItems(items);
    }    
    
}
