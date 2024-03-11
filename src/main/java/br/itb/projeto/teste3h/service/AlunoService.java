package br.itb.projeto.teste3h.service;

import java.util.ArrayList;
import java.util.List;

import br.itb.projeto.pizzaria3h.model.entity.Aluno;
import br.itb.projeto.teste3h.model.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {

	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(98765, "Pêche da Silva", 35);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Pêche da Silva", 35));
		alunos.add(new Aluno(98798, "Chupa-Cabra", 02));
		alunos.add(new Aluno(98687, "Radisvaderol da Cunha", 39));
		return alunos;
	}

	@Override
	public Aluno findByRm(long rm) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Pêche da Silva", 35));
		alunos.add(new Aluno(98798, "Chupa-Cabra", 02));
		alunos.add(new Aluno(98687, "Radisvaderol da Cunha", 39));

		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}
		}
		return null;
	}

}
