package br.com.fiap.bo.impl;

import javax.ejb.Stateless;

import br.com.fiap.bo.DisciplinaBO;

@Stateless
public class DisciplinaBOImpl implements DisciplinaBO{

	@Override
	public double calcularMedia(double nac, double am, double ps) {
		// TODO Auto-generated method stub
		
		return (nac * 0.2) + (am * 0.3) + (ps * 0.5);
	}

	@Override
	public boolean verificarFalta(int faltas, int aulas) {
		// TODO Auto-generated method stub
		
		return faltas > aulas * 0.25;
	}

}
