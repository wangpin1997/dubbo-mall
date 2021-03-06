package cn.wpin.mall.order.service;


import cn.wpin.mall.client.order.CompanyAddressClient;
import cn.wpin.mall.order.entity.CompanyAddress;
import cn.wpin.mall.order.example.CompanyAddressExample;
import cn.wpin.mall.order.mapper.CompanyAddressMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 收货地址管Service
 *
 * @author wangpin
 */
@Service
@Component
public class CompanyAddressService implements CompanyAddressClient {

    @Autowired
    private CompanyAddressMapper companyAddressMapper;


    /**
     * 获取全部收货地址
     */
    @Override
    public List<CompanyAddress> list() {
        return companyAddressMapper.selectByExample(new CompanyAddressExample());
    }
}
