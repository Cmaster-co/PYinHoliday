package co.cmaster.repository;

import co.cmaster.models.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

    @Modifying
    @Transactional
    @Query("update ProjectEntity pr set pr.passwd=:ppasswd, pr.location=:plocation where pr.id=:pid")
    public void updateProject(@Param("ppasswd") String passwd, @Param("plocation") String location, @Param("pid") Integer id);
}
