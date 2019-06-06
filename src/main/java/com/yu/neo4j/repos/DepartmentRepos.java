package com.yu.neo4j.repos;

import com.yu.neo4j.dao.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepos extends Neo4jRepository<Department,String> {
}
