package md.voll.api.controller;

import jakarta.validation.Valid;
import md.voll.api.DTO.DadosListagemMedicosDTO;
import md.voll.api.DTO.MedicoDTO;
import md.voll.api.DTO.ResponseDTO;
import md.voll.api.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/medicos", produces = "application/json")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @PostMapping
    public ResponseEntity<ResponseDTO> postMedico(@RequestBody @Valid MedicoDTO medico){
        if(medicoService.saveMedico(medico)){
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(201, "Criado com sucesso"));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO(400, "Bad request: Esse crm ja esta cadastrado"));
        }
    }

    @GetMapping
    public List<DadosListagemMedicosDTO> listar(){
        return medicoService.getMedicos();
    }
}
