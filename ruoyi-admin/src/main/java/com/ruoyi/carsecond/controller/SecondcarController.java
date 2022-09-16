package com.ruoyi.carsecond.controller;

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
import com.ruoyi.carsecond.domain.Secondcar;
import com.ruoyi.carsecond.service.ISecondcarService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 司机1035332126Controller
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Controller
@RequestMapping("/carsecond/secondcar")
public class SecondcarController extends BaseController
{
    private String prefix = "carsecond/secondcar";

    @Autowired
    private ISecondcarService secondcarService;

    @RequiresPermissions("carsecond:secondcar:view")
    @GetMapping()
    public String secondcar()
    {
        return prefix + "/secondcar";
    }

    /**
     * 查询司机1035332126列表
     */
    @RequiresPermissions("carsecond:secondcar:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Secondcar secondcar)
    {
        startPage();
        List<Secondcar> list = secondcarService.selectSecondcarList(secondcar);
        return getDataTable(list);
    }

    /**
     * 导出司机1035332126列表
     */
    @RequiresPermissions("carsecond:secondcar:export")
    @Log(title = "司机1035332126", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Secondcar secondcar)
    {
        List<Secondcar> list = secondcarService.selectSecondcarList(secondcar);
        ExcelUtil<Secondcar> util = new ExcelUtil<Secondcar>(Secondcar.class);
        return util.exportExcel(list, "司机1035332126数据");
    }

    /**
     * 新增司机1035332126
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存司机1035332126
     */
    @RequiresPermissions("carsecond:secondcar:add")
    @Log(title = "司机1035332126", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Secondcar secondcar)
    {
        return toAjax(secondcarService.insertSecondcar(secondcar));
    }

    /**
     * 修改司机1035332126
     */
    @RequiresPermissions("carsecond:secondcar:edit")
    @GetMapping("/edit/{seconddingdanId}")
    public String edit(@PathVariable("seconddingdanId") String seconddingdanId, ModelMap mmap)
    {
        Secondcar secondcar = secondcarService.selectSecondcarBySeconddingdanId(seconddingdanId);
        mmap.put("secondcar", secondcar);
        return prefix + "/edit";
    }

    /**
     * 修改保存司机1035332126
     */
    @RequiresPermissions("carsecond:secondcar:edit")
    @Log(title = "司机1035332126", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Secondcar secondcar)
    {
        return toAjax(secondcarService.updateSecondcar(secondcar));
    }

    /**
     * 删除司机1035332126
     */
    @RequiresPermissions("carsecond:secondcar:remove")
    @Log(title = "司机1035332126", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(secondcarService.deleteSecondcarBySeconddingdanIds(ids));
    }
}
