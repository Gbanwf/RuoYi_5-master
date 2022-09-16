package com.ruoyi.carthird.controller;

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
import com.ruoyi.carthird.domain.Thirdcar;
import com.ruoyi.carthird.service.IThirdcarService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 司机1035312053Controller
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Controller
@RequestMapping("/carthird/thirdcar")
public class ThirdcarController extends BaseController
{
    private String prefix = "carthird/thirdcar";

    @Autowired
    private IThirdcarService thirdcarService;

    @RequiresPermissions("carthird:thirdcar:view")
    @GetMapping()
    public String thirdcar()
    {
        return prefix + "/thirdcar";
    }

    /**
     * 查询司机1035312053列表
     */
    @RequiresPermissions("carthird:thirdcar:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Thirdcar thirdcar)
    {
        startPage();
        List<Thirdcar> list = thirdcarService.selectThirdcarList(thirdcar);
        return getDataTable(list);
    }

    /**
     * 导出司机1035312053列表
     */
    @RequiresPermissions("carthird:thirdcar:export")
    @Log(title = "司机1035312053", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Thirdcar thirdcar)
    {
        List<Thirdcar> list = thirdcarService.selectThirdcarList(thirdcar);
        ExcelUtil<Thirdcar> util = new ExcelUtil<Thirdcar>(Thirdcar.class);
        return util.exportExcel(list, "司机1035312053数据");
    }

    /**
     * 新增司机1035312053
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存司机1035312053
     */
    @RequiresPermissions("carthird:thirdcar:add")
    @Log(title = "司机1035312053", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Thirdcar thirdcar)
    {
        return toAjax(thirdcarService.insertThirdcar(thirdcar));
    }

    /**
     * 修改司机1035312053
     */
    @RequiresPermissions("carthird:thirdcar:edit")
    @GetMapping("/edit/{thirddingdanId}")
    public String edit(@PathVariable("thirddingdanId") String thirddingdanId, ModelMap mmap)
    {
        Thirdcar thirdcar = thirdcarService.selectThirdcarByThirddingdanId(thirddingdanId);
        mmap.put("thirdcar", thirdcar);
        return prefix + "/edit";
    }

    /**
     * 修改保存司机1035312053
     */
    @RequiresPermissions("carthird:thirdcar:edit")
    @Log(title = "司机1035312053", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Thirdcar thirdcar)
    {
        return toAjax(thirdcarService.updateThirdcar(thirdcar));
    }

    /**
     * 删除司机1035312053
     */
    @RequiresPermissions("carthird:thirdcar:remove")
    @Log(title = "司机1035312053", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(thirdcarService.deleteThirdcarByThirddingdanIds(ids));
    }
}
