package com.CasoPractico.demo.Queja;


import com.CasoPractico.demo.Queja.Queja;
import com.CasoPractico.demo.Queja.QuejaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuejaServiceImpl implements QuejaService {
    @Autowired
    private QuejaDAO quejaDao;

    @Override
    public List<Queja> listarQuejas() {
        return quejaDao.findAll();
    }

    @Override
    public Queja guardarQueja(Queja queja) {
        return quejaDao.save(queja);
    }

    @Override
    public void eliminarQueja(Long id) {
        quejaDao.deleteById(id);
    }

    @Override
    public Queja obtenerQueja(Long id) {
        return quejaDao.findById(id).orElse(null);
    }
}