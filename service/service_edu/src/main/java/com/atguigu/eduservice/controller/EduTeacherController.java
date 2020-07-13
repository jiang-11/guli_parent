package com.atguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-06-21
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    //把service注入
    @Autowired
    private EduTeacherService teacherService;

    //1  查询讲师表中的所有数据
    //rest风格
    @GetMapping("findAll")
//    public List<EduTeacher> findAllTeacher() {
//        //调用service中的方法是实现查询所有的操作
//        List<EduTeacher> list = teacherService.list(null);
//        return list;
//    }
    /**
     * 这是使用统一的返回结果格式返回结果*/
    public R list() {
        List<EduTeacher> list = teacherService.list(null);
        return R.ok().data("items", list);
    }

//    /**
//     * 根据id查询教师信息
//     */
//    @GetMapping("{id}")
//    public void selectById(@PathVariable Integer id) {
//        List<EduTeacher> list = teacherService.
//
//    }

    //逻辑删除讲师的方法
    @DeleteMapping("{id}")//通过路径传入值
    // example： http://localhost:8001/eduservice/teacher/findAll/1
//    public boolean removeTeacher(@PathVariable String id) {//这里的注解是得到路径中传过来的id值
//        boolean flag = teacherService.removeById(id);
//        return true;
//    }
    public R removeById(@PathVariable String id) {
        teacherService.removeById(id);
        return R.ok();
    }
}

