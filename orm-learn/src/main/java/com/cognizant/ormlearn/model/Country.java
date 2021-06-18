package com.cognizant.ormlearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;






@Data
@AllArgsConstructor
@Entity
@Table(name="country")
@NoArgsConstructor
public class Country {

	@Id
	@Column(name="co_code")
	private String code;

	@Column(name="co_name")
	private String name;
	
	

}
