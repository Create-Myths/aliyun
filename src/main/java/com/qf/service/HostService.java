package com.qf.service;

import com.qf.dto.HostDTO;
import com.qf.pojo.YunHost;

import java.util.List;

/**
 * Thanks for Everything.
 */
public interface HostService {

	/**
	 *
	 * @param hostName 可选
	 * @return
	 */
	public List<HostDTO> findByName(String hostName);

	public int addHost(YunHost yunHost);

}
