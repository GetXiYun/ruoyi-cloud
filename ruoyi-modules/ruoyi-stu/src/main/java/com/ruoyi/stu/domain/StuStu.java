package com.ruoyi.stu.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 学生信息对象 stu_stu
 * 
 * @author ruoyi
 * @date 2023-04-24
 */
public class StuStu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer Id;

    /** 班级 */
    @Excel(name = "班级")
    private String StuClass;

    /** 姓名 */
    @Excel(name = "姓名")
    private String StuName;

    /** 学号 */
    @Excel(name = "学号")
    private Long StuId;

    /** 性别 */
    @Excel(name = "性别")
    private String Sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer Age;

    public void setId(Integer Id) 
    {
        this.Id = Id;
    }

    public Integer getId() 
    {
        return Id;
    }
    public void setStuClass(String StuClass) 
    {
        this.StuClass = StuClass;
    }

    public String getStuClass() 
    {
        return StuClass;
    }
    public void setStuName(String StuName) 
    {
        this.StuName = StuName;
    }

    public String getStuName() 
    {
        return StuName;
    }
    public void setStuId(Long StuId) 
    {
        this.StuId = StuId;
    }

    public Long getStuId() 
    {
        return StuId;
    }
    public void setSex(String Sex) 
    {
        this.Sex = Sex;
    }

    public String getSex() 
    {
        return Sex;
    }
    public void setAge(Integer Age) 
    {
        this.Age = Age;
    }

    public Integer getAge() 
    {
        return Age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("Id", getId())
            .append("StuClass", getStuClass())
            .append("StuName", getStuName())
            .append("StuId", getStuId())
            .append("Sex", getSex())
            .append("Age", getAge())
            .toString();
    }
}
