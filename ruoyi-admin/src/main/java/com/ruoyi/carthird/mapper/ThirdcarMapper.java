package com.ruoyi.carthird.mapper;

import java.util.List;
import com.ruoyi.carthird.domain.Thirdcar;

/**
 * 司机1035312053Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public interface ThirdcarMapper 
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
     * 删除司机1035312053
     * 
     * @param thirddingdanId 司机1035312053主键
     * @return 结果
     */
    public int deleteThirdcarByThirddingdanId(String thirddingdanId);

    /**
     * 批量删除司机1035312053
     * 
     * @param thirddingdanIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteThirdcarByThirddingdanIds(String[] thirddingdanIds);
}
