package postodo.aacii.net.board.dto;

// 자유게시판DTO
public class FreeboardDto {

	public int freeboardNo;				/* 자유게시판 번호 */
	public String freeboardTitle;		/* 자유게시판 제목 */
	public String freeboardContent;		/* 자유게시판 내용 */
	public String createIp;				/* 등록IP */
	public String createId;				/* 등록자 */
	public String createTime;			/* 등록일시 */
	public String updateIp;				/* 수정IP */
	public String updateId;				/* 수정자 */
	public String updateTime;			/* 수정일시 */
	public String delYn;				/* 삭제여부 */
	
	public int getFreeboardNo() {
		return freeboardNo;
	}
	public void setFreeboardNo(int freeboardNo) {
		this.freeboardNo = freeboardNo;
	}
	public String getFreeboardTitle() {
		return freeboardTitle;
	}
	public void setFreeboardTitle(String freeboardTitle) {
		this.freeboardTitle = freeboardTitle;
	}
	public String getFreeboardContent() {
		return freeboardContent;
	}
	public void setFreeboardContent(String freeboardContent) {
		this.freeboardContent = freeboardContent;
	}
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
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
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
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
		return "FreeboardDto [freeboardNo=" + freeboardNo + ", freeboardTitle=" + freeboardTitle + ", freeboardContent="
				+ freeboardContent + ", createIp=" + createIp + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateIp=" + updateIp + ", updateId=" + updateId + ", updateTime=" + updateTime + ", delYn="
				+ delYn + "]";
	}
	
}
