package learning.dio.meu_projeto_api_rest.domain.repository;

import org.h2.engine.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
