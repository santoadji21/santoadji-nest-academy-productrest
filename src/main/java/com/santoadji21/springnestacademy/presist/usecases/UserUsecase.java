package com.santoadji21.springnestacademy.presist.usecase;

import com.santoadji21.springnestacademy.presist.model.UserModel;
import com.santoadji21.springnestacademy.presist.repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserUsecase {

    @Autowired
    private UserRepos userRepos;

    public List<UserModel> findAll() {
        return userRepos.findAll();
    }

    public UserModel createUser(UserModel user) {
        return userRepos.save(user);
    }

    public UserModel updateUser(UserModel user){
        return userRepos.save(user);
    }


}
