package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    /*
        3. Create a service to return joke string from class -
        guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote()
     */
    public String getRandomQuote() {

        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
