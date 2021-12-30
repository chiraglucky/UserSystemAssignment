package com.carscan.userboot.repository;

import com.carscan.userboot.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositories are used between service layer and modal layer,that accesses the database and does the operation
//JpaRepository contains full API of CrudRepository(basic CRUD operation) and PagingAndSortingRepository
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
