package com.study.springboot.conferenceapp.repository;

import com.study.springboot.conferenceapp.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
