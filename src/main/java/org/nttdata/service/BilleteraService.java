package org.nttdata.service;
import jakarta.ws.rs.core.Response;
import org.nttdata.model.Billetera;
import org.nttdata.ws.vo.BilleteraVO;

import java.util.List;
import java.util.Map;

public interface BilleteraService {
    Map<String, Object> crearBilletera(BilleteraVO billeteraVO);
    Map<String, Object> actualizarBilletera(Billetera billetera);
    Map<String, Object> borrarBilletera(String numeroCelular);
    List<Billetera> findAll();
    List<Billetera> findAllByActivos();
    Response buscarClientePorCelular(String numeroCelular);
}
