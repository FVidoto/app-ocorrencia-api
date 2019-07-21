package com.vidoto.appocorrencia.api.entities;

import java.io.Serializable ;
import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;
import javax.persistence.Table ;

@Entity
@Table ( name = "usuario" )
public class Usuario implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = -3953653441263441330L;
private Long id ;
private String email ;
private String senha ;
private String perfil ;
public Usuario () {
}
@Id
@GeneratedValue ( strategy = GenerationType.AUTO )
public Long getId () {
return id ;
}
public void setId ( Long id ) {
this.id = id ;
}
@Column ( name = "email" , nullable = false )
public String getEmail () {
return email ;
}
public void setEmail ( String email ) {
this.email = email ;
}

@Column ( name = "perfil" , nullable = false )
public String getPerfil () {
return perfil ;
}
public void setPerfil ( String perfil ) {
this.perfil = perfil ;
}
@Column ( name = "senha" , nullable = false )
public String getSenha () {
return senha ;
}
public void setSenha ( String senha ) {
this.senha = senha ;
}
}