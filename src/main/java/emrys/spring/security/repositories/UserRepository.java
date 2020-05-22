package emrys.spring.security.repositories;

import emrys.spring.security.models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Integer> {

    Optional<UsersEntity> findByUserName(String userName);
}
