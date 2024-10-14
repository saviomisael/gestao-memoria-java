package med.voll.api.controller;

import med.voll.api.domain.TesteDTO;
import med.voll.api.domain.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teste")
public class TesteController {
    @Autowired
    private TesteRepository testeRepository;

    @PostMapping
    public TesteDTO getOne(@RequestBody TesteDTO body) {
//        testeRepository.save(body); gera erro pois é um record
        return body;
    }
}
