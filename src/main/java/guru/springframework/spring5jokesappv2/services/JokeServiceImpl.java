package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    /*
        3. Create a service to return joke string from class -
        guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote()
     */
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }


    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
