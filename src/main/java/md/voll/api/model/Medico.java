package md.voll.api.model;

import jakarta.persistence.*;
import lombok.Data;
import md.voll.api.DTO.EnderecoDTO;

@Data
@Entity
public class Medico {
    public enum Especialidade {
        Ortopedia,
        Cardiologia,
        Ginecologia,
        Dermatologia
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String email;

    private String telefone;

    private String crm;

    private md.voll.api.DTO.MedicoDTO.Especialidade especialidade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id")
    private Endereco endereco;

}