package guru.springframework.jokes_app.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes ;
    public JokeServiceImpl() {
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
