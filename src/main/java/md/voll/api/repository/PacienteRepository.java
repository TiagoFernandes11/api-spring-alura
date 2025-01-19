package md.voll.api.repository;

import md.voll.api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    public Optional<Paciente> findByCpf(String cpf);
}
