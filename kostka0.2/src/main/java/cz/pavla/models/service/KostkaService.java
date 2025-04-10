package cz.pavla.models.service;

import cz.pavla.models.dto.KostkaDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class KostkaService
{
    public KostkaDTO vygenerujHod(KostkaDTO kostkaDTO)
    {
        Random random = new Random();
        int vystup = random.nextInt(1, kostkaDTO.getPocetSten() + 1);

        kostkaDTO.setVysledek(vystup);
        return kostkaDTO;
    }
}
