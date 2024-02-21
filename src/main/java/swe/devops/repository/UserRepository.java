package swe.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import swe.devops.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
