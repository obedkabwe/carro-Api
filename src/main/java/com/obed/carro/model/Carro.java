package com.obed.carro.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "MARCA_ID")
	private String marca_id;
	
	@Column(name = "MARCA_NOME")
	private String marca_nome;
	
	@Column(name = "MODELO")
	private String modelo;
	
	@Column(name = "ANO")
	private String ano;
	
	@Column(name = "COMBUSTIVEL")
	private String combustivel;
	
	@Column(name = "NUM_PORTAS")
	private String num_portas;
	
	@Column(name = "VALOR_FIPE")
	private String valor_fipe;
	
	@Column(name = "COR")
	private String cor;
	
	
	public Carro() {
		
	}

	
	
	






	public Carro(Integer id, String marca_id, String marca_nome, String modelo, String ano, String combustivel,
			String num_portas, String valor_fipe, String cor) {
		super();
		this.id = id;
		this.marca_id = marca_id;
		this.marca_nome = marca_nome;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
		this.num_portas = num_portas;
		this.valor_fipe = valor_fipe;
		this.cor = cor;
	}










	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getMarca_id() {
		return marca_id;
	}





	public void setMarca_id(String marca_id) {
		this.marca_id = marca_id;
	}





	public String getMarca_nome() {
		return marca_nome;
	}





	public void setMarca_nome(String marca_nome) {
		this.marca_nome = marca_nome;
	}





	public String getModelo() {
		return modelo;
	}





	public void setModelo(String modelo) {
		this.modelo = modelo;
	}





	public String getAno() {
		return ano;
	}





	public void setAno(String ano) {
		this.ano = ano;
	}





	public String getCombustivel() {
		return combustivel;
	}





	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}





	public String getNum_portas() {
		return num_portas;
	}





	public void setNum_portas(String num_portas) {
		this.num_portas = num_portas;
	}





	public String getValor_fipe() {
		return valor_fipe;
	}





	public void setValor_fipe(String valor_fipe) {
		this.valor_fipe = valor_fipe;
	}





	public String getCor() {
		return cor;
	}





	public void setCor(String cor) {
		this.cor = cor;
	}





	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
	}


	
	

}