package com.example.registrationlogindemo.entity;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "HORARIO")
public class Horario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HORARIO")
	private Long id;
	@Column(name="COMIENZA")
	private LocalTime comienza;
	@Column(name="TERMINA")
	private LocalTime termina;
	@ManyToOne
	@JoinColumn(name="ID_ENF")
	Enfermero enfermero;
	@ManyToOne
	@JoinColumn(name="ID_MED")
	Medico medico;
	@OneToMany(mappedBy="horario")
	List<TramoHorario> tramoHorarios;

}
