package co.cmaster.repository;

import co.cmaster.models.ProUserEntity;
import co.cmaster.models.ProjectEntity;
import co.cmaster.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public interface ProUserRepository extends JpaRepository<ProUserEntity, Integer> {
    @Query(value = "select pu from ProUserEntity pu where pu.project = ?1 and pu.user = ?2")
    ProUserEntity findByPU(Integer projectid, Integer userid);

    List<ProUserEntity> findByUser(Integer id);
}
