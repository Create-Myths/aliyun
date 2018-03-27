package com.qf.dto;

/**
 * Thanks for Everything.
 */
public class HostDTO {
	private Long id;
	private String hostName;
	private String innerIP;
	private String outerIP;
	private Short state;
	private String die_time;
	private String memo;
	private int firewall;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getInnerIP() {
		return innerIP;
	}

	public void setInnerIP(String innerIP) {
		this.innerIP = innerIP;
	}

	public String getOuterIP() {
		return outerIP;
	}

	public void setOuterIP(String outerIP) {
		this.outerIP = outerIP;
	}

	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public String getDie_time() {
		return die_time;
	}

	public void setDie_time(String die_time) {
		this.die_time = die_time;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getFirewall() {
		return firewall;
	}

	public void setFirewall(int firewall) {
		this.firewall = firewall;
	}
}
