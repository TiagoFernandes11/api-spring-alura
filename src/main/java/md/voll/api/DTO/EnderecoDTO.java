package md.voll.api.DTO;

import lombok.Data;

//@Entity
@Data
public class EnderecoDTO {

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;
}
