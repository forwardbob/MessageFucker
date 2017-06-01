package cn.whitecao.MessageFucker;

import org.junit.Test;

import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.util.HttpUtil;

public class TestRuiJie {
	@Test
	public void test() {
		String result = HttpUtil.sendPost(
				"https://passport.coocaa.com/helper/send-mobile-img-valid",
				"codeKey=&captcha=&mobile="+UrlConsts.test_phone);
		System.err.println(result);
	}
}
