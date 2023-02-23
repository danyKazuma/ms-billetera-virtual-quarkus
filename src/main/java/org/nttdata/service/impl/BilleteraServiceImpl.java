package org.nttdata.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.nttdata.model.Billetera;
import org.nttdata.repository.BilleteraRepository;
import org.nttdata.service.BilleteraService;
import org.nttdata.ws.client.ClienteCallClient;

import org.nttdata.ws.vo.BilleteraVO;


import java.util.List;
import java.util.Map;

@ApplicationScoped
public class BilleteraServiceImpl implements BilleteraService {

    @Inject
    BilleteraRepository billeteraRepository;

    @RestClient
    ClienteCallClient clienteCallClient;


    @Override
    public Map<String, Object> crearBilletera(BilleteraVO billeteraVO) {
        return null;
    }


    @Override
    public Map<String, Object> actualizarBilletera(Billetera billetera) {
        return null;
    }

    @Override
    public Map<String, Object> borrarBilletera(String numeroCelular) {
        return null;
    }

    @Override
    public List<Billetera> findAll() {
        return null;
    }

    @Override
    public List<Billetera> findAllByActivos() {
        return null;
    }

    @Override
    public Response buscarClientePorCelular(String numeroCelular) {
        return null;
    }


}
