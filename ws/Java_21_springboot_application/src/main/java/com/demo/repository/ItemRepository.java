package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
