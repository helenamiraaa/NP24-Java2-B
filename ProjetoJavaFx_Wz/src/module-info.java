module ProjetoJavaFx_Wz {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.helena.app to javafx.graphics, javafx.fxml;
}
