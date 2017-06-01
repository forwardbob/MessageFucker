package cn.whitecao.MessageFucker;

import org.junit.Test;

import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.service.kejuwang.KejuFucker;

public class TestKeju {
	@Test
	public void Test() {
		MessageFucker mfFucker =new KejuFucker();
		mfFucker.send("17682442613");
	//	System.out.println(reusltString);
	}
}
