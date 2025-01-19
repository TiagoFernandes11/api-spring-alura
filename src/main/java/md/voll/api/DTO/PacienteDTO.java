package md.voll.api.DTO;

import lombok.Data;

@Data
public class PacienteDTO {
    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    private EnderecoDTO endereco;
}
