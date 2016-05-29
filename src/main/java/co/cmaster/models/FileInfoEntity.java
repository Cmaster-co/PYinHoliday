package co.cmaster.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Entity
@Table(name = "file_info", schema = "pyholiday", catalog = "")
public class FileInfoEntity {
    private int id;
    private int file;
    private int user;
    private String action;
    private String filename;
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
    @Column(name = "file", nullable = false)
    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
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
    @Column(name = "action", nullable = false, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "filename", nullable = false, length = 255)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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

        FileInfoEntity that = (FileInfoEntity) o;

        if (id != that.id) return false;
        if (file != that.file) return false;
        if (user != that.user) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + file;
        result = 31 * result + user;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
