package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entities.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
