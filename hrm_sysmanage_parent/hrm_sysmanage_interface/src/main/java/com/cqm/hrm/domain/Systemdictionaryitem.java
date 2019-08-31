package com.cqm.hrm.domain;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cqm
 * @since 2019-08-31
 */
@TableName("t_systemdictionaryitem")
public class Systemdictionaryitem extends Model<Systemdictionaryitem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("systemdictionary_id")
    private Long systemdictionaryId;
    private String name;
    private Integer requence;
    private String intro;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSystemdictionaryId() {
        return systemdictionaryId;
    }

    public void setSystemdictionaryId(Long systemdictionaryId) {
        this.systemdictionaryId = systemdictionaryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRequence() {
        return requence;
    }

    public void setRequence(Integer requence) {
        this.requence = requence;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Systemdictionaryitem{" +
        ", id=" + id +
        ", systemdictionaryId=" + systemdictionaryId +
        ", name=" + name +
        ", requence=" + requence +
        ", intro=" + intro +
        "}";
    }
}
