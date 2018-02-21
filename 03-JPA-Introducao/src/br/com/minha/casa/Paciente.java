package br.com.minha.casa;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PACIENTE")
@SequenceGenerator(name="paciente", sequenceName="SQ_TB_PACIENTE", allocationSize=1)

public class Paciente implements Serializable{

	@Id
	@Column(name="ID_PACIENTE")
	@GeneratedValue(generator="cliente",strategy=GenerationType.SEQUENCE)
	private int idPaciente;
	
	@Column(name="NM_NOME")
	private String nome;
	
	@Column(name="TP_SEXO", nullable=false)
	private Sexo sexo;
	
	@Column(name="TP_SINTOMAS")
	private String simtomas;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(name="TP_STATUS", nullable=false)
	private Status status;

	public Paciente(String nome, Sexo sexo, String simtomas, Calendar dataNascimento, Status status) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.simtomas = simtomas;
		this.dataNascimento = dataNascimento;
		this.status = status;
	}

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSimtomas() {
		return simtomas;
	}

	public void setSimtomas(String simtomas) {
		this.simtomas = simtomas;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
