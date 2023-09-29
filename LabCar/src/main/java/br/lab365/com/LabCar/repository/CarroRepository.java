package br.lab365.com.LabCar.repository;

import br.lab365.com.LabCar.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
