package tw.elliot.cloud.pd.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pd/*")
public class ServiceCtrl {

	@RequestMapping("/firstService")
	public String firstService() {
		return "Success";
	}
}
