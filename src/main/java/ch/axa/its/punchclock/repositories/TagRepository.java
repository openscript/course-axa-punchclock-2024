package ch.axa.its.punchclock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.axa.its.punchclock.domain.Tag;


public interface TagRepository extends JpaRepository<Tag, String> {}
