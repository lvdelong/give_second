/**
 * Copyright (C), 2015-2019
 * FileName: TaskBean
 * Author:   Administrator
 * Date:     2019/5/16 15:22
 * Description: lvergou
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.model;

/**
 * 〈一句话功能简述〉<br> 
 * 〈lvergou〉
 *
 * @author Administrator
 * @create 2019/5/16
 * @since 1.0.0
 */
public class TaskBean {

    private String  taskId;

    private String  taskName;

    private String  taskStat;

    private String  taskType;

    private String  taskTime;

    private String  taskScriptName;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskStat() {
        return taskStat;
    }

    public void setTaskStat(String taskStat) {
        this.taskStat = taskStat;
    }

    public String getTaskScriptName() {
        return taskScriptName;
    }

    public void setTaskScriptName(String taskScriptName) {
        this.taskScriptName = taskScriptName;
    }

    @Override
    public String toString() {
        return "TaskBean{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskStat='" + taskStat + '\'' +
                ", taskType='" + taskType + '\'' +
                ", taskTime='" + taskTime + '\'' +
                ", taskScriptName='" + taskScriptName + '\'' +
                '}';
    }
}
