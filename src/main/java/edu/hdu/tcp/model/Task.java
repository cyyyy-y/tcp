package edu.hdu.tcp.model;

/**
 * task
 * @author
 */
public class Task {
    private Integer tId;
    private String name;
    private String description;
    private Integer status;
    private String belong_pro;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBelong_pro() {
        return belong_pro;
    }

    public void setBelong_pro(String belong_pro) {
        this.belong_pro = belong_pro;
    }

    @Override
    public String toString() {
        return "Task{" +
                "tId=" + tId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", belong_pro='" + belong_pro + '\'' +
                '}';
    }
}
