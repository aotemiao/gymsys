package com.atm.gymsys.controller;

import com.atm.gymsys.data.UserRepository;
import com.atm.gymsys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepo;

    @Autowired
    public UserController(
            UserRepository userRepo
    ){
        this.userRepo= userRepo;

    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        User user2bCheck = userRepo.findByUserId(user.getUserId());
        if (user.getPassword().equals(user2bCheck.getPassword())) {
            {
                map.put("validation", "true");
            }
        }else {
            map.put("validation", "false");
        };
        return map;
    }

    @GetMapping("/checkUsername")
    public Map<String, Object> checkUsername(@RequestParam Map<String, String> resmap) {
        Map<String, Object> map = new HashMap<>();
        User user = userRepo.findByUserId(resmap.get("user_Id"));
        if (user != null) {
            map.put("info", user);
        } else {
            map.put("info", null);
        }
        return map;
    }

}
