package com.example.admin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.hibernate.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.admin.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
	List<Admin> findByAdname(String name);

	
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Associate a SET a.mentor = :mentorid WHERE a.ass_id = :associate_id")
    Integer mapMentor(@Param("mentorid") Integer mentor, @Param("associate_id") Integer associate_id);
	
	@Modifying(clearAutomatically = true)
    @Query("select a.mentor from Associate a group by mentor having  count(a.mentor)>=5")
	List<Integer> availableMentors();


	//String mapMentor(Integer mentor, Integer associate_id);
}
