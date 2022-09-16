package com.ruoyi.carfirst.controller;

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
import com.ruoyi.carfirst.domain.Firstcar;
import com.ruoyi.carfirst.service.IFirstcarService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 司机1035320565Controller
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Controller
@RequestMapping("/carfirst/firstcar")
public class FirstcarController extends BaseController
{
    private String prefix = "carfirst/firstcar";

    @Autowired
    private IFirstcarService firstcarService;

    @RequiresPermissions("carfirst:firstcar:view")
    @GetMapping()
    public String firstcar()
    {
        return prefix + "/firstcar";
    }

    /**
     * 查询司机1035320565列表
     */
    @RequiresPermissions("carfirst:firstcar:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Firstcar firstcar)
    {
        startPage();
        List<Firstcar> list = firstcarService.selectFirstcarList(firstcar);
        return getDataTable(list);
    }

    /**
     * 导出司机1035320565列表
     */
    @RequiresPermissions("carfirst:firstcar:export")
    @Log(title = "司机1035320565", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Firstcar firstcar)
    {
        List<Firstcar> list = firstcarService.selectFirstcarList(firstcar);
        ExcelUtil<Firstcar> util = new ExcelUtil<Firstcar>(Firstcar.class);
        return util.exportExcel(list, "司机1035320565数据");
    }

    /**
     * 新增司机1035320565
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存司机1035320565
     */
    @RequiresPermissions("carfirst:firstcar:add")
    @Log(title = "司机1035320565", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Firstcar firstcar)
    {
        return toAjax(firstcarService.insertFirstcar(firstcar));
    }

    /**
     * 修改司机1035320565
     */
    @RequiresPermissions("carfirst:firstcar:edit")
    @GetMapping("/edit/{firstdingdanId}")
    public String edit(@PathVariable("firstdingdanId") String firstdingdanId, ModelMap mmap)
    {
        Firstcar firstcar = firstcarService.selectFirstcarByFirstdingdanId(firstdingdanId);
        mmap.put("firstcar", firstcar);
        return prefix + "/edit";
    }

    /**
     * 修改保存司机1035320565
     */
    @RequiresPermissions("carfirst:firstcar:edit")
    @Log(title = "司机1035320565", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Firstcar firstcar)
    {
        return toAjax(firstcarService.updateFirstcar(firstcar));
    }

    /**
     * 删除司机1035320565
     */
    @RequiresPermissions("carfirst:firstcar:remove")
    @Log(title = "司机1035320565", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(firstcarService.deleteFirstcarByFirstdingdanIds(ids));
    }
}
