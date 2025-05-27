import java.util.ArrayList;
import java.util.List;

public class RevistaCientifica {
    private String nome;
    private List<Observer> assinantes = new ArrayList<>();

    public RevistaCientifica(String nome) {
        this.nome = nome;
    }

    public void adicionarAssinante(Observer o) {
        if (o != null && !assinantes.contains(o)) {
            assinantes.add(o);
        }
    }

    public void removerAssinante(Observer o) {
        assinantes.remove(o);
    }

    public void publicar(String publicacao) {
        System.out.println("Revista " + nome + " publicou: " + publicacao);
        notificar(publicacao);
    }

    private void notificar(String publicacao) {
        for (Observer o : assinantes) {
            o.update(nome, publicacao);
        }
    }
}