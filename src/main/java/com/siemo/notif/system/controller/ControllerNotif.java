package com.siemo.notif.system.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siemo.notif.system.message.BaseResponse;
import com.siemo.notif.system.message.GetAllDataResponse;
import com.siemo.notif.system.message.GetDataRequest;
import com.siemo.notif.system.message.ManageDataUserRequest;
import com.siemo.notif.system.message.ManageDataUserResponse;
import com.siemo.notif.system.message.SaveRequest;
import com.siemo.notif.system.message.SendAllRequest;
import com.siemo.notif.system.message.SendGroupRequest;
import com.siemo.notif.system.message.SendOneRequest;
import com.siemo.notif.system.message.SendResponse;
import com.siemo.notif.system.service.ServiceNotif;

@RestController
public class ControllerNotif {

	@Autowired
	private ServiceNotif serviceNotif;
	
	
	@PostMapping("/save/device")
	public BaseResponse saveData(@RequestBody SaveRequest request) {
		BaseResponse response = serviceNotif.saveData(request);
		return response;
	}

	@PostMapping("get/all/data")
	public GetAllDataResponse getAllData(@RequestBody GetDataRequest request) {
		GetAllDataResponse response = serviceNotif.getAllData(request);
		return response;
	}

	@PostMapping("get/data")
	public GetAllDataResponse getData(@RequestBody GetDataRequest request) {
		GetAllDataResponse response = serviceNotif.getData(request);
		return response;
	}
	
	@RequestMapping("update/device")
	public ManageDataUserResponse manageDataUser(@RequestBody ManageDataUserRequest request) {
		ManageDataUserResponse response = serviceNotif.manageDataUser(request);
		return response;
	}
	
	@RequestMapping("send/one/customer")
	public SendResponse sendOne(@RequestBody SendOneRequest request) {
		SendResponse response = serviceNotif.sendOne(request);
		return response;
	}

	@RequestMapping("send/group/customer")
	public SendResponse sendGroup(@RequestBody SendGroupRequest request) {
		SendResponse response = serviceNotif.sendGroup(request);
		return response;
	}

	@RequestMapping("send/all/customer")
	public SendResponse sendAll(@RequestBody SendAllRequest request) {
		SendResponse response = serviceNotif.sendAll(request);
		return response;
	}

}
