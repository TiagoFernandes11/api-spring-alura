package md.voll.api.service;

import md.voll.api.DTO.DadosListagemMedicosDTO;
import md.voll.api.DTO.MedicoDTO;
import md.voll.api.model.Medico;
import md.voll.api.repository.EnderecoRepository;
import md.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<DadosListagemMedicosDTO> getMedicos(){
        List<Medico> medicos = medicoRepository.findAll();
        List<DadosListagemMedicosDTO> dadosListagemMedicosDTO = new ArrayList<>();
        for(Medico medico : medicos){
            dadosListagemMedicosDTO.add(
                    new DadosListagemMedicosDTO(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade())
            );
        }
        return dadosListagemMedicosDTO;
    }
}
