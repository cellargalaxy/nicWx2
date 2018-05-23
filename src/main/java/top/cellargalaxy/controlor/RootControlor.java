package top.cellargalaxy.controlor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.cellargalaxy.bean.ReturnBean;
import top.cellargalaxy.service.Wx;

/**
 * Created by cellargalaxy on 17-12-31.
 */
@RestController
@RequestMapping(RootControlor.ROOT_CONTROLOR_URL)
public class RootControlor {
	public static final String ROOT_CONTROLOR_URL = "";
	@Autowired
	private Wx wx;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/page")
	public String index() {
		return "index";
	}

	@ResponseBody
	@PostMapping("/sendNetviewWarm")
	public ReturnBean sendNetviewWarm(String token, String info) {
		if (!wx.checkToken(token)) {
			logger.info("非法token: " + token);
			return new ReturnBean(false, "非法token");
		}
		if (wx.sendNetviewWarm(info)) {
			logger.info("发送成功\n" + info);
			return new ReturnBean(true, "发送成功");
		} else {
			logger.info("发送失败\n" + info);
			return new ReturnBean(false, "发送失败");
		}
	}
}
