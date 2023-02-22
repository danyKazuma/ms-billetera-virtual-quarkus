package org.nttdata.ws.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.nttdata.service.BilleteraService;
import org.nttdata.ws.vo.BilleteraVO;

import java.util.Map;

@Path("ms-billetera-virtual/target")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BilleteraResource {

    @Inject
    BilleteraService billeteraService;


}
