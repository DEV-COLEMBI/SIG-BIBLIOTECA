module co.com.colembi.sigbiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.com.colembi.sigbiblioteca to javafx.fxml;
    exports co.com.colembi.sigbiblioteca;
}