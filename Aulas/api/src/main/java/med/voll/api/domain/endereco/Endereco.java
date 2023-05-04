package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;

    private String bairro;

    private String cep;

    private String numero;

    private String complemento;

    private String cidade;

    private String uf;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
        this.cidade = dadosEndereco.cidade();
        this.uf = dadosEndereco.uf();
    }

    public void atualizar(DadosEndereco endereco) {
        if (endereco.logradouro() != null) {
            this.logradouro = endereco.logradouro();
        }
        if (endereco.bairro() != null) {
            this.bairro = endereco.bairro();
        }
        if (endereco.cep() != null) {
            this.cep = endereco.cep();
        }
        if (endereco.numero() != null) {
            this.numero = endereco.numero();
        }
        if (endereco.complemento() != null) {
            this.complemento = endereco.complemento();
        }
        if (endereco.cidade() != null) {
            this.cidade = endereco.cidade();
        }
        if (endereco.uf() != null) {
            this.uf = endereco.uf();
        }
    }
}
