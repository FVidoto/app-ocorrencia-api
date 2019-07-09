package com.vidoto.appocorrencia.api.entities;


import java.io.Serializable ;
import java.util.Date ;
import javax.persistence.Column ;
import javax.persistence.Entity ;
import javax.persistence.PrePersist ;
import javax.persistence.PreUpdate ;
import javax.persistence.Table ;

@Entity
@Table ( name = "produto" )

public class Produto implements Serializable {
	private static final long serialVersionUID = 3960436649365666213L;
	private String codigo ;
	private String descricao ;
	private Date dataCriacao ;
	private Date dataAtualizacao ;
	public Produto () {
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
