package com.ruoyi.carfirst.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 司机1035320565对象 firstcar
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public class Firstcar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 司机1车号 */
    @Excel(name = "司机1车号")
    private String firstpeicheId;

    /** 订单号 */
    private String firstdingdanId;

    /** 来源单号 */
    @Excel(name = "来源单号")
    private String firstlaiyuanId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstxiadanTime;

    /** 用户名 */
    @Excel(name = "用户名")
    private String firstuserNametwo;

    /** 地址 */
    @Excel(name = "地址")
    private String firstdizhi;

    /** 要求送达时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求送达时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstyaoqiuTime;

    /** 完成状态 */
    @Excel(name = "完成状态")
    private String firstwanchengState;

    public void setFirstpeicheId(String firstpeicheId) 
    {
        this.firstpeicheId = firstpeicheId;
    }

    public String getFirstpeicheId() 
    {
        return firstpeicheId;
    }
    public void setFirstdingdanId(String firstdingdanId) 
    {
        this.firstdingdanId = firstdingdanId;
    }

    public String getFirstdingdanId() 
    {
        return firstdingdanId;
    }
    public void setFirstlaiyuanId(String firstlaiyuanId) 
    {
        this.firstlaiyuanId = firstlaiyuanId;
    }

    public String getFirstlaiyuanId() 
    {
        return firstlaiyuanId;
    }
    public void setFirstxiadanTime(Date firstxiadanTime) 
    {
        this.firstxiadanTime = firstxiadanTime;
    }

    public Date getFirstxiadanTime() 
    {
        return firstxiadanTime;
    }
    public void setFirstuserNametwo(String firstuserNametwo) 
    {
        this.firstuserNametwo = firstuserNametwo;
    }

    public String getFirstuserNametwo() 
    {
        return firstuserNametwo;
    }
    public void setFirstdizhi(String firstdizhi) 
    {
        this.firstdizhi = firstdizhi;
    }

    public String getFirstdizhi() 
    {
        return firstdizhi;
    }
    public void setFirstyaoqiuTime(Date firstyaoqiuTime) 
    {
        this.firstyaoqiuTime = firstyaoqiuTime;
    }

    public Date getFirstyaoqiuTime() 
    {
        return firstyaoqiuTime;
    }
    public void setFirstwanchengState(String firstwanchengState) 
    {
        this.firstwanchengState = firstwanchengState;
    }

    public String getFirstwanchengState() 
    {
        return firstwanchengState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("firstpeicheId", getFirstpeicheId())
            .append("firstdingdanId", getFirstdingdanId())
            .append("firstlaiyuanId", getFirstlaiyuanId())
            .append("firstxiadanTime", getFirstxiadanTime())
            .append("firstuserNametwo", getFirstuserNametwo())
            .append("firstdizhi", getFirstdizhi())
            .append("firstyaoqiuTime", getFirstyaoqiuTime())
            .append("firstwanchengState", getFirstwanchengState())
            .toString();
    }
}
