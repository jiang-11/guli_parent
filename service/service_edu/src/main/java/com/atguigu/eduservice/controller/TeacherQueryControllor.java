package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.TeacherService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.eduservice.query.TeacherQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiang--
 * @date2020/7/1413:58
 */

@RestController
@RequestMapping("/TeacherAdminController")
public class TeacherQueryControllor {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("{page}/{limit}")
    public R PageQuery(@PathVariable Long page, @PathVariable Long limit, @PathVariable TeacherQuery teacherQuery) {
        Page<EduTeacher> pageParam = new Page<>(page, limit);
        teacherService.pageQuery(pageParam, teacherQuery);
        List<EduTeacher> records = pageParam.getRecords();
        Long total = pageParam.getTotal();
        return R.ok().data("total", total).data("rows", records);

    }
}
