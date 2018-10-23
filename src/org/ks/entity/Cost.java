package org.ks.entity;

import java.sql.Timestamp;

/**
 * Created by itachi on 2017/2/7.
 * 1、实现序列化接口
 * 2、属性类型采用封装类型 int-->Integer
 * 3、属性名和字段名字一致(仅限于Mybatis)
 */
public class Cost {
    private  Integer cost_id;
    private String name;
    private Long base_duration;
    private Double base_cost;
    private Double unit_cost;
    private String status;
    private String descr;
    private Timestamp creatime;
    private Timestamp startime;
    private String cost_type;

    public Integer getCost_id() {
        return cost_id;
    }

    public void setCost_id(Integer cost_id) {
        this.cost_id = cost_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBase_duration() {
        return base_duration;
    }

    public void setBase_duration(Long base_duration) {
        this.base_duration = base_duration;
    }

    public Double getBase_cost() {
        return base_cost;
    }

    public void setBase_cost(Double base_cost) {
        this.base_cost = base_cost;
    }

    public Double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(Double unit_cost) {
        this.unit_cost = unit_cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    public Timestamp getStartime() {
        return startime;
    }

    public void setStartime(Timestamp startime) {
        this.startime = startime;
    }

    public String getCost_type() {
        return cost_type;
    }

    public void setCost_type(String cost_type) {
        this.cost_type = cost_type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cost{");
        sb.append("cost_id=").append(cost_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", base_duration=").append(base_duration);
        sb.append(", base_cost=").append(base_cost);
        sb.append(", unit_cost=").append(unit_cost);
        sb.append(", status='").append(status).append('\'');
        sb.append(", descr='").append(descr).append('\'');
        sb.append(", creatime=").append(creatime);
        sb.append(", startime=").append(startime);
        sb.append(", cost_type='").append(cost_type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
