package cn.whitecao.messagefucker.service.kejuwang;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class KejuFucker implements MessageFucker {

	public int send(String phone) {
		String s1 = phone.substring(0, 3);
		String s2 = phone.substring(7, 11);
		String s3 = phone.substring(3, 7);
		String rev = s1 + s2 + s3;
		String result = HttpUtil.sendPost(UrlConsts.keju_url, "phone=" + phone
				+ "&check=20161115&reverse=" + rev);
		if (result != null) {
			if (result.equals("ok")) {
				return Result.SUCCESS;
			}
		}
		return Result.SEND_ERROR;
	}

}
