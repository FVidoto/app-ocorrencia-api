package com.vidoto.appocorrencia.api.entities;

import java.io.Serializable ;
import java.util.Date;

import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.EnumType ;
import javax.persistence.Enumerated ;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table ;

import com.vidoto.appocorrencia.api.enums.TipoEnum ;
import com.vidoto.appocorrencia.api.entities.Usuario;;

@Entity
@Table ( name = "ocorrencia" )
public class Ocorrencia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6301429284290720279L;
	/**
	 * 
	 */
	private Long id ;
	private Date data ;
	private TipoEnum tp_ocorrencia ;
	private String descricao ;
	private String localizacao ;
	private Usuario usuario ;
	private Date dataCriacao ;
	private Date dataAtualizacao ;

	/*private Date dataCriacaoOco ;
	/*private Date dataAtualizacao ;*/

	public Ocorrencia() {
	}
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	public Long getId () {
	return id ;
	}
	public void setId ( Long id ) {
	this.id = id ;
	}
	
	@Column ( name = "data" , nullable = false )
	public Date getData () {
		return data ;
	}
	public void setData ( Date data ) {
		this.data = data ;
	}

    @Enumerated ( EnumType.STRING )
	@Column ( name = "tp_ocorrencia" , nullable = false )
	public TipoEnum getPerfil () {
	return tp_ocorrencia ;
	}
	public void setPerfil ( TipoEnum tp_ocorrencia ) {
	this.tp_ocorrencia = tp_ocorrencia ;
	}

	
	
	@Column ( name = "descricao" , nullable = false )
	public String getDescricao () {
	return descricao ;
	}
	public void setDescricao ( String descricao ) {
	this.descricao = descricao ;
	}
	@Column ( name = "localizacao" , nullable = false )
	public String getLocalizacao () {
	return localizacao ;
	}
	public void setLocalizacao ( String localizacao ) {
	this.localizacao = localizacao ;
	}

			
	@ManyToOne(fetch = FetchType.EAGER)
	public Usuario getUsuario() {
		return usuario ;
	}
	
	public void setUsuario ( Usuario usuario ) {
		this.usuario = usuario ;
	}
	
	@Column ( name = "data_criacao" , nullable = false )
	public Date getDataCriacao () {
		return dataCriacao ;
	}
	public void setDataCriacao ( Date dataCriacao ) {
		this.dataCriacao = dataCriacao ;
	}
	
	@Column ( name = "data_atualizacao" , nullable = false )
	public Date getDataAtualizacao () {
		return dataAtualizacao ;
	}
	public void setDataAtualizacao ( Date dataAtualizacao ) {
		this.dataAtualizacao = dataAtualizacao ;
	}
	
		@PreUpdate
	public void preUpdate () {
		dataAtualizacao = new Date ();
	}
	
	@PrePersist
	public void prePersist () {
		final Date atual = new Date ();
		dataCriacao = atual ;
		dataAtualizacao = atual ;
	}

	@Override
	public String toString () {
		return "Ocorrencia [id=" 			+ 	id  
				+ " data " 					+	data 
				+ " tp_ocorrencia " 		+	tp_ocorrencia  
				+ " descricao " 			+	descricao 
				+ " localizacao " 			+	localizacao 
				+ " usuario " 				+	usuario 
				+ " dataCriacao " 			+	dataCriacao 
				+ " dataAtualizacao " 		+	dataAtualizacao 				
				+ "]";
	}
	

}
	
