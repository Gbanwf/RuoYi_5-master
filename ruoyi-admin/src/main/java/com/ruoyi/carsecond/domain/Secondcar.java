package com.ruoyi.carsecond.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 司机1035332126对象 secondcar
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public class Secondcar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 司机2车号 */
    @Excel(name = "司机2车号")
    private String secondpeicheId;

    /** 订单号 */
    private String seconddingdanId;

    /** 来源单号 */
    @Excel(name = "来源单号")
    private String secondlaiyuanId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date secondxiadanTime;

    /** 用户名 */
    @Excel(name = "用户名")
    private String seconduserNametwo;

    /** dizhi */
    @Excel(name = "dizhi")
    private String seconddizhi;

    /** 要求送达时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求送达时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date secondyaoqiuTime;

    /** 完成状态 */
    @Excel(name = "完成状态")
    private String secondwanchengState;

    public void setSecondpeicheId(String secondpeicheId) 
    {
        this.secondpeicheId = secondpeicheId;
    }

    public String getSecondpeicheId() 
    {
        return secondpeicheId;
    }
    public void setSeconddingdanId(String seconddingdanId) 
    {
        this.seconddingdanId = seconddingdanId;
    }

    public String getSeconddingdanId() 
    {
        return seconddingdanId;
    }
    public void setSecondlaiyuanId(String secondlaiyuanId) 
    {
        this.secondlaiyuanId = secondlaiyuanId;
    }

    public String getSecondlaiyuanId() 
    {
        return secondlaiyuanId;
    }
    public void setSecondxiadanTime(Date secondxiadanTime) 
    {
        this.secondxiadanTime = secondxiadanTime;
    }

    public Date getSecondxiadanTime() 
    {
        return secondxiadanTime;
    }
    public void setSeconduserNametwo(String seconduserNametwo) 
    {
        this.seconduserNametwo = seconduserNametwo;
    }

    public String getSeconduserNametwo() 
    {
        return seconduserNametwo;
    }
    public void setSeconddizhi(String seconddizhi) 
    {
        this.seconddizhi = seconddizhi;
    }

    public String getSeconddizhi() 
    {
        return seconddizhi;
    }
    public void setSecondyaoqiuTime(Date secondyaoqiuTime) 
    {
        this.secondyaoqiuTime = secondyaoqiuTime;
    }

    public Date getSecondyaoqiuTime() 
    {
        return secondyaoqiuTime;
    }
    public void setSecondwanchengState(String secondwanchengState) 
    {
        this.secondwanchengState = secondwanchengState;
    }

    public String getSecondwanchengState() 
    {
        return secondwanchengState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("secondpeicheId", getSecondpeicheId())
            .append("seconddingdanId", getSeconddingdanId())
            .append("secondlaiyuanId", getSecondlaiyuanId())
            .append("secondxiadanTime", getSecondxiadanTime())
            .append("seconduserNametwo", getSeconduserNametwo())
            .append("seconddizhi", getSeconddizhi())
            .append("secondyaoqiuTime", getSecondyaoqiuTime())
            .append("secondwanchengState", getSecondwanchengState())
            .toString();
    }
}
