package com.ruoyi.carfirst.mapper;

import java.util.List;
import com.ruoyi.carfirst.domain.Firstcar;

/**
 * 司机1035320565Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
public interface FirstcarMapper 
{
    /**
     * 查询司机1035320565
     * 
     * @param firstdingdanId 司机1035320565主键
     * @return 司机1035320565
     */
    public Firstcar selectFirstcarByFirstdingdanId(String firstdingdanId);

    /**
     * 查询司机1035320565列表
     * 
     * @param firstcar 司机1035320565
     * @return 司机1035320565集合
     */
    public List<Firstcar> selectFirstcarList(Firstcar firstcar);

    /**
     * 新增司机1035320565
     * 
     * @param firstcar 司机1035320565
     * @return 结果
     */
    public int insertFirstcar(Firstcar firstcar);

    /**
     * 修改司机1035320565
     * 
     * @param firstcar 司机1035320565
     * @return 结果
     */
    public int updateFirstcar(Firstcar firstcar);

    /**
     * 删除司机1035320565
     * 
     * @param firstdingdanId 司机1035320565主键
     * @return 结果
     */
    public int deleteFirstcarByFirstdingdanId(String firstdingdanId);

    /**
     * 批量删除司机1035320565
     * 
     * @param firstdingdanIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFirstcarByFirstdingdanIds(String[] firstdingdanIds);
}
