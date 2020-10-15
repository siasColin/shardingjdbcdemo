package com.colin.shardingjdbcdemo.mapper.log;

import java.util.List;

import com.colin.shardingjdbcdemo.entity.log.SysLogs;
import com.colin.shardingjdbcdemo.entity.log.SysLogsCriteria;
import org.apache.ibatis.annotations.Param;

/**
 * @author sxf code generator
 * date:2020/10/09 15:12
 */
public interface SysLogsMapper {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    long countByExample(SysLogsCriteria example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(SysLogsCriteria example);

    /** 
     * 根据ID删除
     * @param id 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long id);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(SysLogs record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(SysLogs record);

    /** 
     * 根据条件查询（包含二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<SysLogs> selectByExampleWithBLOBs(SysLogsCriteria example);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<SysLogs> selectByExample(SysLogsCriteria example);

    /** 
     * 根据ID查询
     * @param id 主键ID
     * @return 返回查询的结果
     */
    SysLogs selectByPrimaryKey(Long id);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(@Param("record") SysLogs record, @Param("example") SysLogsCriteria example);

    /** 
     * 根据条件修改字段 （包含二进制大对象）
     * @param record 修改字段对象(必须含ID）
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleWithBLOBs(@Param("record") SysLogs record, @Param("example") SysLogsCriteria example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(@Param("record") SysLogs record, @Param("example") SysLogsCriteria example);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(SysLogs record);

    /** 
     * 根据ID修改字段（包含二进制大对象）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeyWithBLOBs(SysLogs record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(SysLogs record);
}