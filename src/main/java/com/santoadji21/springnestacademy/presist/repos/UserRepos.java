package com.santoadji21.springnestacademy.presist.repos;

import com.santoadji21.springnestacademy.presist.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<UserModel, Long> {

}
