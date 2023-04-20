package com.example.registrationlogindemo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDOS")
	private String apellidos;
	@Column(name = "DNI", length = 9)
	private String dni;
	@OneToOne(mappedBy = "usuario")
	User cuenta;
	@ManyToOne
	@JoinColumn(name = "ID_MED")
	Medico medico;
	@ManyToOne
	@JoinColumn(name = "ID_ENF")
	Enfermero enfermero;
	@OneToMany(mappedBy = "usuario")
	List<Vacuna> vacunas;
	@OneToMany(mappedBy = "usuario")
	List<Mensaje> mensajes;

}
