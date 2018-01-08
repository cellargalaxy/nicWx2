package top.cellargalaxy.controlor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.cellargalaxy.bean.controlorBean.ReturnBean;
import top.cellargalaxy.service.Wx;

/**
 * Created by cellargalaxy on 17-12-31.
 */
@RestController
@RequestMapping(RootControlor.ROOT_CONTROLOR_URL)
public class RootControlor {
	public static final String ROOT_CONTROLOR_URL = "/";
	@Autowired
	private Wx wx;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

//	@ResponseBody
//	@GetMapping("")
//	public String test(String signature, String timestamp, String nonce, String echostr) {
//		System.out.println("signature:" + signature);
//		System.out.println("timestamp:" + timestamp);
//		System.out.println("nonce:" + nonce);
//		System.out.println("echostr:" + echostr);
//		return echostr;
//	}
	
	@ResponseBody
	@PostMapping("/sendNetviewWarm")
	public ReturnBean sendNetviewWarm(String token, String info) {
		if (!wx.checkToken(token)) {
			return new ReturnBean(false, "非法token");
		}
		if (wx.sendNetviewWarm(info)) {
			logger.info("发送成功 " + info);
			return new ReturnBean(true, "发送成功");
		} else {
			logger.info("发送失败 " + info);
			return new ReturnBean(false, "发送失败");
		}
	}
}
