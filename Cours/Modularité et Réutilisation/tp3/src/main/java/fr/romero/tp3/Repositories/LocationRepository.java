package fr.romero.tp3.Repositories;

import fr.romero.tp3.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {}

