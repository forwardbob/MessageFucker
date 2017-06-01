package cn.whitecao.MessageFucker;

import org.junit.Test;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.service.izhejiang.IzhejiangFucker;

public class TestIZhejiang {
	@Test
	public void testI(){
		MessageFucker mf_iZhejiang=new IzhejiangFucker();
		int result=mf_iZhejiang.send("");
		if(result==Result.SUCCESS){
			System.out.println("i-zhejiang 發送成功");
		}
	}
}
