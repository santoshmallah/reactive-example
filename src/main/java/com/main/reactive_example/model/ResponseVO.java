package com.main.reactive_example.model;

import java.util.List;

public class ResponseVO<T, F> {

	private int totalRecord;
	private List<T> success;
	private List<F> failed;
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public List<T> getSuccess() {
		return success;
	}
	public void setSuccess(List<T> success) {
		this.success = success;
	}
	public List<F> getFailed() {
		return failed;
	}
	public void setFailed(List<F> failed) {
		this.failed = failed;
	}
	@Override
	public String toString() {
		return "ResponseVO [totalRecord=" + totalRecord + ", success=" + success + ", failed=" + failed + "]";
	}

}
