package com.example.demo1.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo1.dao.IndexDao;
import com.example.demo1.model.User;

@Service
public class IndexService {
	@Autowired
	private IndexDao indexDao;
	
	public List<User> getAll(){
		return indexDao.getAll();
	}
	
	public User getOne(Long id) {
		return indexDao.getOne(id);
	}
}
