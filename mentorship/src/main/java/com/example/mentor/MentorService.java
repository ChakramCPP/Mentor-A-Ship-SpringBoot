package com.example.mentor;

import java.util.List;

public interface MentorService {
	
	public List<Mentor> listMentors();
	public String addMentor(Mentor m);
	public String updateMentor(Mentor m);

}
