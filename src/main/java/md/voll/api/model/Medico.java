package md.voll.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import md.voll.api.DTO.MedicoDTO;
import md.voll.api.enums.Especialidade;

@Data
@Entity
@NoArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id")
    private Endereco endereco;

    public Medico(MedicoDTO medicoDTO){
        this.id = null;
        this.nome = medicoDTO.getNome();
        this.email = medicoDTO.getEmail();
        this.telefone = medicoDTO.getTelefone();
        this.crm = medicoDTO.getCrm();
        this.especialidade = medicoDTO.getEspecialidade();
        this.endereco = new Endereco(medicoDTO.getEndereco());
    }

}