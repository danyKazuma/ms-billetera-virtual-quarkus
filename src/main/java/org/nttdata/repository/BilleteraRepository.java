package org.nttdata.repository;


import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import org.nttdata.model.Billetera;

import java.util.List;

@ApplicationScoped
public class BilleteraRepository implements PanacheMongoRepository<Billetera> {
    public Billetera findBilleteraByNumeroCelular(String numeroCelular){
        return find("numeroCelular",numeroCelular).firstResultOptional().orElseThrow(NotFoundException::new);
    }

}
