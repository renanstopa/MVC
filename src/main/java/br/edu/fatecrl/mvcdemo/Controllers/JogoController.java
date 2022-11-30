package br.edu.fatecrl.mvcdemo.Controllers;

import br.edu.fatecrl.mvcdemo.Models.Jogo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jogos")
public class JogoController {

    private static final List<Jogo> jogos = new ArrayList<Jogo>();

    public JogoController() {
        jogos.add(new Jogo("Stardew Valley", 23.00, 104, "Computador"));
        jogos.add(new Jogo("Halo Reach", 15.00, 534, "Xbox 360"));
        jogos.add(new Jogo("The Sims", 60.00, 251, "Computador"));
        jogos.add(new Jogo("Euro Truck Simulator", 12.00, 36, "Computador"));
    }

    @GetMapping
    public String getJogos(Model model) {
        model.addAttribute("jogos", jogos);
        return "jogos";
    }
}
