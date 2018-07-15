package postodo.aacii.net.login.dto;

/**
 * 로그인dto
 * 2018.06.09.
 * @author kfx20
 *
 */
public class LoginDto {

	private String userId; 			/* 유저id */
	private String userPassword;	/* 유저pw */
	private String createIp; 		/* 생성자ip */
	private String createTime;		/* 생성시간 */
	private String updateIp; 		/* 수정자ip */
	private String updateTime;		/* 수정시간 */
	private String delYn;			/* 삭제여부 */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateIp() {
		return updateIp;
	}
	public void setUpdateIp(String updateIp) {
		this.updateIp = updateIp;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
	@Override
	public String toString() {
		return "LoginDto [userId=" + userId + ", userPassword=" + userPassword + ", createIp=" + createIp
				+ ", createTime=" + createTime + ", updateIp=" + updateIp + ", updateTime=" + updateTime + ", delYn="
				+ delYn + "]";
	}
	
}
