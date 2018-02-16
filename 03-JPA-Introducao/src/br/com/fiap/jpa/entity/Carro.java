package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity 
@Table(name="TB_CARRO")
@SequenceGenerator (name="carro", sequenceName="SQ_TB_CARRO", allocationSize=1)
public class Carro implements Serializable{
	
	@Id
	@Column(name="CD_CARRO") 
	@GeneratedValue(generator="carro",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="DS_MODELO", nullable=false, length=100)
	private String modelo;
	
	//Classe wrapper (Integer) para valores nulos
	@Column(name="NR_ANO")
	private Integer ano;
	
	@Column(name="DS_MOTOR", length=10)
	private String motor;
	
	@Column(name="DS_MONTADORA")
	private String montadora;
	
	@Column(name="DS_PLACA", nullable=false, length=8)
	private String placa;
	
	@Column(name="DT_FABRICACAO")
	@Temporal(TemporalType.DATE)
	private Calendar dataFabricacao;
	
	@Column(name="FL_COLECIONADOR")
	private boolean colecionador;
	
	@Transient //nao sera mapeado para uma coluna no banco de dados
	private boolean pagaIpva;
	
	@Lob //gravar arquivo no banco de dados ( blob)
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TRNSMISSAO")
	private Transmissao transmissao;
	 
	
	

}
