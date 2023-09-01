package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Fruit;

import jakarta.transaction.Transactional;

public interface FruitRepo extends JpaRepository<Fruit, Integer> {
@Query(value = "select * from fruit_details where id = :s",nativeQuery = true)
public List<Fruit> getinfoid(@Param("s") int id);

@Query(value = "delete from fruit_details where id=:t",nativeQuery = true)
public List<Fruit> getinfoYear(@Param("t") int id);


@Query(value = "update from fruit_details set id=10 where id =:r", nativeQuery = true)
public List<Fruit> update(@Param("r") int id);
}
