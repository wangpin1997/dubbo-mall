package cn.wpin.mall.order.service;


import cn.wpin.mall.client.order.OrderReturnReasonClient;
import cn.wpin.mall.order.entity.OrderReturnReason;
import cn.wpin.mall.order.example.OrderReturnReasonExample;
import cn.wpin.mall.order.mapper.OrderReturnReasonMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 订单原因管理Service
 *
 * @author wangpin
 */
@Service
@Component
public class OrderReturnReasonService implements OrderReturnReasonClient {

    @Autowired
    private OrderReturnReasonMapper returnReasonMapper;


    /**
     * 添加订单原因
     */
    @Override
    public int create(OrderReturnReason returnReason) {
        returnReason.setCreateTime(new Date());
        return returnReasonMapper.insert(returnReason);
    }

    /**
     * 修改退货原因
     */
    @Override
    public int update(Long id, OrderReturnReason returnReason) {
        returnReason.setId(id);
        return returnReasonMapper.updateByPrimaryKey(returnReason);
    }

    /**
     * 批量删除退货原因
     */
    @Override
    public int delete(List<Long> ids) {
        OrderReturnReasonExample example = new OrderReturnReasonExample();
        example.createCriteria().andIdIn(ids);
        return returnReasonMapper.deleteByExample(example);
    }


    /**
     * 分页获取退货原因
     */
    @Override
    public List<OrderReturnReason> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        OrderReturnReasonExample example = new OrderReturnReasonExample();
        example.setOrderByClause("sort desc");
        return returnReasonMapper.selectByExample(example);
    }

    /**
     * 批量修改退货原因状态
     */
    @Override
    public int updateStatus(Integer status, List<Long> ids) {
        if (!status.equals(0) && !status.equals(1)) {
            return 0;
        }
        OrderReturnReason record = new OrderReturnReason();
        record.setStatus(status);
        OrderReturnReasonExample example = new OrderReturnReasonExample();
        example.createCriteria().andIdIn(ids);
        return returnReasonMapper.updateByExampleSelective(record, example);
    }

    /**
     * 获取单个退货原因详情信息
     */
    @Override
    public OrderReturnReason getItem(Long id) {
        return returnReasonMapper.selectByPrimaryKey(id);
    }


}
