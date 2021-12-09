package cn.jaylong.lab.repository;

import cn.jaylong.lab.po.User;
import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/9/23
 */
@Repository
public interface UserJpaRepository extends EntityGraphJpaRepository<User, String> {

}
