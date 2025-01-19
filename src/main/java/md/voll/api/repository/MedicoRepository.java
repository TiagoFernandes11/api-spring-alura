package md.voll.api.repository;

import md.voll.api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    public Optional<Medico> findByCrm(String crm);
}
