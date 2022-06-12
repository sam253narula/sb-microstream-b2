package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String number;
	
//	@OneToOne
//	private Student student;
	
	@OneToOne(mappedBy = "passport")
	private Student student;

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}
	
}