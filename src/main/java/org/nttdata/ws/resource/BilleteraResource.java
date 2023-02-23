package org.nttdata.ws.resource;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.core.Response;
import org.nttdata.model.Billetera;
import org.nttdata.repository.BilleteraRepository;



import java.util.List;
import java.util.Map;

@Path("ms-billetera-virtual/target")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BilleteraResource {

    @Inject
    BilleteraRepository billeteraRepository;

    @GET
    @Path("/buscar/{numeroCelular}")
    public Response buscarClientePorCelular(@PathParam("numeroCelular")String numeroCelular) {
        Uni<List<Billetera>> response=billeteraRepository.findBilleteraByNumeroCelular(numeroCelular);
        return Response.ok(response).build();
    }
}
