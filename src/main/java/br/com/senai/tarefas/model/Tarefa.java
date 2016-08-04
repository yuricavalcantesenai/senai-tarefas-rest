package br.com.senai.tarefas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "resumo")
	private String resumo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "data_execucao")
	@Temporal(TemporalType.DATE)
	private Date dataExecucao;
	
	@Column(name = "situacao")
	private String situacao;

	public Tarefa() {
		super();
	}

	public Tarefa(int id, String resumo, String descricao, Date dataExecucao, String situacao) {
		super();
		this.id = id;
		this.resumo = resumo;
		this.descricao = descricao;
		this.dataExecucao = dataExecucao;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", resumo=" + resumo + ", descricao=" + descricao + ", dataExecucao=" + dataExecucao
				+ ", situacao=" + situacao + "]";
	}
}
