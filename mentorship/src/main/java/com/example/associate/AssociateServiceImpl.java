package com.example.associate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AssociateServiceImpl implements AssociateService {
	
	@Autowired
	private  AssociateRepository associateRepository;

	@Override
	@Transactional
	public List<Associate> listAssociates() {
		
		
		return associateRepository.findAll();
	}

	@Override
	@Transactional
	public String addAssociate(Associate a) {
		
		try {
			System.out.println(associateRepository.saveAndFlush(a));}
			catch(Exception d){
				System.out.println(d.getLocalizedMessage());
				return "failed";
			}
			
			return "Added mentor:"+a.getAname();
	}

	@Override
	@Transactional
	public String updateAssociate(Associate a) {
		
		associateRepository.save(a);
		return "updated"+a.getAname();
	}

}