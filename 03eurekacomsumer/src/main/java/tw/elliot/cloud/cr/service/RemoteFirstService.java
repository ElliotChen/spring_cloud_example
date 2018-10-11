package tw.elliot.cloud.cr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "eurekaproducer")
public interface RemoteFirstService {
	@RequestMapping("/pd/firstService")
	String firstService();
}
