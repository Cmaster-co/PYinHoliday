package co.cmaster.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Entity
@Table(name = "enc", schema = "pyholiday", catalog = "")
public class EncEntity {
    private int id;
    private String project;
    private double money;
    private Timestamp time;
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
    @Column(name = "project", nullable = false, length = 255)
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Basic
    @Column(name = "money", nullable = false, precision = 0)
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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

        EncEntity encEntity = (EncEntity) o;

        if (id != encEntity.id) return false;
        if (Double.compare(encEntity.money, money) != 0) return false;
        if (project != null ? !project.equals(encEntity.project) : encEntity.project != null) return false;
        if (time != null ? !time.equals(encEntity.time) : encEntity.time != null) return false;
        if (more != null ? !more.equals(encEntity.more) : encEntity.more != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (more != null ? more.hashCode() : 0);
        return result;
    }
}
