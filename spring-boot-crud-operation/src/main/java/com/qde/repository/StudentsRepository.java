package com.qde.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.qde.model.Students;
public interface StudentsRepository extends CrudRepository<Students, Integer>
{
}
