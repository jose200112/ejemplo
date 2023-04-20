package com.example.registrationlogindemo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "ENFERMERO")
public class Enfermero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENF")
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDOS")
	private String apellidos;
	@Column(name = "DNI", length = 9)
	private String dni;
	@OneToOne(mappedBy = "enfermero")
	User cuenta;
	@OneToMany(mappedBy = "enfermero")
	List<Usuario> usuarios;
	@OneToMany(mappedBy = "enfermero")
	List<Vacuna> vacunas;
	@OneToMany(mappedBy="enfermero")
	List<Horario> horarios;
}
