package uz.fayziddin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.fayziddin.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
