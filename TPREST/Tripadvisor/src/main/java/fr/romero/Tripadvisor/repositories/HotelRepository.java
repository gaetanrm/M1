package fr.romero.Tripadvisor.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.romero.Tripadvisor.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

	//Select * from Hotel where id="x"
	Optional<Hotel> findById(Long id);
	
	//Select * from Hotel
	List<Hotel> findAll();
}
