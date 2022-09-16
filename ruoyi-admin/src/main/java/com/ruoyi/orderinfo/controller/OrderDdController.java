package com.ruoyi.orderinfo.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.orderinfo.domain.OrderDd;
import com.ruoyi.orderinfo.service.IOrderDdService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单信息Controller
 * 
 * @author ruoyi
 * @date 2022-09-15
 */
@Controller
@RequestMapping("/orderinfo/dd")
public class OrderDdController extends BaseController
{
    private String prefix = "orderinfo/dd";

    @Autowired
    private IOrderDdService orderDdService;

    @RequiresPermissions("orderinfo:dd:view")
    @GetMapping()
    public String dd()
    {
        return prefix + "/dd";
    }

    /**
     * 查询订单信息列表
     */
    @RequiresPermissions("orderinfo:dd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderDd orderDd)
    {
        startPage();
        List<OrderDd> list = orderDdService.selectOrderDdList(orderDd);
        return getDataTable(list);
    }

    /**
     * 导出订单信息列表
     */
    @RequiresPermissions("orderinfo:dd:export")
    @Log(title = "订单信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderDd orderDd)
    {
        List<OrderDd> list = orderDdService.selectOrderDdList(orderDd);
        ExcelUtil<OrderDd> util = new ExcelUtil<OrderDd>(OrderDd.class);
        return util.exportExcel(list, "订单信息数据");
    }

    /**
     * 新增订单信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单信息
     */
    @RequiresPermissions("orderinfo:dd:add")
    @Log(title = "订单信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderDd orderDd)
    {
        return toAjax(orderDdService.insertOrderDd(orderDd));
    }

    /**
     * 修改订单信息
     */
    @RequiresPermissions("orderinfo:dd:edit")
    @GetMapping("/edit/{dingdanId}")
    public String edit(@PathVariable("dingdanId") String dingdanId, ModelMap mmap)
    {
        OrderDd orderDd = orderDdService.selectOrderDdByDingdanId(dingdanId);
        mmap.put("orderDd", orderDd);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单信息
     */
    @RequiresPermissions("orderinfo:dd:edit")
    @Log(title = "订单信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderDd orderDd)
    {
        return toAjax(orderDdService.updateOrderDd(orderDd));
    }

    /**
     * 删除订单信息
     */
    @RequiresPermissions("orderinfo:dd:remove")
    @Log(title = "订单信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(orderDdService.deleteOrderDdByDingdanIds(ids));
    }
}
