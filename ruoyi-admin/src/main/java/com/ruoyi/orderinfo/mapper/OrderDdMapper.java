package com.ruoyi.orderinfo.mapper;

import java.util.List;
import com.ruoyi.orderinfo.domain.OrderDd;

/**
 * 订单信息Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-15
 */
public interface OrderDdMapper 
{
    /**
     * 查询订单信息
     * 
     * @param dingdanId 订单信息主键
     * @return 订单信息
     */
    public OrderDd selectOrderDdByDingdanId(String dingdanId);

    /**
     * 查询订单信息列表
     * 
     * @param orderDd 订单信息
     * @return 订单信息集合
     */
    public List<OrderDd> selectOrderDdList(OrderDd orderDd);

    /**
     * 新增订单信息
     * 
     * @param orderDd 订单信息
     * @return 结果
     */
    public int insertOrderDd(OrderDd orderDd);

    /**
     * 修改订单信息
     * 
     * @param orderDd 订单信息
     * @return 结果
     */
    public int updateOrderDd(OrderDd orderDd);

    /**
     * 删除订单信息
     * 
     * @param dingdanId 订单信息主键
     * @return 结果
     */
    public int deleteOrderDdByDingdanId(String dingdanId);

    /**
     * 批量删除订单信息
     * 
     * @param dingdanIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderDdByDingdanIds(String[] dingdanIds);
}
