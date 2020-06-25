package cn.wpin.mall.client.order;

import cn.wpin.mall.order.entity.CartItem;
import cn.wpin.mall.sale.entity.CartPromotionItem;

import java.util.List;

/**
 * 购物车dubbo暴露接口服务
 *
 * @author wangpin
 */
public interface CartItemClient {

    /**
     * 添加商品到购物车
     *
     * @param cartItem
     * @param id
     * @param name
     * @return
     */
    int add(CartItem cartItem, Long id, String name);

    /**
     * 获取某个会员的购物车列表
     *
     * @param memberId
     * @return
     */
    List<CartItem> list(Long memberId);

    /**
     * 修改购物车中某个商品的数量
     *
     * @param id
     * @param quantity
     * @param memberId
     * @return
     */
    int updateQuantity(Long id,
                       Long memberId,
                       Integer quantity);


    /**
     * 修改购物车中商品的规格
     *
     * @param cartItem
     * @param id
     * @param name
     * @return
     */
    int updateAttr(CartItem cartItem,
                   Long id,
                   String name);

    /**
     * 删除购物车中的某个商品
     *
     * @param ids
     * @param memberId
     * @return
     */
    int delete(Long memberId, List<Long> ids);

    /**
     * 清空购物车
     *
     * @param memberId
     * @return
     */
    int clear(Long memberId);

    List<CartPromotionItem> listPromotion(Long id);
}
