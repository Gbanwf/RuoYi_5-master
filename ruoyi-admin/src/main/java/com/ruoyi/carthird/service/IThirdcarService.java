package com.ruoyi.carthird.service;

import java.util.List;
import com.ruoyi.carthird.domain.Thirdcar;

/**
 * 司机1035312053Service接口
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public interface IThirdcarService 
{
    /**
     * 查询司机1035312053
     * 
     * @param thirddingdanId 司机1035312053主键
     * @return 司机1035312053
     */
    public Thirdcar selectThirdcarByThirddingdanId(String thirddingdanId);

    /**
     * 查询司机1035312053列表
     * 
     * @param thirdcar 司机1035312053
     * @return 司机1035312053集合
     */
    public List<Thirdcar> selectThirdcarList(Thirdcar thirdcar);

    /**
     * 新增司机1035312053
     * 
     * @param thirdcar 司机1035312053
     * @return 结果
     */
    public int insertThirdcar(Thirdcar thirdcar);

    /**
     * 修改司机1035312053
     * 
     * @param thirdcar 司机1035312053
     * @return 结果
     */
    public int updateThirdcar(Thirdcar thirdcar);

    /**
     * 批量删除司机1035312053
     * 
     * @param thirddingdanIds 需要删除的司机1035312053主键集合
     * @return 结果
     */
    public int deleteThirdcarByThirddingdanIds(String thirddingdanIds);

    /**
     * 删除司机1035312053信息
     * 
     * @param thirddingdanId 司机1035312053主键
     * @return 结果
     */
    public int deleteThirdcarByThirddingdanId(String thirddingdanId);
}
