package br.itb.projeto.teste3h.model.repository;

import java.util.List;

import br.itb.projeto.pizzaria3h.model.entity.Aluno;

public interface AlunoRepository {
	Aluno find();

	List<Aluno> findAll();

	Aluno findByRm(long rm);
}
