public class LocadoraEstoque {
    public static void main(String[] args) {
        
        Locadora locadora = new Locadora("Locadora Snug Buck");

        Filme f1 = new Filme("interestelar", "Ficção Científica", 2014);
        Filme f2 = new Filme("Os incríveis 2", "animação", 2018);
        Filme f3 = new Filme("Shrek 2", "Comédia"); // ano indefinido

        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);
        locadora.adicionarFilme(f3);

        
        locadora.listarFilmes();
    }
    
}
