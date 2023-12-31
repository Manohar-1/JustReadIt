package com.justreadit.blog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name="roles")
@Setter 
@Getter 
@NoArgsConstructor
public class Role {

	@Id
	private Integer id; 
	private String role; 
	
	
}
