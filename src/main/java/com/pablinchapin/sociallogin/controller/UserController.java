/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.sociallogin.controller;

import com.pablinchapin.sociallogin.entity.User;
import com.pablinchapin.sociallogin.exception.ResourceNotFoundException;
import com.pablinchapin.sociallogin.repository.UserRepository;
import com.pablinchapin.sociallogin.security.CurrentUser;
import com.pablinchapin.sociallogin.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pvargas
 */

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    
    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal){
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    
    }
    
}
