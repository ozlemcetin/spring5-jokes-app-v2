package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {


    /*
        4. Create Jokes Controller with one method mapped to context root - (“/“, “”)
        5. To the model being returned, add a property of “joke” with value of Chuck Norris quote from
        service
        6. Return view name of “index”
     */
    private final QuoteService quoteService;

    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    @RequestMapping({"", "/"})
    public String getJoke(Model model) {

        String joke = quoteService.getRandomQuote();
        model.addAttribute("joke", joke);

        return "index";
    }
}
