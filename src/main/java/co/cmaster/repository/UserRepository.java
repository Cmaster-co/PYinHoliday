package co.cmaster.repository;

import co.cmaster.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query("select u from UserEntity u where u.username = ?1 and u.passwd = ?2")
    UserEntity findByUP(String username, String passwd);

    @Modifying
    @Transactional
    @Query("update UserEntity us set us.passwd=:upasswd, us.age=:uage, us.city=:ucity, us.sex=:usex where us.id=:uid")
    public void updateUser(@Param("upasswd") String passwd, @Param("uage") Integer age, @Param("ucity") String city, @Param("usex") Integer sex, @Param("uid") Integer id);
}
