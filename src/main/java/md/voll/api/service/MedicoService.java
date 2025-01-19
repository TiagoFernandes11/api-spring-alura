package md.voll.api.service;

import md.voll.api.DTO.MedicoDTO;
import md.voll.api.model.Medico;
import md.voll.api.repository.EnderecoRepository;
import md.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public boolean saveMedico(MedicoDTO medicoDTO){
        Medico medico = new Medico(medicoDTO);
        if(medicoRepository.findByCrm(medico.getCrm()).isEmpty()){
            medicoRepository.save(medico);
            enderecoRepository.save(medico.getEndereco());
            return true;
        } else {
            return false;
        }
    }
}
