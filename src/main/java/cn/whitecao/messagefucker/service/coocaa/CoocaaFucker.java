package cn.whitecao.messagefucker.service.coocaa;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class CoocaaFucker implements MessageFucker {

	public int send(String phone) {
		String result = HttpUtil.sendPost(
				UrlConsts.coocaa_url,
				"codeKey=&captcha=&mobile="+phone);
		if (result.equals("true")) {
			return Result.SUCCESS;
		}
		return Result.CONNECTION_ERROR;
	}

}
