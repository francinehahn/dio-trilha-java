package dio.webapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.webapi.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
