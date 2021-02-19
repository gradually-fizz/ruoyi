package com.ruoyi.project.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 变化点模板对象 mng_template
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public class MngTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分组 */
    @Excel(name = "分组")
    private String group;

    /** 类别 */
    @Excel(name = "类别")
    private String category;

    /** 变化点内容 */
    @Excel(name = "变化点内容")
    private String items;

    /** 确认项目 */
    @Excel(name = "确认项目")
    private String item;

    /** 未执行到位产生异常 */
    @Excel(name = "未执行到位产生异常")
    private String exception;

    /** 已识别变化点数量 */
    @Excel(name = "已识别变化点数量")
    private String recognizednum;

    /** 已识别变化点内容 */
    @Excel(name = "已识别变化点内容")
    private String recognizeditem;

    /** 责任人 */
    @Excel(name = "责任人")
    private String responsible;

    /** 确认结果 */
    @Excel(name = "确认结果")
    private String result;

    /** 计划确认时间 */
    @Excel(name = "计划确认时间")
    private String time;

    /** 突发变化点数量 */
    @Excel(name = "突发变化点数量")
    private String unexceptednum;

    /** 突发变化点内容 */
    @Excel(name = "突发变化点内容")
    private String unexcepteditem;

    /** 创建追踪事项 */
    @Excel(name = "创建追踪事项")
    private String create;

    /** 早会总结 */
    @Excel(name = "早会总结")
    private String summary;

    public void setGroup(String group) 
    {
        this.group = group;
    }

    public String getGroup() 
    {
        return group;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setItems(String items) 
    {
        this.items = items;
    }

    public String getItems() 
    {
        return items;
    }
    public void setItem(String item) 
    {
        this.item = item;
    }

    public String getItem() 
    {
        return item;
    }
    public void setException(String exception) 
    {
        this.exception = exception;
    }

    public String getException() 
    {
        return exception;
    }
    public void setRecognizednum(String recognizednum) 
    {
        this.recognizednum = recognizednum;
    }

    public String getRecognizednum() 
    {
        return recognizednum;
    }
    public void setRecognizeditem(String recognizeditem) 
    {
        this.recognizeditem = recognizeditem;
    }

    public String getRecognizeditem() 
    {
        return recognizeditem;
    }
    public void setResponsible(String responsible) 
    {
        this.responsible = responsible;
    }

    public String getResponsible() 
    {
        return responsible;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime() 
    {
        return time;
    }
    public void setUnexceptednum(String unexceptednum) 
    {
        this.unexceptednum = unexceptednum;
    }

    public String getUnexceptednum() 
    {
        return unexceptednum;
    }
    public void setUnexcepteditem(String unexcepteditem) 
    {
        this.unexcepteditem = unexcepteditem;
    }

    public String getUnexcepteditem() 
    {
        return unexcepteditem;
    }
    public void setCreate(String create) 
    {
        this.create = create;
    }

    public String getCreate() 
    {
        return create;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("group", getGroup())
            .append("category", getCategory())
            .append("items", getItems())
            .append("item", getItem())
            .append("exception", getException())
            .append("recognizednum", getRecognizednum())
            .append("recognizeditem", getRecognizeditem())
            .append("responsible", getResponsible())
            .append("result", getResult())
            .append("time", getTime())
            .append("unexceptednum", getUnexceptednum())
            .append("unexcepteditem", getUnexcepteditem())
            .append("create", getCreate())
            .append("summary", getSummary())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
