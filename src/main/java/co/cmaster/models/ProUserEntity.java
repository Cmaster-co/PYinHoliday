package co.cmaster.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Entity
@Table(name = "pro_user", schema = "pyholiday", catalog = "")
public class ProUserEntity {
    private int id;
    private String project;
    private String user;
    private int admin;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project", nullable = false, length = 255)
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Basic
    @Column(name = "user", nullable = false, length = 255)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
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
        if (admin != that.admin) return false;
        if (project != null ? !project.equals(that.project) : that.project != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + admin;
        return result;
    }
}
