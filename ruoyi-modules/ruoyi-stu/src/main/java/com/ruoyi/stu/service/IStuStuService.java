package com.ruoyi.stu.service;

import java.util.List;
import com.ruoyi.stu.domain.StuStu;

/**
 * 学生信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStuStuService 
{
    /**
     * 查询学生信息
     * 
     * @param id 学生信息主键
     * @return 学生信息
     */
    public StuStu selectStuStuById(Integer id);

    /**
     * 查询学生信息列表
     * 
     * @param stuStu 学生信息
     * @return 学生信息集合
     */
    public List<StuStu> selectStuStuList(StuStu stuStu);

    /**
     * 新增学生信息
     * 
     * @param stuStu 学生信息
     * @return 结果
     */
    public int insertStuStu(StuStu stuStu);

    /**
     * 修改学生信息
     * 
     * @param stuStu 学生信息
     * @return 结果
     */
    public int updateStuStu(StuStu stuStu);

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的学生信息主键集合
     * @return 结果
     */
    public int deleteStuStuByIds(Integer[] ids);

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息主键
     * @return 结果
     */
    public int deleteStuStuById(Integer id);
}
