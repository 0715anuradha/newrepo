package com.lti.service;

import java.util.List;

import com.lti.dao.CollegeDao;
import com.lti.model.Details;


public class CollegeService {
	CollegeDao dao = null;

	public CollegeService(){
		dao=new CollegeDao();
	}

public List<Details> findAllColleges(){
	return dao.showAllColleges();
}

public boolean removeCollege(int cid){
	int result = dao.deleteCollege(cid);
	if(result ==1){
		return true;
}else 
	return false;
}
public boolean createCollege(Details det){
	int result = dao.addCollege(det);
	if(result ==1)
		return true;
	else
		return false;
}
}