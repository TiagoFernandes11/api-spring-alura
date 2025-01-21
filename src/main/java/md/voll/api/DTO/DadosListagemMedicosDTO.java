package md.voll.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import md.voll.api.enums.Especialidade;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosListagemMedicosDTO {

    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
}
