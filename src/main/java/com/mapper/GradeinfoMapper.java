package com.mapper;

import com.po.Gradeinfo;
import com.po.KeyfiledOfGradeinfo;

import java.util.List;

public interface GradeinfoMapper {
    /**
     * 根据年级id查询年级信息信息
     * @param gradeid
     * @return
     */
    public Gradeinfo selectByPrimaryKey(Integer gradeid);

    /**
     * 查询所有年级信息
     * @return
     */
    public List<Gradeinfo> selectAllgrade();

    /**
     * 查询某个学院的所有专业
     * @return
     */
    public List<String> selectAllProfessionByCollege(String college);
    /**
     * 查询所有学院
     * @return
     */
    public List<String> selectAllCollege();

    /**
     * 查询所有专业
     * @return
     */
    public List<String> selectAllProfession();

    /**
     * 按学院专业年级校区查找对应年级
     * @param keyfiledOfGradeinfo
     * @return
     */
    public Gradeinfo  selectgradeId(KeyfiledOfGradeinfo keyfiledOfGradeinfo);
    /**
     * 删除年级id为gradeid的年级信息
     * @param gradeid
     * @return
     */


    public int deleteByPrimaryKey(Integer gradeid);
    /**
     * 插入年级信息
     * @param record
     * @return
     */

    public int insert(Gradeinfo record);
    /**
     * 修改年级信息
     * @param record
     * @return
     */

    public int updateByPrimaryKey(Gradeinfo record);


}