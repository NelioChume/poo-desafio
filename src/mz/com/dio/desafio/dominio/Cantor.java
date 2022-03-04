package mz.com.dio.desafio.dominio;

import java.util.Set;

public class Cantor extends Pessoa {

    private String nomeArtistico;

    public Cantor(String nome, String dataNascimento, String nacionalidade, String nomeArtistico) {
        super(nome, dataNascimento, nacionalidade);
        this.nomeArtistico = nomeArtistico;
    }


    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "Nome Artistico='" + nomeArtistico + '\'' +
                ", Nome='" + nome + '\'' +
                ", Data Nascimento='" + dataNascimento + '\'' +
                ", Nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
