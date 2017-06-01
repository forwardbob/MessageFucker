package cn.whitecao.MessageFucker;

import org.junit.Test;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.service.kuwo.KuwoFucker;

public class TestKuwo {
	@Test
	public void testKuwo() {
		MessageFucker mf_Kuwo = new KuwoFucker();
		int result = mf_Kuwo.send(UrlConsts.test_phone);
		if (result == Result.SUCCESS) {
			System.out.println("Kuwo 發送成功");
		}else{
			System.out.println("Kuwo 短信發送失敗");
		}
	}
}
