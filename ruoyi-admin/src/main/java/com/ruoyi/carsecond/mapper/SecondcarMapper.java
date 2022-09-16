package com.ruoyi.carsecond.mapper;

import java.util.List;
import com.ruoyi.carsecond.domain.Secondcar;

/**
 * 司机1035332126Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public interface SecondcarMapper 
{
    /**
     * 查询司机1035332126
     * 
     * @param seconddingdanId 司机1035332126主键
     * @return 司机1035332126
     */
    public Secondcar selectSecondcarBySeconddingdanId(String seconddingdanId);

    /**
     * 查询司机1035332126列表
     * 
     * @param secondcar 司机1035332126
     * @return 司机1035332126集合
     */
    public List<Secondcar> selectSecondcarList(Secondcar secondcar);

    /**
     * 新增司机1035332126
     * 
     * @param secondcar 司机1035332126
     * @return 结果
     */
    public int insertSecondcar(Secondcar secondcar);

    /**
     * 修改司机1035332126
     * 
     * @param secondcar 司机1035332126
     * @return 结果
     */
    public int updateSecondcar(Secondcar secondcar);

    /**
     * 删除司机1035332126
     * 
     * @param seconddingdanId 司机1035332126主键
     * @return 结果
     */
    public int deleteSecondcarBySeconddingdanId(String seconddingdanId);

    /**
     * 批量删除司机1035332126
     * 
     * @param seconddingdanIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSecondcarBySeconddingdanIds(String[] seconddingdanIds);
}
