package org.nttdata.ws.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.nttdata.ws.vo.ClienteVO;

@Path("/cliente")
@RegisterRestClient(configKey = "cliente-api")
public interface ClienteCallClient {
    @GET
    @Path("/findNumeroCelular/{numeroCelular}")
    ClienteVO buscarClientePorCelular(@PathParam("numeroCelular") String numeroCelular);
}
