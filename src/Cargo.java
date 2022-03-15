import java.io.Serializable;

public class Cargo implements Serializable{
    private Long codigo;
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public Cargo(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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
}
