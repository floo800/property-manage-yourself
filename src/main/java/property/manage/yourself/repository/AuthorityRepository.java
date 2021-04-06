package property.manage.yourself.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import property.manage.yourself.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
