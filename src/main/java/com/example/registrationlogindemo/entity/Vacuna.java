package com.example.registrationlogindemo.entity;


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
@Table(name = "VACUNA")
public class Vacuna {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVac;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DOSIS")
	private int dosis;
	@Column(name = "NUM_LOTE")
	private int numLote;
	@ManyToOne
	@JoinColumn(name = "ID_ENF")
	private Enfermero enfermero;
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
}
