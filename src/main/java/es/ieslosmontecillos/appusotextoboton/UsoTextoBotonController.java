package es.ieslosmontecillos.appusotextoboton;

import es.ieslosmontecillos.componentes_galvezdiego.CampoTextoBoton;
import es.ieslosmontecillos.componentes_galvezdiego.CampoTextoNumerico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class UsoTextoBotonController implements Initializable {

    @FXML
    private Label lblResultado;
    @FXML
    private CampoTextoBoton txtNombre;
    @FXML
    private CampoTextoBoton txtApellido;

    @FXML
    public void grabaRegistroNombre(ActionEvent actionEvent){
        lblResultado.setText("Se ha grabado: " + txtNombre.getText());
    }

    @FXML
    public void grabaRegistroApellido(ActionEvent actionEvent) {
        lblResultado.setText("Se ha grabado: " + txtApellido.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtNombre.setText("Nombre");
        txtApellido.setText("Apellido");
    }
}