package com.CasoPractico.demo.Categoria;
import java.util.List;

public interface CategoriaService {
    List<Categoria> listarCategorias();
    Categoria guardarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
    Categoria obtenerCategoria(Long id);
}