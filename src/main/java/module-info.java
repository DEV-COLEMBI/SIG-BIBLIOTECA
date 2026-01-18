module co.com.colembi.sigbiblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens co.com.colembi.sigbiblioteca to javafx.fxml;
    exports co.com.colembi.sigbiblioteca;
    opens co.com.colembi.sigbiblioteca.controller to javafx.fxml;

}