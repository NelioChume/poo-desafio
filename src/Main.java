import mz.com.dio.desafio.dominio.Cantor;
import mz.com.dio.desafio.dominio.Compositor;
import mz.com.dio.desafio.dominio.Musica;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Cantor> abel = new LinkedHashSet<>();
        Set<Compositor> compositor1 = new LinkedHashSet<>();
        Set<Musica> musicas = new LinkedHashSet<>();



        abel.add(new Cantor("Abel", "20-02-1990", "Canadense", "The Weeknd"));
        compositor1.add(new Compositor("Abel", "20-02-1990", "Canadense", "Less than zero"));
        musicas.add(new Musica(abel, compositor1, "Less than Zero", "Dance80", "07-01-2022",
                "00:03:40", "5Mbs"));

        System.out.println(musicas.toString());

    }
}
