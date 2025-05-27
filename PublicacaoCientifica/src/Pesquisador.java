public class Pesquisador implements Observer {
    private String nome;

    public Pesquisador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String nomeRevista, String publicacao) {
        System.out.println(nome + " foi notificado: Nova publicação na " + nomeRevista + ": " + publicacao);
    }
}
