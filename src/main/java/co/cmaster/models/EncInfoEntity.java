package co.cmaster.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
@Entity
@Table(name = "enc_info", schema = "pyholiday", catalog = "")
public class EncInfoEntity {
    private int id;
    private String enc;
    private String user;
    private String action;
    private double money;
    private Timestamp time;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "enc", nullable = false, length = 255)
    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc;
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
    @Column(name = "action", nullable = false, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EncInfoEntity that = (EncInfoEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.money, money) != 0) return false;
        if (enc != null ? !enc.equals(that.enc) : that.enc != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (enc != null ? enc.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
