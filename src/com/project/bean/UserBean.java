package com.project.bean;
/*
 * userbean用于登录，关联查询，明密文加解密；
 *    高家祥
 */
public class UserBean {
	/*
	 * 用户id号
	 */
	private int acc_id;
	/*
	 * 用户名
	 */
	private String acc_account;
	/*
	 * 用户名密码
	 */
	private String acc_password;
	/*
	 * 加解密密钥
	 */
	private String acc_rpassword;
	/*
	 * 软删除
	 */
	private int acc_dec;
	/*
	 * 权限表id
	 */
	private int acc_pow_id;
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_account() {
		return acc_account;
	}
	public void setAcc_account(String acc_account) {
		this.acc_account = acc_account;
	}
	public String getAcc_password() {
		return acc_password;
	}
	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}
	public String getAcc_rpassword() {
		return acc_rpassword;
	}
	public void setAcc_rpassword(String acc_rpassword) {
		this.acc_rpassword = acc_rpassword;
	}
	public int getAcc_dec() {
		return acc_dec;
	}
	public void setAcc_dec(int acc_dec) {
		this.acc_dec = acc_dec;
	}
	public int getAcc_pow_id() {
		return acc_pow_id;
	}
	public void setAcc_pow_id(int acc_pow_id) {
		this.acc_pow_id = acc_pow_id;
	}
	
}
