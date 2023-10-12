package az.myproject.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.myproject.studentcrud.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,String>{

}
