package study.web.user.vo;

import java.util.Date;

public class UserVo {
    private Integer mbrNo;
    private String mbrId;
    private String mbrNm;
    private String passwd;
    private String email;
    private String regId;
    private Date regDtime;
    private String modId;
    private Date modDtime;

    public Integer getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(Integer mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    public String getMbrNm() {
        return mbrNm;
    }

    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Date getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(Date regDtime) {
        this.regDtime = regDtime;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    public Date getModDtime() {
        return modDtime;
    }

    public void setModDtime(Date modDtime) {
        this.modDtime = modDtime;
    }

	@Override
	public String toString() {
		return "UserVo [mbrNo=" + mbrNo + ", mbrId=" + mbrId + ", mbrNm=" + mbrNm + ", passwd=" + passwd
				+ ", email=" + email + ", regId=" + regId + ", regDtime=" + regDtime + ", modId=" + modId
				+ ", modDtime=" + modDtime + "]";
	}
}