package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService us;
@GetMapping("get")
public List<UserModel> read()
{
	return us.read();
}
@GetMapping("getid/{id}")
public Optional<UserModel> readid(@PathVariable int id)
{
	return us.readid(id);
}
@PostMapping("post")
public boolean create(@RequestBody UserModel um)
{
	return us.create(um);
}
@PutMapping("put")
public boolean udateid(@RequestBody UserModel um,@RequestParam int id)
{
	return us.udateid(um, id);
}
@DeleteMapping("delete/{id}")
public boolean deleteid(@PathVariable int id)
{
	return us.deleteid(id);
}

}
