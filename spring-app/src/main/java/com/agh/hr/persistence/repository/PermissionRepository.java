package com.agh.hr.persistence.repository;
import com.agh.hr.persistence.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<List<Permission>> findByAddEquals(Boolean add);

}
