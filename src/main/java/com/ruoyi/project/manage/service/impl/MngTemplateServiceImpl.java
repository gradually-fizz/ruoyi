package com.ruoyi.project.manage.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.manage.mapper.MngTemplateMapper;
import com.ruoyi.project.manage.domain.MngTemplate;
import com.ruoyi.project.manage.service.IMngTemplateService;

/**
 * 变化点模板Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
@Service
public class MngTemplateServiceImpl implements IMngTemplateService 
{
    @Autowired
    private MngTemplateMapper mngTemplateMapper;

    /**
     * 查询变化点模板
     * 
     * @param group 变化点模板ID
     * @return 变化点模板
     */
    @Override
    public MngTemplate selectMngTemplateById(String group)
    {
        return mngTemplateMapper.selectMngTemplateById(group);
    }

    /**
     * 查询变化点模板列表
     * 
     * @param mngTemplate 变化点模板
     * @return 变化点模板
     */
    @Override
    public List<MngTemplate> selectMngTemplateList(MngTemplate mngTemplate)
    {
        return mngTemplateMapper.selectMngTemplateList(mngTemplate);
    }

    /**
     * 新增变化点模板
     * 
     * @param mngTemplate 变化点模板
     * @return 结果
     */
    @Override
    public int insertMngTemplate(MngTemplate mngTemplate)
    {
        mngTemplate.setCreateTime(DateUtils.getNowDate());
        return mngTemplateMapper.insertMngTemplate(mngTemplate);
    }

    /**
     * 修改变化点模板
     * 
     * @param mngTemplate 变化点模板
     * @return 结果
     */
    @Override
    public int updateMngTemplate(MngTemplate mngTemplate)
    {
        mngTemplate.setUpdateTime(DateUtils.getNowDate());
        return mngTemplateMapper.updateMngTemplate(mngTemplate);
    }

    /**
     * 批量删除变化点模板
     * 
     * @param groups 需要删除的变化点模板ID
     * @return 结果
     */
    @Override
    public int deleteMngTemplateByIds(String[] groups)
    {
        return mngTemplateMapper.deleteMngTemplateByIds(groups);
    }

    /**
     * 删除变化点模板信息
     * 
     * @param group 变化点模板ID
     * @return 结果
     */
    @Override
    public int deleteMngTemplateById(String group)
    {
        return mngTemplateMapper.deleteMngTemplateById(group);
    }
}
