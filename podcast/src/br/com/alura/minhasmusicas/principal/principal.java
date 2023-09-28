package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.musica;
import br.com.alura.minhasmusicas.modelos.podcast;

public class principal {
    public static void main(String[] args) {
        musica minhaMusica = new musica();
        minhaMusica.setTitulo("forever");
        minhaMusica.setCantor("kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("bolhaDev");
        meuPodcast.setApresentador("marcus mendes");

        for (int i = 0; i < 44; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
