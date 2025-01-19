package md.voll.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import md.voll.api.DTO.EnderecoDTO;
import md.voll.api.DTO.PacienteDTO;

@Data
@Entity
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id")
    private Endereco endereco;

    public Paciente(PacienteDTO pacienteDTO){
        this.id = null;
        this.nome = pacienteDTO.getNome();
        this.email = pacienteDTO.getEmail();
        this.telefone = pacienteDTO.getTelefone();
        this.cpf = pacienteDTO.getCpf();
        this.endereco = new Endereco(pacienteDTO.getEndereco());
    }
}
