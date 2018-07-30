package com.liuxun.transfer.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * CR_CHECKEVENT
 * @author 
 */
public class CrCheckevent implements Serializable {
    private String id;

    private String userId;

    private String equiptId;

    private Date startTime;

    private Date endTime;

    private String checkpointId;

    private String checkUser;

    private String addres;

    private BigDecimal pcddx;

    private BigDecimal pcddy;

    private String remark;

    private String checkModel;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEquiptId() {
        return equiptId;
    }

    public void setEquiptId(String equiptId) {
        this.equiptId = equiptId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public BigDecimal getPcddx() {
        return pcddx;
    }

    public void setPcddx(BigDecimal pcddx) {
        this.pcddx = pcddx;
    }

    public BigDecimal getPcddy() {
        return pcddy;
    }

    public void setPcddy(BigDecimal pcddy) {
        this.pcddy = pcddy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCheckModel() {
        return checkModel;
    }

    public void setCheckModel(String checkModel) {
        this.checkModel = checkModel;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CrCheckevent other = (CrCheckevent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getEquiptId() == null ? other.getEquiptId() == null : this.getEquiptId().equals(other.getEquiptId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCheckpointId() == null ? other.getCheckpointId() == null : this.getCheckpointId().equals(other.getCheckpointId()))
            && (this.getCheckUser() == null ? other.getCheckUser() == null : this.getCheckUser().equals(other.getCheckUser()))
            && (this.getAddres() == null ? other.getAddres() == null : this.getAddres().equals(other.getAddres()))
            && (this.getPcddx() == null ? other.getPcddx() == null : this.getPcddx().equals(other.getPcddx()))
            && (this.getPcddy() == null ? other.getPcddy() == null : this.getPcddy().equals(other.getPcddy()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCheckModel() == null ? other.getCheckModel() == null : this.getCheckModel().equals(other.getCheckModel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEquiptId() == null) ? 0 : getEquiptId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCheckpointId() == null) ? 0 : getCheckpointId().hashCode());
        result = prime * result + ((getCheckUser() == null) ? 0 : getCheckUser().hashCode());
        result = prime * result + ((getAddres() == null) ? 0 : getAddres().hashCode());
        result = prime * result + ((getPcddx() == null) ? 0 : getPcddx().hashCode());
        result = prime * result + ((getPcddy() == null) ? 0 : getPcddy().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCheckModel() == null) ? 0 : getCheckModel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", equiptId=").append(equiptId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", checkpointId=").append(checkpointId);
        sb.append(", checkUser=").append(checkUser);
        sb.append(", addres=").append(addres);
        sb.append(", pcddx=").append(pcddx);
        sb.append(", pcddy=").append(pcddy);
        sb.append(", remark=").append(remark);
        sb.append(", checkModel=").append(checkModel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}