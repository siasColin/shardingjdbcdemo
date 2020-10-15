package com.colin.shardingjdbcdemo.entity.log;

import java.io.Serializable;
import java.util.Date;

/** 
 * 日志表 sys_logs
 * @author sxf code generator
 * date:2020/10/09 15:12
 */
public class SysLogs implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -5783559469427930L;

    /** 
     * 主键ID
     */ 
    private Long id;

    /** 
     * 应用名称（子系统唯一标识）
     */ 
    private String applicationName;

    /** 
     * 1:操作日志  2：错误日志
     */ 
    private Integer logType;

    /** 
     * 客户端ip
     */ 
    private String ip;

    /** 
     * 操作员
     */ 
    private String operateUser;

    /** 
     * 操作时间
     */ 
    private Date operateTime;

    /** 
     * 模块名称
     */ 
    private String moduleName;

    /** 
     * 创建时间
     */ 
    private Date createTime;

    /** 
     * 日志说明
     */ 
    private String description;

    /** 
     * 获取 主键ID sys_logs.ID
     * @return 主键ID
     */
    public Long getId() {
        return id;
    }

    /** 
     * 设置 主键ID sys_logs.ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * 获取 应用名称（子系统唯一标识） sys_logs.APPLICATION_NAME
     * @return 应用名称（子系统唯一标识）
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** 
     * 设置 应用名称（子系统唯一标识） sys_logs.APPLICATION_NAME
     * @param applicationName 应用名称（子系统唯一标识）
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    /** 
     * 获取 1:操作日志  2：错误日志 sys_logs.LOG_TYPE
     * @return 1:操作日志  2：错误日志
     */
    public Integer getLogType() {
        return logType;
    }

    /** 
     * 设置 1:操作日志  2：错误日志 sys_logs.LOG_TYPE
     * @param logType 1:操作日志  2：错误日志
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /** 
     * 获取 客户端ip sys_logs.IP
     * @return 客户端ip
     */
    public String getIp() {
        return ip;
    }

    /** 
     * 设置 客户端ip sys_logs.IP
     * @param ip 客户端ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /** 
     * 获取 操作员 sys_logs.OPERATE_USER
     * @return 操作员
     */
    public String getOperateUser() {
        return operateUser;
    }

    /** 
     * 设置 操作员 sys_logs.OPERATE_USER
     * @param operateUser 操作员
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    /** 
     * 获取 操作时间 sys_logs.OPERATE_TIME
     * @return 操作时间
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /** 
     * 设置 操作时间 sys_logs.OPERATE_TIME
     * @param operateTime 操作时间
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /** 
     * 获取 模块名称 sys_logs.MODULE_NAME
     * @return 模块名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /** 
     * 设置 模块名称 sys_logs.MODULE_NAME
     * @param moduleName 模块名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /** 
     * 获取 创建时间 sys_logs.CREATE_TIME
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 sys_logs.CREATE_TIME
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 日志说明 sys_logs.DESCRIPTION
     * @return 日志说明
     */
    public String getDescription() {
        return description;
    }

    /** 
     * 设置 日志说明 sys_logs.DESCRIPTION
     * @param description 日志说明
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", applicationName=").append(applicationName);
        sb.append(", logType=").append(logType);
        sb.append(", ip=").append(ip);
        sb.append(", operateUser=").append(operateUser);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}