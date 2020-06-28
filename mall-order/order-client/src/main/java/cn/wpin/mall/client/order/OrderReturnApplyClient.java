package cn.wpin.mall.client.order;

import cn.wpin.mall.order.dto.OrderReturnApplyResult;
import cn.wpin.mall.order.dto.ReturnApplyQueryParam;
import cn.wpin.mall.order.dto.UpdateStatusParam;
import cn.wpin.mall.order.entity.OrderReturnApply;

import java.util.List;

/**
 * @author wangpin
 */
public interface OrderReturnApplyClient {

    /**
     * 分页查询退货申请
     *
     * @param queryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<OrderReturnApply> list(ReturnApplyQueryParam queryParam,
                                Integer pageSize,
                                Integer pageNum);

    /**
     * 批量删除申请
     *
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 获取退货申请详情
     *
     * @param id
     * @return
     */
    OrderReturnApplyResult getItem(Long id);

    /**
     * 修改申请状态
     *
     * @param id
     * @param statusParam
     * @return
     */
    int updateStatus(Long id, UpdateStatusParam statusParam);
}
