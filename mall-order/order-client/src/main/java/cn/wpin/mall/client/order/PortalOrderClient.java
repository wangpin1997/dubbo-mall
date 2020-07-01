package cn.wpin.mall.client.order;

import cn.wpin.mall.order.entity.ConfirmOrderResult;
import cn.wpin.mall.order.entity.OrderParam;
import cn.wpin.mall.user.entity.Member;

/**
 * @author wangpin
 */
public interface PortalOrderClient {

    /**
     * 根据购物车信息生成确认单信息
     *
     * @param currentMember
     * @return
     */
    ConfirmOrderResult generateConfirmOrder(Member currentMember);

    /**
     * 根据购物车信息生成订单
     *
     * @param orderParam
     * @param orderSn
     * @return
     */
    Object generateOrder(OrderParam orderParam,
                         String orderSn);

    /**
     * 支付成功的回调
     *
     * @param orderId
     * @return
     */
    Object paySuccess(Long orderId);

    /**
     * 自动取消超时订单
     *
     * @return
     */
    Object cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     *
     * @param orderId
     * @return
     */
    long sendDelayMessageCancelOrder(Long orderId);


    void cancelOrder(Long orderId);
}
