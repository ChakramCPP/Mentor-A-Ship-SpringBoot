package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResourceServiceImpl implements ResourceService {
	
	@Autowired
	ResourceRepository resourceRepository;

	@Override
	@Transactional
	public List<Resource> listResources() {
		// TODO Auto-generated method stub
		return resourceRepository.findAll();
	}

	@Override
	@Transactional
	public String addResource(Resource r) {
		resourceRepository.save(r);
		return "Resource Added: "+r.getRname();
	}

}
