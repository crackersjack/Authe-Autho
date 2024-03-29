package com.nikhil.jpa.jpademo.controller;

import com.nikhil.jpa.jpademo.model.UserS;
import com.nikhil.jpa.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserS> getAllUsers(@AuthenticationPrincipal final UserDetails userDetails){

        String userName = userDetails.getUsername();
        System.out.println("userName is >> "+userName);
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            System.out.println(authority);
        }

        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Optional<UserS> getUser(@RequestParam int userId){ return userService.getUser(userId); }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public UserS saveUser(@RequestBody UserS user){
        return userService.saveUser(user);
    }

}
