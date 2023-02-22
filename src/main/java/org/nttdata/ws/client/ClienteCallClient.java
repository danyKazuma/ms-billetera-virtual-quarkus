package org.nttdata.ws.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.nttdata.ws.vo.BilleteraVO;

public interface ClienteCallClient {
    @GET
    @Path("/findNumeroCelular/{numeroCelular}")
    BilleteraVO buscarClientePorCelular(@PathParam("numeroCelular") String numeroCelular);
}
