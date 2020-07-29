package com.resource_manage.exception_info.pojo;

/**
 * 异常信息 实体类模型
 * @author Hotel California
 *
 */
public class ExceptionInfo {
    private Integer id; //主键

    private String entDate; // 录入时间

    private String solveAddress; //解决网址
    
    private String name; //异常名称

    private String reason; //出现原因

    private String exceptionInfo;//异常详细信息

    private String solveInfo;// 解决信息
    
    private String completeInfo; //中文信息
    
    private String chName;//中文名
    
    private String updateDate;//最后修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntDate() {
        return entDate;
    }

    public void setEntDate(String entDate) {
        this.entDate = entDate;
    }

    public String getSolveAddress() {
        return solveAddress;
    }

    public void setSolveAddress(String solveAddress) {
        this.solveAddress = solveAddress == null ? null : solveAddress.trim();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo == null ? null : exceptionInfo.trim();
    }

    public String getSolveInfo() {
        return solveInfo;
    }

    public void setSolveInfo(String solveInfo) {
        this.solveInfo = solveInfo == null ? null : solveInfo.trim();
    }

	public String getCompleteInfo() {
		return completeInfo;
	}

	public void setCompleteInfo(String completeInfo) {
		this.completeInfo = completeInfo;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "ExceptionInfo [id=" + id + ", entDate=" + entDate + ", solveAddress=" + solveAddress + ", name=" + name
				+ ", reason=" + reason + ", exceptionInfo=" + exceptionInfo + ", solveInfo=" + solveInfo
				+ ", completeInfo=" + completeInfo + ", chName=" + chName + ", updateDate=" + updateDate + "]";
	}

	
}