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
@Table(name="TRAMO_HORARIO")
public class TramoHorario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TRAMO_HORARIO")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_TRAMO")
	Tramo tramo;
	
	@ManyToOne
	@JoinColumn(name="ID_HORARIO")
	Horario horario;

}
