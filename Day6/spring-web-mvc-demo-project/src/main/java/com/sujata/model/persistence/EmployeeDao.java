package com.sujata.model.persistence;

import java.util.List;


import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Transactional
	@Modifying
	@Query(value = "insert into employees values(:id,:name,:des,:dep,:sal)",nativeQuery = true)
	public int insertEmployee(@Param("id") int id,@Param("name") String name,@Param("des") String desig, @Param("dep") String depart,@Param("sal") double sal);
	
	

}
