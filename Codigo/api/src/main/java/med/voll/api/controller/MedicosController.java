package med.voll.api.controller;

import med.voll.api.medicos.DadosCadastroMedicos;

import med.voll.api.medicos.Medico;
import med.voll.api.medicos.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicosController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){
        System.out.println(dados);
        Medico novoMedico = new Medico(dados);
        repository.save(novoMedico);
        //repository.save(new Medico(dados));
    }
}
