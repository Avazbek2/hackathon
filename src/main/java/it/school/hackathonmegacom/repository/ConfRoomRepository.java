package it.school.hackathonmegacom.repository;

import it.school.hackathonmegacom.models.entity.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfRoomRepository extends JpaRepository<ConfRoom , Long> {
}
