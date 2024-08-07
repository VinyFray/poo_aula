import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        YellowPage paginasAmarelas = new YellowPage();

        paginasAmarelas.salvarContato(new Contato("Raymund", "123974"));
        paginasAmarelas.salvarContato(new Contato("Marcelo", "635647"));


        System.out.println("Antes de deletar");
        System.out.println(paginasAmarelas);
        System.out.println(paginasAmarelas.removerConatato(new Contato("Marcelo", "635647")));
        System.out.println("Depois de deletar");
        System.out.println(paginasAmarelas);

    }
}
