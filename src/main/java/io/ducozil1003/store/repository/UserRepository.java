package io.ducozil1003.store.repository;

import io.ducozil1003.store.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    List<User> findAll();
    User findUserById(long id);
    User deleteById(long id);
}
