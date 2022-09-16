package com.ruoyi.carfirst.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.carfirst.mapper.FirstcarMapper;
import com.ruoyi.carfirst.domain.Firstcar;
import com.ruoyi.carfirst.service.IFirstcarService;
import com.ruoyi.common.core.text.Convert;

/**
 * 司机1035320565Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Service
public class FirstcarServiceImpl implements IFirstcarService 
{
    @Autowired
    private FirstcarMapper firstcarMapper;

    /**
     * 查询司机1035320565
     * 
     * @param firstdingdanId 司机1035320565主键
     * @return 司机1035320565
     */
    @Override
    public Firstcar selectFirstcarByFirstdingdanId(String firstdingdanId)
    {
        return firstcarMapper.selectFirstcarByFirstdingdanId(firstdingdanId);
    }

    /**
     * 查询司机1035320565列表
     * 
     * @param firstcar 司机1035320565
     * @return 司机1035320565
     */
    @Override
    public List<Firstcar> selectFirstcarList(Firstcar firstcar)
    {
        return firstcarMapper.selectFirstcarList(firstcar);
    }

    /**
     * 新增司机1035320565
     * 
     * @param firstcar 司机1035320565
     * @return 结果
     */
    @Override
    public int insertFirstcar(Firstcar firstcar)
    {
        return firstcarMapper.insertFirstcar(firstcar);
    }

    /**
     * 修改司机1035320565
     * 
     * @param firstcar 司机1035320565
     * @return 结果
     */
    @Override
    public int updateFirstcar(Firstcar firstcar)
    {
        return firstcarMapper.updateFirstcar(firstcar);
    }

    /**
     * 批量删除司机1035320565
     * 
     * @param firstdingdanIds 需要删除的司机1035320565主键
     * @return 结果
     */
    @Override
    public int deleteFirstcarByFirstdingdanIds(String firstdingdanIds)
    {
        return firstcarMapper.deleteFirstcarByFirstdingdanIds(Convert.toStrArray(firstdingdanIds));
    }

    /**
     * 删除司机1035320565信息
     * 
     * @param firstdingdanId 司机1035320565主键
     * @return 结果
     */
    @Override
    public int deleteFirstcarByFirstdingdanId(String firstdingdanId)
    {
        return firstcarMapper.deleteFirstcarByFirstdingdanId(firstdingdanId);
    }
}
