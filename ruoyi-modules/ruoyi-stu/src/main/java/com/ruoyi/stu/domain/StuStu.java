package com.ruoyi.stu.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 学生信息对象 stu_stu
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StuStu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer id;

    /** 班级 */
    @Excel(name = "班级")
    private String stuClass;

    /** 姓名 */
    @Excel(name = "姓名")
    private String stuName;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuId;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setStuClass(String stuClass) 
    {
        this.stuClass = stuClass;
    }

    public String getStuClass() 
    {
        return stuClass;
    }
    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuName() 
    {
        return stuName;
    }
    public void setStuId(Long stuId) 
    {
        this.stuId = stuId;
    }

    public Long getStuId() 
    {
        return stuId;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuClass", getStuClass())
            .append("stuName", getStuName())
            .append("stuId", getStuId())
            .append("sex", getSex())
            .append("age", getAge())
            .toString();
    }
}
