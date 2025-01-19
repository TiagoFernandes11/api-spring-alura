package md.voll.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import md.voll.api.DTO.EnderecoDTO;

@Data
@Entity
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    public Endereco(EnderecoDTO enderecoDTO){
        this.id = null;
        this.logradouro = enderecoDTO.getLogradouro();
        this.numero = enderecoDTO.getNumero();
        this.complemento = enderecoDTO.getComplemento();
        this.bairro = enderecoDTO.getBairro();
        this.cidade = enderecoDTO.getCidade();
        this.uf = enderecoDTO.getUf();
        this.cep = enderecoDTO.getCep();
    }
}
