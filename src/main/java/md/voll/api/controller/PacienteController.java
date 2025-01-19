package md.voll.api.controller;

import md.voll.api.DTO.PacienteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public ResponseEntity<PacienteDTO> postPaciente(@RequestBody PacienteDTO paciente){
        return ResponseEntity.status(HttpStatus.OK).body(paciente);
    }
}
