package com.ruoyi.carsecond.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.carsecond.mapper.SecondcarMapper;
import com.ruoyi.carsecond.domain.Secondcar;
import com.ruoyi.carsecond.service.ISecondcarService;
import com.ruoyi.common.core.text.Convert;

/**
 * 司机1035332126Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Service
public class SecondcarServiceImpl implements ISecondcarService 
{
    @Autowired
    private SecondcarMapper secondcarMapper;

    /**
     * 查询司机1035332126
     * 
     * @param seconddingdanId 司机1035332126主键
     * @return 司机1035332126
     */
    @Override
    public Secondcar selectSecondcarBySeconddingdanId(String seconddingdanId)
    {
        return secondcarMapper.selectSecondcarBySeconddingdanId(seconddingdanId);
    }

    /**
     * 查询司机1035332126列表
     * 
     * @param secondcar 司机1035332126
     * @return 司机1035332126
     */
    @Override
    public List<Secondcar> selectSecondcarList(Secondcar secondcar)
    {
        return secondcarMapper.selectSecondcarList(secondcar);
    }

    /**
     * 新增司机1035332126
     * 
     * @param secondcar 司机1035332126
     * @return 结果
     */
    @Override
    public int insertSecondcar(Secondcar secondcar)
    {
        return secondcarMapper.insertSecondcar(secondcar);
    }

    /**
     * 修改司机1035332126
     * 
     * @param secondcar 司机1035332126
     * @return 结果
     */
    @Override
    public int updateSecondcar(Secondcar secondcar)
    {
        return secondcarMapper.updateSecondcar(secondcar);
    }

    /**
     * 批量删除司机1035332126
     * 
     * @param seconddingdanIds 需要删除的司机1035332126主键
     * @return 结果
     */
    @Override
    public int deleteSecondcarBySeconddingdanIds(String seconddingdanIds)
    {
        return secondcarMapper.deleteSecondcarBySeconddingdanIds(Convert.toStrArray(seconddingdanIds));
    }

    /**
     * 删除司机1035332126信息
     * 
     * @param seconddingdanId 司机1035332126主键
     * @return 结果
     */
    @Override
    public int deleteSecondcarBySeconddingdanId(String seconddingdanId)
    {
        return secondcarMapper.deleteSecondcarBySeconddingdanId(seconddingdanId);
    }
}
