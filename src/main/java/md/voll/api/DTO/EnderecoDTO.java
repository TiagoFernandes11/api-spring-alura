package md.voll.api.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

//@Entity
@Data
public class EnderecoDTO {

    @NotBlank(message = "O logradouro não pode ser nulo ou vazio")
    private String logradouro;

    private String numero;

    private String complemento;

    @NotBlank(message = "O bairro não pode ser nulo ou vazio")
    private String bairro;

    @NotBlank(message = "A cidade não pode ser nulo ou vazio")
    private String cidade;

    @NotBlank(message = "A UF não pode ser nulo ou vazio")
    private String uf;

    @NotBlank(message = "O CEP não pode ser nulo ou vazio")
    @Pattern(regexp = "^[0-9]{8}$")
    private String cep;
}
