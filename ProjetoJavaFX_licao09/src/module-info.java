module ProjetoJavaFX_licao09 {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens br.com.senaisp.bauru.helena.classes to javafx.graphics,
	javafx.controls, javafx.fxml, javafx.media;
}