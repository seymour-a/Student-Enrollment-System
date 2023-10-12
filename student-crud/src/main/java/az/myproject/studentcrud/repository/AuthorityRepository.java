package az.myproject.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.myproject.studentcrud.model.AuthorityModel;

public interface AuthorityRepository extends JpaRepository<AuthorityModel,Integer>{

}
