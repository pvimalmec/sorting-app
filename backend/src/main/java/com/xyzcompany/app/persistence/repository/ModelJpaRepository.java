package com.xyzcompany.app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyzcompany.app.persistence.entity.Sort;

/**
 * 
 * @author vimal
 *
 */

public interface ModelJpaRepository extends JpaRepository<Sort, String> {

}
