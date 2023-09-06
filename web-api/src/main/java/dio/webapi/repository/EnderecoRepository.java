package dio.webapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import dio.webapi.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
