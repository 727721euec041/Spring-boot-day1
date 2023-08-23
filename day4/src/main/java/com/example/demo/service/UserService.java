package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	@Autowired
UserRepository ur;
	public List<UserModel> read()
	{
		return ur.findAll();
	}
	public Optional<UserModel> readid(int id)
	{
		return ur.findById(id);
	}
	public boolean create(UserModel um)
	{
		if(!ur.existsById(um.getId()))
		{
			ur.save(um);
			return true;
		}
		else
		{
					return false;
		}
	}
	public boolean udateid(UserModel um,int id)
	{
		if(ur.existsById(id))
		{
			ur.saveAndFlush(um);
			return true;
		}
		else
		{
			return false;
		
		}
		}
	public boolean deleteid(int id)
	{
		ur.deleteById(id);
		if(ur.existsById(id))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
		
}
