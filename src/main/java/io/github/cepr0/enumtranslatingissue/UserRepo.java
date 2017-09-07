package io.github.cepr0.enumtranslatingissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Cepro, 2017-09-07
 */
@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long> {
}
