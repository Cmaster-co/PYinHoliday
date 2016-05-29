package co.cmaster.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Entity
@Table(name = "pro_user", schema = "pyholiday", catalog = "")
public class ProUserEntity {
    private int id;
    private int project;
    private int user;
    private int admin;
    private ProjectEntity projectByProject;
    private UserEntity userByUser;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project", nullable = false)
    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    @Basic
    @Column(name = "user", nullable = false)
    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Basic
    @Column(name = "admin", nullable = false)
    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProUserEntity that = (ProUserEntity) o;

        if (id != that.id) return false;
        if (project != that.project) return false;
        if (user != that.user) return false;
        if (admin != that.admin) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + project;
        result = 31 * result + user;
        result = 31 * result + admin;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "project", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public ProjectEntity getProjectByProject() {
        return projectByProject;
    }

    public void setProjectByProject(ProjectEntity projectByProject) {
        this.projectByProject = projectByProject;
    }

    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }
}
