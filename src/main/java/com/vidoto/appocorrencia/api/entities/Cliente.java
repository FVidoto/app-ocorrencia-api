package com.vidoto.appocorrencia.api.entities;

import java.io.Serializable ;
import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.EnumType ;
import javax.persistence.Enumerated ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;
import javax.persistence.Table ;
import com.vidoto.appocorrencia.api.enums.PerfilEnum ;

@Entity
@Table ( name = "cliente" )
public class Cliente implements Serializable {
	private static final long serialVersionUID = 306411570471828345L;
	private Long id ;
	private String codigo ;
	private String nome ;
	private String regiao ;
	private String email ;
	private PerfilEnum perfil ;
	public Cliente() {
	}
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	public Long getId () {
	return id ;
	}
	public void setId ( Long id ) {
	this.id = id ;
	}
	@Column ( name = "codigo" , nullable = false )
	public String getCodigo () {
	return codigo ;
	}
	public void setCodigo ( String codigo ) {
	this.codigo = codigo ;
	}
	@Column ( name = "nome" , nullable = false )
	public String getNome () {
	return nome ;
	}
	public void setNome ( String nome ) {
	this.nome = nome ;
	}
	@Column ( name = "regiao" , nullable = false )
	public String getRegiao () {
	return regiao ;
	}
	public void setRegiao ( String regiao ) {
	this.regiao = regiao ;
	}
	@Column ( name = "email" , nullable = false )
	public String getEmail () {
	return email ;
	}
	public void setEmail ( String email ) {
	this.email = email ;
	}
	@Enumerated ( EnumType.STRING )
	@Column ( name = "perfil" , nullable = false )
	public PerfilEnum getPerfil () {
	return perfil ;
	}
	public void setPerfil ( PerfilEnum perfil ) {
	this.perfil = perfil ;
	}
}