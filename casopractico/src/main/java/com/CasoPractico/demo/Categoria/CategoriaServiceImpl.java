package com.CasoPractico.demo.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDAO categoriaDao;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaDao.findAll();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaDao.deleteById(id);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }
}
