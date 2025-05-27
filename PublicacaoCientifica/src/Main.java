public class Main {
    public static void main(String[] args) {
        RevistaCientifica revista = new RevistaCientifica("Pesquisas e Sistemas");

        Pesquisador p1 = new Pesquisador("Dr. Álekiss Melo");
        Pesquisador p2 = new Pesquisador("Dra. Hanielly Marques");
        Pesquisador p3 = new Pesquisador("Dr. Bruno Daniel");
        Pesquisador p4 = new Pesquisador("Dr. Rafael Santos");

        revista.adicionarAssinante(p1);
        revista.adicionarAssinante(p2);
        revista.adicionarAssinante(p3);
        revista.adicionarAssinante(p4);



        revista.publicar("Artigo: O java observando o Observer");
        revista.publicar("Edição Especial: O padrão de projeto mais amado");
        revista.publicar("Destaque: Participação especial na página 27");
    }
}
