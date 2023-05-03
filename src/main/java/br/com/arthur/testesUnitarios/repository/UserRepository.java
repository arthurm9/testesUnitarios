package br.com.arthur.testesUnitarios.repository;

import br.com.arthur.testesUnitarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByNameAndDocument(String name, String doc);
}
