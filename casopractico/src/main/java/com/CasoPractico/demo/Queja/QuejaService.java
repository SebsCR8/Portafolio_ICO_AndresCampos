package com.CasoPractico.demo.Queja;
import java.util.List;

public interface QuejaService {
    List<Queja> listarQuejas();
    Queja guardarQueja(Queja queja);
    void eliminarQueja(Long id);
    Queja obtenerQueja(Long id);
}