package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Fruit;

import jakarta.transaction.Transactional;

public interface FruitRepo extends JpaRepository<Fruit, Integer> {
@Query("select f from Fruit f")
List<Fruit> findAllQuery();

@Query("select f from Fruit f where f.price = :32")
Fruit findByEmail(@Param("32")String price);

@Query("select f from Fruit f where f.price = ?1")
Fruit findByEmailPlace(String price);

@Modifying
@Transactional
@Query("update Fruit f set f.price = :hh where f.id = :id")
void updateUser(@Param("hh") String price, @Param("id") Long id);
@Modifying
@Transactional
@Query("delete from Fruit f where f.id = ?1")
void deleteUser(int id);
}
