package com.cj.uaap.service;

import java.util.List;
import java.util.Set;

import com.cj.uaap.entity.SysProjectUserGroup;
import com.cj.uaap.entity.SysUser;
/**
 * 作者：z_changjiang
 * 日期：2014-12-10
 * 描述：实现用户管理操作
 *
 */
public interface SysUserService {

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：创建用户
     */
    public SysUser createUser(SysUser sysUser);

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：修改用户
     */
    public SysUser updateUser(SysUser sysUser);

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：删除用户
     */
    public void deleteUser(Long userId);

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：修改密码
     */
    public void changePassword(Long userId, String newPassword);

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：查询用户
     */
    public SysUser findOne(Long userId);

    /**
     * 作者：z_changjiang
     * 日期：2014-12-10
     * 描述：根据用户名称查询用户
     */
    public SysUser findByUsername(String username);
    
    /**
     * 作者：z_changjiang
     * 日期：2014年12月11日
     * 描述：创建用户组
     */
    public SysProjectUserGroup createSysProjectUserGroup(SysProjectUserGroup sysProjectUserGroup);
    /**
     * 作者：z_changjiang
     * 日期：2014年12月11日
     * 描述：修改用户组
     */
    public SysProjectUserGroup updateSysProjectUserGroup(SysProjectUserGroup sysProjectUserGroup);
    /**
     * 作者：z_changjiang
     * 日期：2014年12月11日
     * 描述：查询用户组
     */
    public SysProjectUserGroup findSysProjectUserGroup(Long userId);
    
}
