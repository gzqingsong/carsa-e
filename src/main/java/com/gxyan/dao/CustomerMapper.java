package com.gxyan.dao;

import com.gxyan.pojo.Customer;
import com.gxyan.vo.CustomerQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectSelective(CustomerQuery customerQuery);

    Customer selectByIdCard(String idCard);
}