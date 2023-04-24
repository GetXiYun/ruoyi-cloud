package com.ruoyi.stu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stu.mapper.StuStuMapper;
import com.ruoyi.stu.domain.StuStu;
import com.ruoyi.stu.service.IStuStuService;

/**
 * 学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-24
 */
@Service
public class StuStuServiceImpl implements IStuStuService 
{
    @Autowired
    private StuStuMapper stuStuMapper;

    /**
     * 查询学生信息
     * 
     * @param Id 学生信息主键
     * @return 学生信息
     */
    @Override
    public StuStu selectStuStuById(Integer Id)
    {
        return stuStuMapper.selectStuStuById(Id);
    }

    /**
     * 查询学生信息列表
     * 
     * @param stuStu 学生信息
     * @return 学生信息
     */
    @Override
    public List<StuStu> selectStuStuList(StuStu stuStu)
    {
        return stuStuMapper.selectStuStuList(stuStu);
    }

    /**
     * 新增学生信息
     * 
     * @param stuStu 学生信息
     * @return 结果
     */
    @Override
    public int insertStuStu(StuStu stuStu)
    {
        return stuStuMapper.insertStuStu(stuStu);
    }

    /**
     * 修改学生信息
     * 
     * @param stuStu 学生信息
     * @return 结果
     */
    @Override
    public int updateStuStu(StuStu stuStu)
    {
        return stuStuMapper.updateStuStu(stuStu);
    }

    /**
     * 批量删除学生信息
     * 
     * @param Ids 需要删除的学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuStuByIds(Integer[] Ids)
    {
        return stuStuMapper.deleteStuStuByIds(Ids);
    }

    /**
     * 删除学生信息信息
     * 
     * @param Id 学生信息主键
     * @return 结果
     */
    @Override
    public int deleteStuStuById(Integer Id)
    {
        return stuStuMapper.deleteStuStuById(Id);
    }
}
