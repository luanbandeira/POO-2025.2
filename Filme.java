public class Filme {
    private String titulo;
    private String genero;
    private int ano;

    public Filme(String titulo, String genero, int ano){
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.ano = ano;
        this.ano = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return "titulo: " + titulo + " genero: " + genero + " ano de lançamento: " + ano;
    }
}
