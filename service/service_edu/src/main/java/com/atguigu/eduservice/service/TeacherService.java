package com.atguigu.eduservice.service;

import com.atguigu.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.eduservice.query.TeacherQuery;
import org.springframework.stereotype.Service;

/**
 * @author jiang--
 * @date2020/7/1317:17
 */
@Service
public interface TeacherService extends IService<EduTeacher> {
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
