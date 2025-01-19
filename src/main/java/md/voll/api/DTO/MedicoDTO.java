package md.voll.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import md.voll.api.enums.Especialidade;

//@Entity
@Data
public class MedicoDTO {

    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    private String nome;

    @NotBlank(message = "O email não pode ser nulo ou vazio")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotBlank(message = "O numero não pode ser nulo ou vazio")
    @Pattern(regexp = "^[0-9]{11}$", message = "O numero deve seguir o padrão dddnumero exemplo 11999999999")
    private String telefone;

    @NotBlank(message = "O crm não pode ser nulo ou vazio")
    @Pattern(regexp = "^[0-9]{4,6}$", message = "O crm deve ter 4 a 6 dígitos de 0-9")
    private String crm;

    @NotNull(message = "A especialidade não pode ser nulo")
    @Valid
    private Especialidade especialidade;

    @NotNull(message = "O endereço não pode ser nulo")
    private EnderecoDTO endereco;
}
