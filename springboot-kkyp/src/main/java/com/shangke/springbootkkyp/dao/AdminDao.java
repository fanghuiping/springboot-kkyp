package com.shangke.springbootkkyp.dao;

import com.shangke.springbootkkyp.dao.sqlProvidr.AdminSqlProvider;
import com.shangke.springbootkkyp.pojo.Admin;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

/**
 * time:20019/10/22 15:01暂停，先写用户
 */
@Mapper
public interface AdminDao {
    /**
     * 新增地址
     * @param admin
     * @return
     */
    @InsertProvider(type = AdminSqlProvider.class,method = "save")
    int saveByXxlSsoSessionid(Admin admin);

    /**
     * 按照id删除收货地址
     * @param id
     * @return
     */
    @DeleteProvider(type = AdminSqlProvider.class,method = "deleteById")
    int deleteByid(Long id);

    /**
     * 修改收货地址，通过id修改
     */
    @UpdateProvider(type = AdminSqlProvider.class,method = "updaterById")
    int updaterById(Long id, Map<String,String> map);

    /**
     * 按照id和授权编码
     * 查找收货地址详情
     * @return
     */
    @SelectProvider(type = AdminSqlProvider.class,method = "findByIdAndXxlSsoSessionid")
    Admin findByIdAndXxlSsoSessionid(Long Id,String xxlSsoSessionid);

    /**
     * 设置默认地址 || 设置为不是默认地址
     * @param id
     * @param xxlSsoSessionid
     * @return
     */
    @UpdateProvider(type = AdminSqlProvider.class,method = "updateByIdAndXxlSsoSessionid")
    int updateByIdAndXxlSsoSessionid(Long id,String xxlSsoSessionid,Integer defaultId);

    /**
     *利用授权码直接查询默认地址，默认地址后为1
     */
    @SelectProvider(type = AdminSqlProvider.class,method = "findByXxlSsoSessionid")
    Admin findByXxlSsoSessionid(String xxlSsoSessionid);

    /**
     * 查询是否只有1个默认地址
     * @param xxlSsoSessionid
     * @return
     */
    @SelectProvider(type = AdminSqlProvider.class,method = "findByXxlSsoSessionidAndDefaultId")
    List<Integer> findByXxlSsoSessionid(String xxlSsoSessionid,Integer defaultId);

    /**
     * 获取收货地址列表
     */
    @SelectProvider(type = AdminSqlProvider.class,method = "find")
    List<Admin> find();
}
