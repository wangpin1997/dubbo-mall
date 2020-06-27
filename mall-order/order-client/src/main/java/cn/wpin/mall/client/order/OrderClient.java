package cn.wpin.mall.client.order;

import cn.wpin.mall.order.dto.*;
import cn.wpin.mall.order.entity.Order;

import java.util.List;

/**
 * @author wangpin
 */
public interface OrderClient {

    /**
     * 查询订单
     *
     * @param queryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<Order> list(OrderQueryParam queryParam,
                     Integer pageSize,
                     Integer pageNum);

    /**
     * 批量发货
     *
     * @param deliveryParamList
     * @return
     */
    int delivery(List<OrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     *
     * @param ids
     * @param note
     * @return
     */
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     *
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 获取订单详情:订单信息、商品信息、操作记录
     *
     * @param id
     * @return
     */
    OrderDetail detail(Long id);

    /**
     * 修改收货人信息
     *
     * @param receiverInfoParam
     * @return
     */
    int updateReceiverInfo(ReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     *
     * @param moneyInfoParam
     * @return
     */
    int updateReceiverInfo(MoneyInfoParam moneyInfoParam);

    /**
     * 备注订单
     *
     * @param id
     * @param note
     * @param status
     * @return
     */
    int updateNote(Long id,
                   String note,
                   Integer status);
}
