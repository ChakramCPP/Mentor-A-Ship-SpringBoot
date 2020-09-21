package com.example.associate;

import java.util.List;

public interface AssociateService {
	public List<Associate> listAssociates();
	public String addAssociate(Associate a);
	public String updateAssociate(Associate a);

}
