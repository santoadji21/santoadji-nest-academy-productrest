package com.santoadji21.springnestacademy.presist.usecase;

import com.santoadji21.springnestacademy.presist.model.BrandModel;
import com.santoadji21.springnestacademy.presist.repos.BrandRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandUsecase {

    @Autowired
    private BrandRepos brandRepos;

  public List<BrandModel> findAll() {

      return brandRepos.findAll();
  }

  public BrandModel findById(Long id) {

      return brandRepos.findById(id).orElse(null);
  }

  public BrandModel createBrand(BrandModel brand) {
      var newBrand = new BrandModel();
      newBrand.setBrand_name(brand.getBrand_name());
      newBrand.setBrand_year(brand.getBrand_year());
    return brandRepos.save(newBrand);
  }

  public BrandModel updateBrand(BrandModel brand) {

      return brandRepos.save(brand);
  }

  public BrandModel deleteBrand(int id) {
     return brandRepos.delete(id);
  }

}

