import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario implements Serializable{

    private Departamento departamento;
    private Cargo cargo;
    
    private Long codigo;
    private String nome;

    private LocalDate nascimento;
    private LocalDateTime contratacao;


    public Funcionario(Departamento departamento, Cargo cargo, Long codigo, String nome, LocalDate nascimento,
            LocalDateTime contratacao) {
        this.departamento = departamento;
        this.cargo = cargo;
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.contratacao = contratacao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDateTime getContratacao() {
        return contratacao;
    }

    public void setContratacao(LocalDateTime contratacao) {
        this.contratacao = contratacao;
    }

}
