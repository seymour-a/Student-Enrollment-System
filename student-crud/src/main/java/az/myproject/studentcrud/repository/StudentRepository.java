package az.myproject.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.myproject.studentcrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
