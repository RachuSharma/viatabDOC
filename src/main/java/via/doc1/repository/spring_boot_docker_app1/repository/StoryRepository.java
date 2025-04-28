package via.doc1.repository.spring_boot_docker_app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.repository.spring_boot_docker_app1.model.Story;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
}
