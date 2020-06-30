package cn.wpin.mall.order.service;

import cn.wpin.mall.client.order.OrderSettingClient;
import cn.wpin.mall.order.entity.OrderSetting;
import cn.wpin.mall.order.mapper.OrderSettingMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 订单设置Service
 *
 * @author wangpin
 */
@Service
@Component
public class OrderSettingService implements OrderSettingClient {

    @Autowired
    private OrderSettingMapper orderSettingMapper;

    /**
     * 获取指定订单设置
     */
    @Override
    public OrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }


    /**
     * 修改指定订单设置
     */
    @Override
    public int update(Long id, OrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }


}
