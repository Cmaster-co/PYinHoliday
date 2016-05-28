package co.cmaster.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
@Entity
@Table(name = "project", schema = "pyholiday", catalog = "")
public class ProjectEntity {
    private int id;
    private String proname;
    private String passwd;
    private String location;
    private String more;

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
    @Column(name = "more", nullable = true, length = 255)
    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (proname != null ? !proname.equals(that.proname) : that.proname != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (more != null ? !more.equals(that.more) : that.more != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (proname != null ? proname.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (more != null ? more.hashCode() : 0);
        return result;
    }
}