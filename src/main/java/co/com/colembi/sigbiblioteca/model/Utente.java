package co.com.colembi.sigbiblioteca.model;

import co.com.colembi.sigbiblioteca.enums.Genero;

import java.time.LocalDate;

public class Utente {
  private int id_utente;
  private String nome;
  private Genero genero;
  private LocalDate data_nasc;
  private String bi;
  private String nacionalidade;
  private String fone;
  private String endereco;
  private String curso;
  private int id_perfilutente;

    public int getId_utente() {
        return id_utente;
    }

    public void setId_utente(int id_utente) {
        this.id_utente = id_utente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId_perfilutente() {
        return id_perfilutente;
    }

    public void setId_perfilutente(int id_perfilutente) {
        this.id_perfilutente = id_perfilutente;
    }
}
