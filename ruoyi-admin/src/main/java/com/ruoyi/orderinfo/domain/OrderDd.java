package com.ruoyi.orderinfo.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单信息对象 order_dd
 * 
 * @author ruoyi
 * @date 2022-09-15
 */
public class OrderDd extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单号 */
    @Excel(name = "订单号")
    private String dingdanId;

    /** 来源单号 */
    @Excel(name = "来源单号")
    private String laiyuanId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date xiadanTime;

    /** 用户 */
    @Excel(name = "用户")
    private String userNametwo;

    /** 地址 */
    @Excel(name = "地址")
    private String dizhi;

    /** 要求送达时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求送达时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date yaoqiuTime;

    /** 配车号 */
    @Excel(name = "配车号")
    private String peicheId;

    /** 完成状态 */
    @Excel(name = "完成状态")
    private String wanchengState;

    public void setDingdanId(String dingdanId) 
    {
        this.dingdanId = dingdanId;
    }

    public String getDingdanId() 
    {
        return dingdanId;
    }
    public void setLaiyuanId(String laiyuanId) 
    {
        this.laiyuanId = laiyuanId;
    }

    public String getLaiyuanId() 
    {
        return laiyuanId;
    }
    public void setXiadanTime(Date xiadanTime) 
    {
        this.xiadanTime = xiadanTime;
    }

    public Date getXiadanTime() 
    {
        return xiadanTime;
    }
    public void setUserNametwo(String userNametwo) 
    {
        this.userNametwo = userNametwo;
    }

    public String getUserNametwo() 
    {
        return userNametwo;
    }
    public void setDizhi(String dizhi) 
    {
        this.dizhi = dizhi;
    }

    public String getDizhi() 
    {
        return dizhi;
    }
    public void setYaoqiuTime(Date yaoqiuTime) 
    {
        this.yaoqiuTime = yaoqiuTime;
    }

    public Date getYaoqiuTime() 
    {
        return yaoqiuTime;
    }
    public void setPeicheId(String peicheId) 
    {
        this.peicheId = peicheId;
    }

    public String getPeicheId() 
    {
        return peicheId;
    }
    public void setWanchengState(String wanchengState) 
    {
        this.wanchengState = wanchengState;
    }

    public String getWanchengState() 
    {
        return wanchengState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dingdanId", getDingdanId())
            .append("laiyuanId", getLaiyuanId())
            .append("xiadanTime", getXiadanTime())
            .append("userNametwo", getUserNametwo())
            .append("dizhi", getDizhi())
            .append("yaoqiuTime", getYaoqiuTime())
            .append("peicheId", getPeicheId())
            .append("wanchengState", getWanchengState())
            .toString();
    }
}
