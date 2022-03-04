package mz.com.dio.desafio.dominio;

public class Compositor extends Pessoa{
    private String titulosMusicais;

    public Compositor(String nome, String dataNascimento, String nacionalidade, String titulosMusicais) {
        super(nome, dataNascimento, nacionalidade);
        this.titulosMusicais = titulosMusicais;
    }

    public String getTitulosMusicais() {
        return titulosMusicais;
    }

    public void setTitulosMusicais(String titulosMusicais) {
        this.titulosMusicais = titulosMusicais;
    }

    @Override
    public String toString() {
        return "Compositor{" +
                "Titulos Musicais='" + titulosMusicais + '\'' +
                ", Nome='" + nome + '\'' +
                ", DataNascimento='" + dataNascimento + '\'' +
                ", Nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
