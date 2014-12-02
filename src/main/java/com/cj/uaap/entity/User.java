package com.cj.uaap.entity;
import java.io.Serializable;
import java.util.Set;
/**
 * 作者：z_changjiang
 * 日期：2014-11-30
 * 描述：用户信息实体
 *
 */
public class User implements Serializable {
	private Long userId; //用户标识
    private String username; //用户名
    private String password; //密码
    private String salt; //加密密码的盐
    private Boolean locked = Boolean.FALSE;
    private Long ownerId; //用户归属
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public String getCredentialsSalt(){
		return this.username+this.salt;
	}
	public Set<String> getRoleIds(){
		return null;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
}
