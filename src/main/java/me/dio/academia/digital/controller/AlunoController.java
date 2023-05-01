package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;


    @GetMapping
    public List<Aluno> getAlunos(){
      return alunoService.getAll();
    }

    @PostMapping
    public Aluno createAluno(@RequestBody AlunoForm aluno){
      return alunoService.create(aluno);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAvaliacoesByAluno(@PathVariable Long id){
      return alunoService.getAvaliacoesByAluno(id);
    }

}
