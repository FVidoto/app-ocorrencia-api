package com.vidoto.appocorrencia.api.entities;


import java.io.Serializable ;
import java.util.Date ;
import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist ;
import javax.persistence.PreUpdate ;
import javax.persistence.Table ;

@Entity
@Table ( name = "produto" )

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1573007688652060451L;
	private Long id ;
	private String codigo ;
	private String descricao ;
	private Date dataCriacao ;
	private Date dataAtualizacao ;
	public Produto () {
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
	
	@Column ( name = "descricao" , nullable = false )
	public String getDescricao () {
		return descricao ;
	}
	public void setDescricao ( String descricao ) {
		this.descricao = descricao ;
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
		return "Produto [codigo=" + codigo + ", descricao=" +
				descricao + ", descricao=" + descricao + 
				",dataCriacao=" + dataCriacao + 
				",dataAtualizacao=" + dataAtualizacao + "]" ;
	}
}
