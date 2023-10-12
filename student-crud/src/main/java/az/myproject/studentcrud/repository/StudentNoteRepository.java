package az.myproject.studentcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.myproject.studentcrud.model.StudentNote;

public interface StudentNoteRepository extends JpaRepository<StudentNote, Integer> {
public List<StudentNote> findAllByStudentId(Integer studentId);
}
