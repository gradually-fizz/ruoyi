package com.ruoyi.project.manage.service;

import java.util.List;
import com.ruoyi.project.manage.domain.MngTemplate;

/**
 * 变化点模板Service接口
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public interface IMngTemplateService 
{
    /**
     * 查询变化点模板
     * 
     * @param group 变化点模板ID
     * @return 变化点模板
     */
    public MngTemplate selectMngTemplateById(String group);

    /**
     * 查询变化点模板列表
     * 
     * @param mngTemplate 变化点模板
     * @return 变化点模板集合
     */
    public List<MngTemplate> selectMngTemplateList(MngTemplate mngTemplate);

    /**
     * 新增变化点模板
     * 
     * @param mngTemplate 变化点模板
     * @return 结果
     */
    public int insertMngTemplate(MngTemplate mngTemplate);

    /**
     * 修改变化点模板
     * 
     * @param mngTemplate 变化点模板
     * @return 结果
     */
    public int updateMngTemplate(MngTemplate mngTemplate);

    /**
     * 批量删除变化点模板
     * 
     * @param groups 需要删除的变化点模板ID
     * @return 结果
     */
    public int deleteMngTemplateByIds(String[] groups);

    /**
     * 删除变化点模板信息
     * 
     * @param group 变化点模板ID
     * @return 结果
     */
    public int deleteMngTemplateById(String group);
}
