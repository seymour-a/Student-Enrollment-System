package az.myproject.studentcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentNote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String note;
private Integer studentId;
}
