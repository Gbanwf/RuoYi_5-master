package com.ruoyi.carthird.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 司机1035312053对象 thirdcar
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public class Thirdcar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 司机3车号 */
    @Excel(name = "司机3车号")
    private String thirdpeicheId;

    /** 订单号 */
    private String thirddingdanId;

    /** 来源单号 */
    @Excel(name = "来源单号")
    private String thirdlaiyuanId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date thirdxiadanTime;

    /** 用户名 */
    @Excel(name = "用户名")
    private String thirduserNametwo;

    /** 地址 */
    @Excel(name = "地址")
    private String thirddizhi;

    /** 要求时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date thirdyaoqiuTime;

    /** 完成状态 */
    @Excel(name = "完成状态")
    private String thirdwanchengState;

    public void setThirdpeicheId(String thirdpeicheId) 
    {
        this.thirdpeicheId = thirdpeicheId;
    }

    public String getThirdpeicheId() 
    {
        return thirdpeicheId;
    }
    public void setThirddingdanId(String thirddingdanId) 
    {
        this.thirddingdanId = thirddingdanId;
    }

    public String getThirddingdanId() 
    {
        return thirddingdanId;
    }
    public void setThirdlaiyuanId(String thirdlaiyuanId) 
    {
        this.thirdlaiyuanId = thirdlaiyuanId;
    }

    public String getThirdlaiyuanId() 
    {
        return thirdlaiyuanId;
    }
    public void setThirdxiadanTime(Date thirdxiadanTime) 
    {
        this.thirdxiadanTime = thirdxiadanTime;
    }

    public Date getThirdxiadanTime() 
    {
        return thirdxiadanTime;
    }
    public void setThirduserNametwo(String thirduserNametwo) 
    {
        this.thirduserNametwo = thirduserNametwo;
    }

    public String getThirduserNametwo() 
    {
        return thirduserNametwo;
    }
    public void setThirddizhi(String thirddizhi) 
    {
        this.thirddizhi = thirddizhi;
    }

    public String getThirddizhi() 
    {
        return thirddizhi;
    }
    public void setThirdyaoqiuTime(Date thirdyaoqiuTime) 
    {
        this.thirdyaoqiuTime = thirdyaoqiuTime;
    }

    public Date getThirdyaoqiuTime() 
    {
        return thirdyaoqiuTime;
    }
    public void setThirdwanchengState(String thirdwanchengState) 
    {
        this.thirdwanchengState = thirdwanchengState;
    }

    public String getThirdwanchengState() 
    {
        return thirdwanchengState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("thirdpeicheId", getThirdpeicheId())
            .append("thirddingdanId", getThirddingdanId())
            .append("thirdlaiyuanId", getThirdlaiyuanId())
            .append("thirdxiadanTime", getThirdxiadanTime())
            .append("thirduserNametwo", getThirduserNametwo())
            .append("thirddizhi", getThirddizhi())
            .append("thirdyaoqiuTime", getThirdyaoqiuTime())
            .append("thirdwanchengState", getThirdwanchengState())
            .toString();
    }
}
