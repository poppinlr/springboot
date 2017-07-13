package com.leapstack.ltc.repository.menu.auth;

import com.leapstack.ltc.entity.menu.auth.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuochen on 2017/7/12.
 */
@Repository
public interface MenuEntityRepository extends JpaRepository<MenuEntity,Long>{
}
