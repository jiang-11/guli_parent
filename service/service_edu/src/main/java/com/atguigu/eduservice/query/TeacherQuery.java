package com.atguigu.eduservice.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jiang--
 * @date2020/7/1317:11
 *
 * name:教师姓名，模糊查询
 * level：教师头衔 1高级讲师 2首席讲师
 * begin：查询开始的时间
 * end:结束的时间
 */
@Data
public class TeacherQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer level;
    private String begin;
    private String end;

}
