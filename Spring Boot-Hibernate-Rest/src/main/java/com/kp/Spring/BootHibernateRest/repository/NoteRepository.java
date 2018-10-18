package com.kp.Spring.BootHibernateRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kp.Spring.BootHibernateRest.model.Note;

@Repository 
public interface NoteRepository extends  JpaRepository<Note, Long>{

}
