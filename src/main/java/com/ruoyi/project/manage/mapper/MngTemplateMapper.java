package com.ruoyi.project.manage.mapper;

import java.util.List;
import com.ruoyi.project.manage.domain.MngTemplate;

/**
 * 变化点模板Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public interface MngTemplateMapper 
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
     * 删除变化点模板
     * 
     * @param group 变化点模板ID
     * @return 结果
     */
    public int deleteMngTemplateById(String group);

    /**
     * 批量删除变化点模板
     * 
     * @param groups 需要删除的数据ID
     * @return 结果
     */
    public int deleteMngTemplateByIds(String[] groups);
}
