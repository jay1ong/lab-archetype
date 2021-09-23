package com.im.lab.repository;

import com.im.lab.po.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/9/23
 */
@Repository
public interface UserJpaRepository extends CrudRepository<User, String> {

}
