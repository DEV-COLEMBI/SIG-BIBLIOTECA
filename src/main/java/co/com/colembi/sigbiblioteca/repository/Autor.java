package co.com.colembi.sigbiblioteca.repository;

import java.util.List;

public interface Autor {
    List<Autor> findAll();
    Autor findById(int id);
    void update(Autor autor, int id);
    void delete(int id);

    }
