package br.lab365.com.LabCar.repository;

import br.lab365.com.LabCar.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    boolean existsByEmailIgnoreCase(String email);
}

