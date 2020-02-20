package com.spring.cts.dao;




import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.IpoDetails;

public interface IpoDetailsRepository extends CrudRepository<IpoDetails,Integer> {



Iterable<IpoDetails> findAll();
}