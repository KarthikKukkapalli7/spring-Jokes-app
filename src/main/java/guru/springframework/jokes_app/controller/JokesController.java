package guru.springframework.jokes_app.controller;


import guru.springframework.jokes_app.Services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService){

        this.jokeService = jokeService;

    }

    @RequestMapping(value = "/")
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "index";
    }





}
