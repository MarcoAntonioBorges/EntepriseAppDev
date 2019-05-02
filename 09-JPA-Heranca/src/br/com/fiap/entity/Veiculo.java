package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="DS_TIPO")
@DiscriminatorValue("V")

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="veiculo", sequenceName="SQ_T_VEICULO", allocationSize=1)
public class Veiculo {
	
	@Id
	@Column(name="CD_CODIGO")
	@GeneratedValue(generator="veiculo", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NR_VELOCIDADE")
	private double velocidade;
	
	@Column(name="DS_NOME")
	private String nome;

	
	public Veiculo() {
		super();
	}
	
	

	public Veiculo(double velocidade, String nome) {
		super();
		this.velocidade = velocidade;
		this.nome = nome;
	}



	public Veiculo(int codigo, double velocidade, String nome) {
		super();
		this.codigo = codigo;
		this.velocidade = velocidade;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
