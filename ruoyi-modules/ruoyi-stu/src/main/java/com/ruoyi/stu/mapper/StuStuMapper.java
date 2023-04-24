package com.ruoyi.stu.mapper;

import java.util.List;
import com.ruoyi.stu.domain.StuStu;

/**
 * 学生信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-18
 */
public interface StuStuMapper 
{
    /**
     * 查询学生信息
     * 
     * @param Id 学生信息主键
     * @return 学生信息
     */
    public StuStu selectStuStuById(Integer Id);

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
     * 删除学生信息
     * 
     * @param Id 学生信息主键
     * @return 结果
     */
    public int deleteStuStuById(Integer Id);

    /**
     * 批量删除学生信息
     * 
     * @param Ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStuStuByIds(Integer[] Ids);
}
