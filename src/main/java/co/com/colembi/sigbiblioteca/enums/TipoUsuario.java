package co.com.colembi.sigbiblioteca.enums;

public enum TipoUsuario {
    ADMIN("'ADMIN'"),
    BIBLIOTECARIO("'BIBLIOTECARIO'");

    private String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }
}
