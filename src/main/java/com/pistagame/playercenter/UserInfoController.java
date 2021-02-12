package com.pistagame.playercenter;

import org.elasticsearch.client.security.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping(path = "/user")
public class UserInfoController {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping(value = "/list")
    public Flux<UserInfo> getAll() {
        return userInfoRepository.findAll();
    }

//    @GetMapping(value="listdelay", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Flux<UserInfo> getAllDelay() {
//        return userInfoRepository.findAll().delayElements(Duration.ofSeconds(1));
//    }

//    @GetMapping("/{id}")
//    public Mono<ResponseEntity<UserInfo>> getUserInfo(@PathVariable long id) {
//        UserInfo userInfo = userInfoRepository.findById(id);
//
//    }

    @PostMapping("")
    public Mono<UserInfo> createUser(@Validated UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

//    @PutMapping("/{id}")
//    public Mono updateUserInfo(@PathVariable(value = "id")long id, @Validated UserInfo userInfo) {
//        return userInfoRepository.findById(id);
//    }

//    public Mono<ResponseEntity<Void>> deleteUser(@PathVariable(value = "id") long id) {
//        return userInfoRepository.findById(id);
//    }
}
