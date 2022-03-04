package mz.com.dio.desafio.dominio;

public class Album {

    private String nome;
    private Musica musicas;

    public Album(String nome, Musica musicas) {
        this.nome = nome;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Musica getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nome='" + nome + '\'' +
                "\n"+ musicas +
                '}';
    }
}
