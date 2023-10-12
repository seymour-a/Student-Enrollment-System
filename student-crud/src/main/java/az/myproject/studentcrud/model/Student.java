package az.myproject.studentcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@NotEmpty(message = "Boş qoymaq olmaz!")
@Size(min=2,message="Minimum 2 simvol yazılmalıdır!")
@Size(max=30,message="Maximum 30 simvol yazılmalıdır!")
private String name;
@NotEmpty(message = "Boş qoymaq olmaz!")
@Size(min=2,message="Minimum 2 simvol yazılmalıdır!")
@Size(max=30,message="Maximum 30 simvol yazılmalıdır!")
private String surname;
}
