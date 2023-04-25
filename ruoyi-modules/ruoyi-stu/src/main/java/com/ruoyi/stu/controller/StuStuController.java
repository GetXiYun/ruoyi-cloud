package com.ruoyi.stu.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.stu.domain.StuStu;
import com.ruoyi.stu.service.IStuStuService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 学生信息Controller
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@RestController
@RequestMapping("/stulist")
public class StuStuController extends BaseController
{
    @Autowired
    private IStuStuService stuStuService;

    /**
     * 查询学生信息列表
     */
    @RequiresPermissions("stu:stulist:list")
    @GetMapping("/list")
    public TableDataInfo list(StuStu stuStu)
    {
        startPage();
        List<StuStu> list = stuStuService.selectStuStuList(stuStu);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @RequiresPermissions("stu:stulist:export")
    @Log(title = "学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StuStu stuStu)
    {
        List<StuStu> list = stuStuService.selectStuStuList(stuStu);
        ExcelUtil<StuStu> util = new ExcelUtil<StuStu>(StuStu.class);
        util.exportExcel(response, list, "学生信息数据");
    }

    /**
     * 获取学生信息详细信息
     */
    @RequiresPermissions("stu:stulist:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(stuStuService.selectStuStuById(id));
    }

    /**
     * 新增学生信息
     */
    @RequiresPermissions("stu:stulist:add")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StuStu stuStu)
    {
        return toAjax(stuStuService.insertStuStu(stuStu));
    }

    /**
     * 修改学生信息
     */
    @RequiresPermissions("stu:stulist:edit")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StuStu stuStu)
    {
        return toAjax(stuStuService.updateStuStu(stuStu));
    }

    /**
     * 删除学生信息
     */
    @RequiresPermissions("stu:stulist:remove")
    @Log(title = "学生信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(stuStuService.deleteStuStuByIds(ids));
    }
}
