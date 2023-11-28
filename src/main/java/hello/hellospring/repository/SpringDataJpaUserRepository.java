package hello.hellospring.repository;

import hello.hellospring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringDataJpaUserRepository extends JpaRepository<User,
        Long>, UserRepository {
    Optional<User> findByName(String name);
}
