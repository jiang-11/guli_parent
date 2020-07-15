package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiang--
 * @date2020/7/1415:58
 */
@RestController
@RequestMapping("/eduservice/addTeacher")
public class addTeacherControllor {
    @Autowired
    private EduTeacherService eduTeacherService;

    @PostMapping
    public R save(@RequestBody EduTeacher eduTeacher) {
        eduTeacherService.save(eduTeacher);
        return R.ok();
    }
}
