package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.model.User;

public interface UserRepository extends JpaRepository< User, Long> {

}
