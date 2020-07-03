package cn.wpin.mall.client.order;

import cn.wpin.mall.order.dto.OrderReturnApplyParam;

/**
 * @author wangpin
 */
public interface PortalOrderReturnApplyClient {

    /**
     * 申请退货
     */
    int create(OrderReturnApplyParam returnApply);
}
