package co.edu.ufps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Personal {
	@Id
	private Integer id;
	private String documento;
	private String nombre;
	private String email;
	private String telefono;
	
}
