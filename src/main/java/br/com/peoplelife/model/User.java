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
@Table(name = "tbl_user")
public class User implements Serializable {
	private static final long serialVersionUID = 3527615827091191953L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String nome;

	private String cpf;

	private String email;

	private String senha;

	private Date nascimento;

	private Double peso;

	private Double altura;

	private Character sexo;

	private Boolean medico;

	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "user_tipo", 
        joinColumns = { @JoinColumn(name = "user_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "tipo_id") })
        private Set<UserType> tipos;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_image_id")
	private UserImage imagem;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Boolean getMedico() {
		return medico;
	}

	public void setMedico(Boolean medico) {
		this.medico = medico;
	}

	public Set<UserType> getTipo() {
		return tipos;
	}

	public void setTipo(Set<UserType> tipos) {
		this.tipos = tipos;
	}

	public UserImage getImagem() {
		return imagem;
	}

	public void setImagem(UserImage imagem) {
		this.imagem = imagem;
	}

}
