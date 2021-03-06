package com.hyp.learn.quartz.entity;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.quartz.entity
 * hyp create at 19-12-29
 **/

import lombok.Data;

import java.math.BigInteger;

@Data
public class QuartzEntity {

    private String jobName;//任务名称
    private String jobGroup;//任务分组
    private String description;//任务描述
    private String jobClassName;//执行类
    private String cronExpression;//执行时间
    private String triggerName;//执行时间
    private String triggerState;//任务状态
    private String triggerGroup;


    private String timeZoneId;
    private BigInteger repeatInterval;
    private BigInteger timesTriggered;

    private String oldJobName;//任务名称 用于修改
    private String oldJobGroup;//任务分组 用于修改


}
