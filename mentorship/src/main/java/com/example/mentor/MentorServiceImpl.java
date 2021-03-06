package com.example.mentor;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	private MentorRepository mentorRepository;

	@Override
	@Transactional
	public List<Mentor> listMentors() {
		
		//System.out.println(mentorRepository.findById(7).isEmpty());
		
		return mentorRepository.findAll();
	}

	@Override
	@Transactional
	public String addMentor(Mentor m) {
		try {
		System.out.println(mentorRepository.saveAndFlush(m));}
		catch(Exception d){
			System.out.println(d.getLocalizedMessage());
			return "failed";
		}
		
		return "Added mentor:"+m.getMname();
	}

	@Override
	@Transactional
	public String updateMentor(Mentor m) {
		
		mentorRepository.save(m);
		return "updated:"+m.getMname();
	}

}
