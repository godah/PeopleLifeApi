package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_procedimento")
public class Procedure implements Serializable {
	private static final long serialVersionUID = 3527212827091191953L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String titulo;

	private String descricao;

	private String local;

	private Date data;

	private String observacao;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "procedure_attachs", 
			joinColumns = {@JoinColumn(name = "procedure_id") }, 
			inverseJoinColumns = {@JoinColumn(name = "attach_id") })
	private Set<MedicalCareAttachments> attachs;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	private User user;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "procedure_type_id", nullable = false, insertable = false, updatable = false)
	private ProcedureType procedureType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Set<MedicalCareAttachments> getAttachs() {
		return attachs;
	}

	public void setAttachs(Set<MedicalCareAttachments> attachs) {
		this.attachs = attachs;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ProcedureType getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(ProcedureType procedureType) {
		this.procedureType = procedureType;
	}

}
