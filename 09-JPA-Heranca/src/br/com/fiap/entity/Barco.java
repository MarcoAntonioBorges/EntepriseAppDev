package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("B")

@Entity
@Table(name="T_BARCO")
public class Barco extends Veiculo{

	@Column(name="NR_PES")
	private double pes;
	
	@Column(name="DS_TIPO_BARCO")
	private TipoBarco tipobarco;
	
	public double getPes() {
		return pes;
	}

	
	
	public Barco() {
		super();
	}



	public Barco(double velocidade, String nome, double pes, TipoBarco tipobarco) {
		super(velocidade, nome);
		this.pes = pes;
		this.tipobarco = tipobarco;
	}



	public void setPes(double pes) {
		this.pes = pes;
	}

	public TipoBarco getTipobarco() {
		return tipobarco;
	}

	public void setTipobarco(TipoBarco tipobarco) {
		this.tipobarco = tipobarco;
	}

	
	
}
