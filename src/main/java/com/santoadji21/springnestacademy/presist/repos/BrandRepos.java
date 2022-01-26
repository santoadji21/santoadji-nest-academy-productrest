package com.santoadji21.springnestacademy.presist.repos;

import com.santoadji21.springnestacademy.presist.model.BrandModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepos extends JpaRepository<BrandModel, Long> {

}
