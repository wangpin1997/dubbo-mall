package cn.wpin.mall.order.service;

import cn.wpin.mall.client.order.PortalOrderReturnApplyClient;
import cn.wpin.mall.order.dto.OrderReturnApplyParam;
import cn.wpin.mall.order.entity.OrderReturnApply;
import cn.wpin.mall.order.mapper.OrderReturnApplyMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 *
 * @author wangpin
 */
@Service
@Component
public class PortalOrderReturnApplyService implements PortalOrderReturnApplyClient {


    @Autowired
    private OrderReturnApplyMapper returnApplyMapper;


    @Override
    public int create(OrderReturnApplyParam returnApply) {
        OrderReturnApply realApply = new OrderReturnApply();
        BeanUtils.copyProperties(returnApply, realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
