package com.ruoyi.project.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 变化点模板对象 mng_template
 *
 * @author ruoyi
 * @date 2021-02-20
 */
public class MngTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分组 */
    @Excel(name = "分组")
    private String mygrouping;

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
    private String myexception;

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
    private String acktime;

    /** 突发变化点数量 */
    @Excel(name = "突发变化点数量")
    private String unexceptednum;

    /** 突发变化点内容 */
    @Excel(name = "突发变化点内容")
    private String unexcepteditem;

    /** 创建追踪事项 */
    @Excel(name = "创建追踪事项")
    private String creatematter;

    /** 早会总结 */
    @Excel(name = "早会总结")
    private String summary;

    public void setMygrouping(String mygrouping)
    {
        this.mygrouping = mygrouping;
    }

    public String getMygrouping()
    {
        return mygrouping;
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
    public void setMyexception(String myexception)
    {
        this.myexception = myexception;
    }

    public String getMyexception()
    {
        return myexception;
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
    public void setAcktime(String acktime)
    {
        this.acktime = acktime;
    }

    public String getAcktime()
    {
        return acktime;
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
    public void setCreatematter(String creatematter)
    {
        this.creatematter = creatematter;
    }

    public String getCreatematter()
    {
        return creatematter;
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
                .append("mygrouping", getMygrouping())
                .append("category", getCategory())
                .append("items", getItems())
                .append("item", getItem())
                .append("myexception", getMyexception())
                .append("recognizednum", getRecognizednum())
                .append("recognizeditem", getRecognizeditem())
                .append("responsible", getResponsible())
                .append("result", getResult())
                .append("acktime", getAcktime())
                .append("unexceptednum", getUnexceptednum())
                .append("unexcepteditem", getUnexcepteditem())
                .append("creatematter", getCreatematter())
                .append("summary", getSummary())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}