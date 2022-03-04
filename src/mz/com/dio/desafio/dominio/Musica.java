package mz.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Musica {

    private Set<Cantor> cantor = new LinkedHashSet<>();
    private Set<Compositor> compositor = new LinkedHashSet<>();
    private String titulo;
    private String generoMusica;
    private String dataLancamento ;
    private String duracao;
    private String size;

    public Musica(Set<Cantor> cantor, Set<Compositor> compositor,
                  String titulo, String generoMusica, String dataLancamento, String duracao, String size) {
        this.cantor = cantor;
        this.compositor = compositor;
        this.titulo = titulo;
        this.generoMusica = generoMusica;
        this.dataLancamento = dataLancamento;
        this.duracao = duracao;
        this.size = size;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "\n"+cantor +
                "\n"+compositor +
                "\nTitulo='" + titulo + '\'' +
                ", Genero Musica='" + generoMusica + '\'' +
                ", Data Lancamento='" + dataLancamento + '\'' +
                ", Duracao='" + duracao + '\'' +
                ", Size='" + size + '\'' +
                '}';
    }
}
