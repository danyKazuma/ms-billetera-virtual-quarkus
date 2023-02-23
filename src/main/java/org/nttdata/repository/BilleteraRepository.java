package org.nttdata.repository;



import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import org.nttdata.model.Billetera;

import java.util.List;


@ApplicationScoped
public class BilleteraRepository implements ReactivePanacheMongoRepository<Billetera> {
    public Uni<List<Billetera>> findBilleteraByNumeroCelular(String numeroCelular){
        return listAll();
    }



}
