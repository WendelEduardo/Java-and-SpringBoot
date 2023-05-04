package med.voll.api.domain.paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.nome, paciente.email, paciente.cpf);
    }
}
