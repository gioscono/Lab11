package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.bar.model.Model;
import it.polito.tdp.bar.model.Simulator;
import it.polito.tdp.bar.model.Statistiche;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {

	private Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void doSimula(ActionEvent event) {

    	Statistiche s = model.riceviStatistiche();
    	txtResult.appendText("Clienti tot: "+s.getNumeroTotClienti()+"\nClienti soddisfatti: "+s.getNumeroClientiSoddisfatti()+"\nClienti insoddisfatti: "+s.getNumeroClientiInsoddisfatti());
    }

    @FXML
    void initialize() {
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Bar.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Bar.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
