import java.util.Objects;

public class Contato {
    public String nome;
    public String numeroTelefone;

    public Contato(String nome, String numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" Numero: "+numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(numeroTelefone, contato.numeroTelefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroTelefone);
    }
}
