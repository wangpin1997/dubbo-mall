package cn.wpin.mall.client.order;

import cn.wpin.mall.order.entity.CompanyAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wangpin
 */
public interface CompanyAddressClient {

    /**
     * 获取所有收货地址
     *
     * @return
     */
    @RequestMapping(value = "companyAddress/list", method = RequestMethod.GET)
    List<CompanyAddress> list();
}
