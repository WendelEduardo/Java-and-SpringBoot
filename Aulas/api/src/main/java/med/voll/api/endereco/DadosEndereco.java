package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

public final class DadosEndereco {
    @NotBlank
    private final String logradouro;
    @NotBlank
    private final String bairro;
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private final String cep;
    @NotBlank
    private final String cidade;
    @NotBlank
    private final String uf;
    private final String complemento;
    private final String numero;

    public DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String logradouro() {
        return logradouro;
    }

    public String bairro() {
        return bairro;
    }

    public String cep() {
        return cep;
    }

    public String cidade() {
        return cidade;
    }

    public String uf() {
        return uf;
    }

    public String complemento() {
        return complemento;
    }

    public String numero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DadosEndereco) obj;
        return Objects.equals(this.logradouro, that.logradouro) &&
                Objects.equals(this.bairro, that.bairro) &&
                Objects.equals(this.cep, that.cep) &&
                Objects.equals(this.cidade, that.cidade) &&
                Objects.equals(this.uf, that.uf) &&
                Objects.equals(this.complemento, that.complemento) &&
                Objects.equals(this.numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, bairro, cep, cidade, uf, complemento, numero);
    }

    @Override
    public String toString() {
        return "DadosEndereco[" +
                "logradouro=" + logradouro + ", " +
                "bairro=" + bairro + ", " +
                "cep=" + cep + ", " +
                "cidade=" + cidade + ", " +
                "uf=" + uf + ", " +
                "complemento=" + complemento + ", " +
                "numero=" + numero + ']';
    }

}