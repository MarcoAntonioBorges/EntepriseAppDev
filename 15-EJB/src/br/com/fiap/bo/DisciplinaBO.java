package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface DisciplinaBO {
	
	double calcularMedia(double nac, double am, double ps);
	
	boolean verificarFalta(int faltas, int aulas);
}
