package tw.elliot.cloud.cr.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.elliot.cloud.cr.service.RemoteFirstService;

@RestController
@RequestMapping("/demo")
public class DemoComsumerCtrl {

	@Autowired
	private RemoteFirstService service;

	@RequestMapping("/remoteDemo")
	public String remoteDemo() {
		return service.firstService();
	}
}
