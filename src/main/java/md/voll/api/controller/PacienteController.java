package md.voll.api.controller;

import jakarta.validation.Valid;
import md.voll.api.DTO.PacienteDTO;
import md.voll.api.DTO.ResponseDTO;
import md.voll.api.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<ResponseDTO> postPaciente(@RequestBody @Valid PacienteDTO pacienteDTO){
        if(pacienteService.salvarPaciente(pacienteDTO)){
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(201, "Paciente criado com sucesso"));
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO(400, "Bad request: CPF ja esta cadastrado"));
        }
    }
}
