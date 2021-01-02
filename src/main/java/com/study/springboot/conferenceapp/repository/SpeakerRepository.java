package com.study.springboot.conferenceapp.repository;

import com.study.springboot.conferenceapp.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
