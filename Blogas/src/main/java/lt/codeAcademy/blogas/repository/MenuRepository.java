package lt.codeAcademy.blogas.repository;

import lt.codeAcademy.blogas.model.MenuItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends PagingAndSortingRepository<MenuItem, Long> {
    public Optional<MenuItem> findByName(String name);
}
