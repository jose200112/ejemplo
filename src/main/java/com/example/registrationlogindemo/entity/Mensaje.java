package com.example.registrationlogindemo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MENSAJE")
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MEN")
	private Long id;

	@Column(name = "FECHA")
	private Date fecha;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	Usuario usuario;
}
