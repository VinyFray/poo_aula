import java.util.ArrayList;
import java.util.List;

public class YellowPage {
    private List<Contato> contatos;

    public YellowPage(List<Contato> contatos){
        this.contatos = contatos;
    }

    public YellowPage(){
        this.contatos = new ArrayList<>();
    }

    public Contato buscarContato(String nome){
        for (Contato contato : this.contatos){
            if (contato.nome.equalsIgnoreCase(nome)) return contato;
        }
        return null;
    }

    public void salvarContato(Contato contato){
        this.contatos.add(contato);
    }

    public Contato removerConatato(Contato contato){
        int indexe = this.contatos.indexOf(contato);
        return this.contatos.remove(indexe);
    }

    @Override
    public String toString() {
        return "YellowPage{" +
                "contatos=" + contatos +
                '}';
    }
}
