package com.example.repository;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.entity.CategoryEntity;

/***
 * 
 * @author Abu Ehteshamuddin
 * 
 * CRUD operations cane be done easily when taken this entity approach.
 * 
 * And if any custom queries are required that can also be done.
 *
 */

@Resource
public interface CategoryRepository extends CassandraRepository<CategoryEntity,UUID> {

	  /*@Query("SELECT * FROM category WHERE id = ?")
	  List getCategoryDetail(UUID id);
	 */

}
