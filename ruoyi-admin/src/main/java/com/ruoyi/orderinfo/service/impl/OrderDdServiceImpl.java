package com.ruoyi.orderinfo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.orderinfo.mapper.OrderDdMapper;
import com.ruoyi.orderinfo.domain.OrderDd;
import com.ruoyi.orderinfo.service.IOrderDdService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订单信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-15
 */
@Service
public class OrderDdServiceImpl implements IOrderDdService 
{
    @Autowired
    private OrderDdMapper orderDdMapper;

    /**
     * 查询订单信息
     * 
     * @param dingdanId 订单信息主键
     * @return 订单信息
     */
    @Override
    public OrderDd selectOrderDdByDingdanId(String dingdanId)
    {
        return orderDdMapper.selectOrderDdByDingdanId(dingdanId);
    }

    /**
     * 查询订单信息列表
     * 
     * @param orderDd 订单信息
     * @return 订单信息
     */
    @Override
    public List<OrderDd> selectOrderDdList(OrderDd orderDd)
    {
        return orderDdMapper.selectOrderDdList(orderDd);
    }

    /**
     * 新增订单信息
     * 
     * @param orderDd 订单信息
     * @return 结果
     */
    @Override
    public int insertOrderDd(OrderDd orderDd)
    {
        return orderDdMapper.insertOrderDd(orderDd);
    }

    /**
     * 修改订单信息
     * 
     * @param orderDd 订单信息
     * @return 结果
     */
    @Override
    public int updateOrderDd(OrderDd orderDd)
    {
        return orderDdMapper.updateOrderDd(orderDd);
    }

    /**
     * 批量删除订单信息
     * 
     * @param dingdanIds 需要删除的订单信息主键
     * @return 结果
     */
    @Override
    public int deleteOrderDdByDingdanIds(String dingdanIds)
    {
        return orderDdMapper.deleteOrderDdByDingdanIds(Convert.toStrArray(dingdanIds));
    }

    /**
     * 删除订单信息信息
     * 
     * @param dingdanId 订单信息主键
     * @return 结果
     */
    @Override
    public int deleteOrderDdByDingdanId(String dingdanId)
    {
        return orderDdMapper.deleteOrderDdByDingdanId(dingdanId);
    }
}
