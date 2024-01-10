package games;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;


public class TestVideoGames {
    public static void main(String[] args) {
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("The Witcher3", "CD Projekt", 10.0f));
        games.add(new VideoGame("hfwauhfawawfawfaw", "Rockstar Games", 5.0f));
        games.add(new VideoGame("game", "developer3", 7.0f));
        games.add(new VideoGame("games4", "developer4", 5.0f));
        System.out.println("Before sort: ");
        for(VideoGame game : games){
            System.out.println(game);
        }
        System.out.println("After sort: ");
        Collections.sort(games);
        for(VideoGame game : games){
            System.out.println(game);
        }

    }
}
