package co.cmaster.models;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
@Entity
@Table(name = "file", schema = "pyholiday", catalog = "")
public class FileEntity {
    private int id;
    private String project;
    private String filepath;
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
    @Column(name = "filepath", nullable = false, length = 255)
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
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

        FileEntity that = (FileEntity) o;

        if (id != that.id) return false;
        if (project != null ? !project.equals(that.project) : that.project != null) return false;
        if (filepath != null ? !filepath.equals(that.filepath) : that.filepath != null) return false;
        if (more != null ? !more.equals(that.more) : that.more != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        result = 31 * result + (filepath != null ? filepath.hashCode() : 0);
        result = 31 * result + (more != null ? more.hashCode() : 0);
        return result;
    }
}
