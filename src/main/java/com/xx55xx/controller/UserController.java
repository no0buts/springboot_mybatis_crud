package com.xx55xx.controller;


import com.xx55xx.entity.User;
import com.xx55xx.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);

        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>("******User is successfully insert!******",HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("******User is successfully delete!******",HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return new ResponseEntity<>("******User is successfully update!******",HttpStatus.OK);
    }

}
