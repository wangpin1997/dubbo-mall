package cn.wpin.mall.client.order;

import cn.wpin.mall.order.entity.OrderReturnReason;

import java.util.List;

/**
 * @author wangpin
 */
public interface OrderReturnReasonClient {

    /**
     * 添加退货原因
     *
     * @param returnReason
     * @return
     */
    int create(OrderReturnReason returnReason);


    /**
     * 修改退货原因
     *
     * @param id
     * @param returnReason
     * @return
     */
    int update(Long id, OrderReturnReason returnReason);

    /**
     * 批量删除退货原因
     *
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 分页查询全部退货原因
     *
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<OrderReturnReason> list(Integer pageSize,
                                 Integer pageNum);

    /**
     * 获取单个退货原因详情信息
     *
     * @param id
     * @return
     */
    OrderReturnReason getItem(Long id);

    /**
     * 修改退货原因启用状态
     *
     * @param status
     * @param ids
     * @return
     */
    int updateStatus(Integer status,
                     List<Long> ids);
}
