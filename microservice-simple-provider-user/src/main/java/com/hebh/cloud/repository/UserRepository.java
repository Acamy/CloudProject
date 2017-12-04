package com.hebh.cloud.repository;

import com.hebh.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hebh
 * @date 2017/11/24
 * @description:
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
