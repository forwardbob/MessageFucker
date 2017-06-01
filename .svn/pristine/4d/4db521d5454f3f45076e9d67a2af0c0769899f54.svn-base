package cn.whitecao.messagefucker.service.eleme;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class ElemeFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendPost("https://mainsite-restapi.ele.me/v4/mobile/verify_code/send",
				"{\"mobile\":\""+phone+"\",\"captcha_code\":\"\",\"scene\":\"login\",\"type\":\"sms\"}");
		resultStatus = result == null ? Result.CONNECTION_ERROR : Result.SUCCESS;
		return resultStatus;
	}

}
