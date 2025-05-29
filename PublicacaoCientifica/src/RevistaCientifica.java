import java.util.ArrayList;
import java.util.List;

public class RevistaCientifica {
    private List<Observer> assinantes = new ArrayList<>();
    private String nome;

    public RevistaCientifica(String nome){
        this.nome = nome;
    }

    public void adicionarAssinante(Observer assinante){
        assinantes.add(assinante);
    }

    public void removerAssinante(Observer assinante){
        assinantes.remove(assinante);
    }

    public void publicar(String conteudo){
        System.out.println("Revista " + nome + " publicou: " + conteudo);
        notificarAssinantes(conteudo);
    }

    private void notificarAssinantes(String conteudo){
        for(Observer assinante : assinantes){
            assinante.update(nome, conteudo);
        }
    }
}
