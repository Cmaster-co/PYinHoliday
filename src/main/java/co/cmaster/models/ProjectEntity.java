package co.cmaster.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
@Entity
@Table(name = "project", schema = "pyholiday", catalog = "")
public class ProjectEntity {
    private Collection<ProUserEntity> proUsersById;
    private int id;
    private String proname;
    private String passwd;
    private String location;
    private String pic;
    private Timestamp time;
    private int status;
    private String info;

    @OneToMany(mappedBy = "projectByProject")
    public Collection<ProUserEntity> getProUsersById() {
        return proUsersById;
    }

    public void setProUsersById(Collection<ProUserEntity> proUsersById) {
        this.proUsersById = proUsersById;
    }

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "proname", nullable = false, length = 255)
    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    @Basic
    @Column(name = "passwd", nullable = false, length = 255)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 255)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "info", nullable = true, length = 255)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (proname != null ? !proname.equals(that.proname) : that.proname != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (proname != null ? proname.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }
}
