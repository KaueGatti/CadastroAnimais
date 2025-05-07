package APIs;

import java.net.URL;

public class RickAndMorty {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://rickandmortyapi.com/api/character/240");
        System.out.println(url);
    }
}
