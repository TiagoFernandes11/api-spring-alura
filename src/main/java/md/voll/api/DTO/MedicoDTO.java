package md.voll.api.DTO;

import lombok.Data;

//@Entity
@Data
public class MedicoDTO {
    public enum Especialidade{
        Ortopedia,
        Cardiologia,
        Ginecologia,
        Dermatologia
    }

    private String nome;

    private String email;

    private String telefone;

    private String crm;

    private Especialidade especialidade;

    private EnderecoDTO endereco;
}
