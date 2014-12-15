package com.cj.uaap.service;

import java.util.List;

import com.cj.uaap.entity.SysProject;
import com.cj.uaap.entity.SysProjectUserGroup;
import com.cj.uaap.entity.SysUserProject;

/**
 * 作者：z_changjiang
 * 日期：2014-12-12
 * 描述：实现项目管理功能
 *
 */
public interface SysProjectService {
	/**
	 * 作者：z_changjiang
	 * 日期：2014-12-12
	 * 描述：创建项目
	 */
	public SysProject createSysProject(SysProject sysProject);

	/**
	 * 作者：z_changjiang
	 * 日期：2014-12-12
	 * 描述：修改项目
	 */
	public SysProject updateSysProject(SysProject sysProject);
	/**
	 * 作者：z_changjiang
	 * 日期：2014-12-12
	 * 描述：删除项目 
	 */
	public void deleteSysProject(Long projectId);
	/**
	 * 作者：z_changjiang
	 * 日期：2014-12-12
	 * 描述：根据项目标志查询项目
	 */
	public SysProject findSysProject(Long projectId); 
	
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
   
    /**
     * 作者：z_changjiang
     * 日期：2014-12-13
     * 描述：指派用户到项目
     */
    public SysUserProject assignUserToProject(SysUserProject sysUserProject);
    /**
     * 作者：z_changjiang
     * 日期：2014-12-13
     * 描述：将用户从某个项目中删除
     */
    public void deleteUserFromProject(Long userId,Long projectId);
    /**
     * 作者：z_changjiang
     * 日期：2014-12-15
     * 描述：修改用户项目
     */
	SysUserProject updateUserProject(SysUserProject sysUserProject);
    
}
