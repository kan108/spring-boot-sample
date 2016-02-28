package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.AppsInpt;
import com.example.test.dto.HatApps;

@RestController
@RequestMapping("api/sample")
public class SampleRestController {

	
	
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public HatApps getSampleData(@RequestBody HatApps hatapps) {
    
    	System.out.println("受信データ：" + hatapps);
    	
    	// AppsInpt
    	AppsInpt appsInpt = new AppsInpt();
    	appsInpt.setString1("TESTString1");
    	List<String> list = new ArrayList<>();
    	list.add("List1データ");
    	list.add("List2データ");
    	
    	HatApps hatApps = new HatApps();
    	hatApps.setAppsInpt(appsInpt);
    	hatApps.setBoolean1(true);
    	hatApps.setString1("HatAppsString1");
    	
    	return hatApps;
    	
    }
	


}
