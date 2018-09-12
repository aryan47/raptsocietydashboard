package com.project.ritesh.dashboard.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.ritesh.dashboard.entity.Instructor;
@RepositoryRestResource(path = " instructors",collectionResourceRel="instructors")
public interface InstructorJpaRepository extends JpaRepository<Instructor, Long> {
//	@Query("")
// public List<Subject> findSubjectsById(Long id);
}
