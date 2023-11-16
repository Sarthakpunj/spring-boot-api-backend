package com.NPL.springsecurityjwt.repository;

import com.NPL.springsecurityjwt.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Integer> {

    RoleEntity findByName(String name);
}
