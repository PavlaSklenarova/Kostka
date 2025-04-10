package cz.pavla.controllers;

import cz.pavla.models.dto.KostkaDTO;
import cz.pavla.models.service.KostkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class KostkaController
{
    @Autowired
    private KostkaService kostkaService;
    @RequestMapping("/kostka")
    @GetMapping
    public String renderKostka(@ModelAttribute KostkaDTO kostkaDTO)
    {
       return "pages/index";
    }

    /**
     * Potřebuju získat číslo, ne celou šablonu
     * @param kostkaDTO DTO přepravka s počtem stěn
     * @return náhodné číslo v rozsahu od 1 do počtu stěn zvolené kostky
     */

    @PostMapping("/kostka")
    @ResponseBody
    public KostkaDTO vygenerujHod(@RequestBody KostkaDTO kostkaDTO)
    {
       return kostkaService.vygenerujHod(kostkaDTO);
    }

}
