package br.com.senaisp.bauru.helena.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Tela01Controller {

	@FXML Label txtCodigo;
	@FXML Label txtDescricao;
	@FXML Label txtSaldo;
	@FXML Label txtCusto;
	@FXML Button btnGravar;
	@FXML Button btnCancelar;
	@FXML public void btnGravarAct() {
		System.out.println("Gravei");
		Main.mainStage.setScene(Main.mainScene);
	}
	@FXML public void btnCancelarAct() {
		System.out.println("Cancelar");
		Main.mainStage.setScene(Main.mainScene);
	}

}
