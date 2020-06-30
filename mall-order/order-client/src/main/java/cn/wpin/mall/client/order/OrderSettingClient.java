package cn.wpin.mall.client.order;

import cn.wpin.mall.order.entity.OrderSetting;

/**
 * @author wangpin
 */
public interface OrderSettingClient {

    /**
     * 获取指定订单设置
     *
     * @param id
     * @return
     */
    OrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     *
     * @param id
     * @param orderSetting
     * @return
     */
    int update(Long id, OrderSetting orderSetting);
}
