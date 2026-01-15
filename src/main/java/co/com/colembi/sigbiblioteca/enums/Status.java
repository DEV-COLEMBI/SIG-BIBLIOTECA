package co.com.colembi.sigbiblioteca.enums;

public enum Status {
    ATIVO("ATIVO"),
    DEVOLVIDO("DEVOLVIDO"),
    ATRASADO("ATRASADO");

    private String status;

    Status(String status) {
        this.status = status;
    }
}
