package com.example.stocks;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/signup")
	public ResponseEntity<User> register(@RequestBody User user){
		
		User newuser = new User();
		newuser.setEmail(user.getEmail());
		newuser.setPassword(user.getPassword());
		newuser.setFullName(user.getFullName());

		User saveduser = userRepository.save(newuser);

		return new ResponseEntity<>(saveduser, HttpStatus.CREATED);
		
	}

}
