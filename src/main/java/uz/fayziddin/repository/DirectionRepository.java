package uz.fayziddin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.fayziddin.entity.Direction;

public interface DirectionRepository extends JpaRepository<Direction, Integer> {
}
