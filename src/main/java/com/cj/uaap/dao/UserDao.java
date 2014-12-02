package com.cj.uaap.dao;

import java.util.List;

import com.cj.uaap.entity.User;

/**
 * 作者：z_changjiang
 * 日期：2014-11-30
 * 描述：用户信息持久化接口
 *
 */
@MyBatisRepository
public interface UserDao {

	/**
	 * 作者：z_changjiang
	 * 日期：2014-11-30
	 * 描述：实现用户实体新增
	 */
    public void createUser(User user);
    /**
     * 作者：z_changjiang
     * 日期：2014-11-30
     * 描述：实现用户实体修改
     */
    public void updateUser(User user);
    /**
     * 作者：z_changjiang
     * 日期：2014-11-30
     * 描述：实现用户实体删除
     */
    public void deleteUser(Long userId);
    /**
     * 作者：z_changjiang
     * 日期：2014-11-30
     * 描述：根据用户标识查询用户
     */
    public User findOne(Long userId);
    /**
     * 作者：z_changjiang
     * 日期：2014-11-30
     * 描述：查询所有用户
     */
    public List<User> findAll();
    /**
     * 作者：z_changjiang
     * 日期：2014-11-30
     * 描述：根据用户名称返回用户
     */
    public User findByUsername(String username);

}
