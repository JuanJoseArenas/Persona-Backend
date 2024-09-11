package co.edu.uco.persona.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uco.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
