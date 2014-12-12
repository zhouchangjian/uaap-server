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
    public SysUser findSysUser(Long userId);

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
    public SysProjectUserGroup findSysProjectUserGroup(Long projectUserGroupId);
    /**
     * 作者：z_changjiang
     * 日期：2014-12-12
     * 描述：查询指定用户的下级用户
     * projectUserGroupId：用户组标志
     * height：用户组深度,小于等于0时遍历返回所有节点
     */
    public List<SysProjectUserGroup> queryUserGroupChildrens(Long projectUserGroupId,int height);
    /**
     * 作者：z_changjiang
     * 日期：2014-12-12
     * 描述：查询指定用户的下级用户
     * sysProjectUserGroup:用户组信息
     * height:用户组深度,小于等于0时遍历返回所有节点
     */
    public void queryUserGroupChildrens(SysProjectUserGroup sysProjectUserGroup,int height);
}
