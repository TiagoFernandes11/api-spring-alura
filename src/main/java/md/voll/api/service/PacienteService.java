package md.voll.api.service;

import md.voll.api.DTO.PacienteDTO;
import md.voll.api.model.Paciente;
import md.voll.api.repository.EnderecoRepository;
import md.voll.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public boolean salvarPaciente(PacienteDTO pacienteDTO){
        Paciente paciente = new Paciente(pacienteDTO);
        if(pacienteRepository.findByCpf(paciente.getCpf()).isEmpty()){
            pacienteRepository.save(paciente);
            enderecoRepository.save(paciente.getEndereco());
            return true;
        } else {
            return false;
        }
    }
}
