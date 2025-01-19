package md.voll.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PacienteDTO {

    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    private String nome;

    @NotBlank(message = "O email não pode ser nulo ou vazio")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotBlank(message = "O numero não pode ser nulo ou vazio")
    @Pattern(regexp = "[0-9]{11}$", message = "O numero deve seguir o padrão dddnumero exemplo 11999999999")
    private String telefone;

    @NotBlank(message = "O CPF não pode ser nulo ou vazio")
    @Pattern(regexp = "^[0-9]{11}$", message = "O cpf só pode conter número e deve conter 11 caracteres")
    private String cpf;

    @NotNull(message = "O endereço não pode ser nulo")
    @Valid
    private EnderecoDTO endereco;
}
