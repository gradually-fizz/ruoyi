package com.ruoyi.project.manage.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.manage.domain.MngTemplate;
import com.ruoyi.project.manage.service.IMngTemplateService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 变化点模板Controller
 *
 * @author ruoyi
 * @date 2021-02-20
 */
@RestController
@RequestMapping("/manage/template")
public class MngTemplateController extends BaseController
{
    @Autowired
    private IMngTemplateService mngTemplateService;

    /**
     * 查询变化点模板列表
     */
    @PreAuthorize("@ss.hasPermi('manage:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(MngTemplate mngTemplate)
    {
        startPage();
        List<MngTemplate> list = mngTemplateService.selectMngTemplateList(mngTemplate);
        return getDataTable(list);
    }
    @PreAuthorize("@ss.hasPermi('manage:template:list')")
    @GetMapping("/all")
    public List<MngTemplate> all()
    {
        return mngTemplateService.selectMngTemplateAll();
    }
    /**
     * 导出变化点模板列表
     */
    @PreAuthorize("@ss.hasPermi('manage:template:export')")
    @Log(title = "变化点模板", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(MngTemplate mngTemplate)
    {
        List<MngTemplate> list = mngTemplateService.selectMngTemplateList(mngTemplate);
        ExcelUtil<MngTemplate> util = new ExcelUtil<MngTemplate>(MngTemplate.class);
        return util.exportExcel(list, "template");
    }

    /**
     * 获取变化点模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:template:query')")
    @GetMapping(value = "/{grouping}")
    public AjaxResult getInfo(@PathVariable("grouping") String grouping)
    {
        return AjaxResult.success(mngTemplateService.selectMngTemplateById(grouping));
    }

    /**
     * 新增变化点模板
     */
    @PreAuthorize("@ss.hasPermi('manage:template:add')")
    @Log(title = "变化点模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MngTemplate mngTemplate)
    {
        return toAjax(mngTemplateService.insertMngTemplate(mngTemplate));
    }

    /**
     * 修改变化点模板
     */
    @PreAuthorize("@ss.hasPermi('manage:template:edit')")
    @Log(title = "变化点模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MngTemplate mngTemplate)
    {
        return toAjax(mngTemplateService.updateMngTemplate(mngTemplate));
    }

    /**
     * 删除变化点模板
     */
    @PreAuthorize("@ss.hasPermi('manage:template:remove')")
    @Log(title = "变化点模板", businessType = BusinessType.DELETE)
    @DeleteMapping("/{groupings}")
    public AjaxResult remove(@PathVariable String[] groupings)
    {
        return toAjax(mngTemplateService.deleteMngTemplateByIds(groupings));
    }
}