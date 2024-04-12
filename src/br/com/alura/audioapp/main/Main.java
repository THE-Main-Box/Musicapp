package br.com.alura.audioapp.main;

import br.com.alura.audioapp.mediamodels.Audio;
import br.com.alura.audioapp.mediamodels.Liked;
import br.com.alura.audioapp.mediamodels.Music;
import br.com.alura.audioapp.mediamodels.Podcast;

public class Main {
    public static void main(String[] args) {

        Music highHopes = new Music("High Hopes", 3, "Panic at Disco", "gtjdwqewdsad");
        Music immortals = new Music("Immortals", 3, "Fallout Boys", "yes");
        Podcast gym = new Podcast("GymPod", 2.30, "Academia");

        immortals.play();
        highHopes.play();
        gym.play();

        immortals.like();
        highHopes.like();
        gym.like();

        immortals.showDetailsAbout();
        highHopes.showDetailsAbout();
        gym.showDetailsAbout();

        Liked fav = new Liked(highHopes, immortals, gym);

    }
}
