package com.ruoyi.carthird.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.carthird.mapper.ThirdcarMapper;
import com.ruoyi.carthird.domain.Thirdcar;
import com.ruoyi.carthird.service.IThirdcarService;
import com.ruoyi.common.core.text.Convert;

/**
 * 司机1035312053Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-16
 */
@Service
public class ThirdcarServiceImpl implements IThirdcarService 
{
    @Autowired
    private ThirdcarMapper thirdcarMapper;

    /**
     * 查询司机1035312053
     * 
     * @param thirddingdanId 司机1035312053主键
     * @return 司机1035312053
     */
    @Override
    public Thirdcar selectThirdcarByThirddingdanId(String thirddingdanId)
    {
        return thirdcarMapper.selectThirdcarByThirddingdanId(thirddingdanId);
    }

    /**
     * 查询司机1035312053列表
     * 
     * @param thirdcar 司机1035312053
     * @return 司机1035312053
     */
    @Override
    public List<Thirdcar> selectThirdcarList(Thirdcar thirdcar)
    {
        return thirdcarMapper.selectThirdcarList(thirdcar);
    }

    /**
     * 新增司机1035312053
     * 
     * @param thirdcar 司机1035312053
     * @return 结果
     */
    @Override
    public int insertThirdcar(Thirdcar thirdcar)
    {
        return thirdcarMapper.insertThirdcar(thirdcar);
    }

    /**
     * 修改司机1035312053
     * 
     * @param thirdcar 司机1035312053
     * @return 结果
     */
    @Override
    public int updateThirdcar(Thirdcar thirdcar)
    {
        return thirdcarMapper.updateThirdcar(thirdcar);
    }

    /**
     * 批量删除司机1035312053
     * 
     * @param thirddingdanIds 需要删除的司机1035312053主键
     * @return 结果
     */
    @Override
    public int deleteThirdcarByThirddingdanIds(String thirddingdanIds)
    {
        return thirdcarMapper.deleteThirdcarByThirddingdanIds(Convert.toStrArray(thirddingdanIds));
    }

    /**
     * 删除司机1035312053信息
     * 
     * @param thirddingdanId 司机1035312053主键
     * @return 结果
     */
    @Override
    public int deleteThirdcarByThirddingdanId(String thirddingdanId)
    {
        return thirdcarMapper.deleteThirdcarByThirddingdanId(thirddingdanId);
    }
}
