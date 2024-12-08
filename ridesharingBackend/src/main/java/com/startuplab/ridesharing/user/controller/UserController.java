package com.startuplab.ridesharing.user.controller;

import com.startuplab.ridesharing.user.model.Users;
import com.startuplab.ridesharing.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public ResponseEntity<String> registerUser(@RequestBody Users user) {
        userService.save(user);
        return ResponseEntity.ok(user.toString());
    }

    @GetMapping("start")
    public String startMessage() {
        return "STARTUPLAB - BLA BLA PRO MAX";
    }
}
