package br.com.fiap.exercicio;

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

	@Entity 
	@Table(name="TB_Cliente")
	@SequenceGenerator (name="cliente", sequenceName="SQ_TB_CLIENTE", allocationSize=1)
	public class Clientee implements Serializable{
		
		@Id
		@Column(name="CD_Cliente") 
		@GeneratedValue(generator="cliente",strategy=GenerationType.SEQUENCE)
		private int id;
		
		@Column(name="NM_NOME", nullable=false, length= 150)
		private String name;
		
		@Column(name="DT_ANIVERSARIO", nullable=false)
		@Temporal(TemporalType.DATE)
		private Calendar aniversario;
		
		@Column(name="CD_CARTAO")
		private String codigoCartao;
		
		@Enumerated(EnumType.STRING)
		@Column(name="TP_SEXO", nullable=false)
		private Sexo sexo;
		
		@Lob
		@Column(name="FL_FOTO")
		private byte [] foto;
		
		@Column(name="ST_STATUS")
		private Status status;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Calendar getAniversario() {
			return aniversario;
		}

		public void setAniversario(Calendar aniversario) {
			this.aniversario = aniversario;
		}

		public String getCodigoCartao() {
			return codigoCartao;
		}

		public void setCodigoCartao(String codigoCartao) {
			this.codigoCartao = codigoCartao;
		}

		public Sexo getSexo() {
			return sexo;
		}

		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}

		public byte[] getFoto() {
			return foto;
		}

		public void setFoto(byte[] foto) {
			this.foto = foto;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Clientee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Clientee(String name, Calendar aniversario, String codigoCartao, Sexo sexo, byte[] foto, Status status) {
			super();
			this.name = name;
			this.aniversario = aniversario;
			this.codigoCartao = codigoCartao;
			this.sexo = sexo;
			this.foto = foto;
			this.status = status;
		}
		
		
	}


