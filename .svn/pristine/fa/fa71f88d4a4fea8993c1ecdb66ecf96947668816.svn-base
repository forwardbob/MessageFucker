package cn.whitecao.messagefucker.service.m10086;


import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class M10086fucker implements MessageFucker{

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendGet("http://go.10086.cn/cc/wap/passport/smslogin/getdypassword?mobile="+phone+"&ssoajax=2016102509334562728&from=http%3A%2F%2Fgo.10086.cn%2Fsurfnews%2Fv%2F%2FsurfActivity.do%3Fmobile%3D%26flag%3D1%26did%3D", "");
		resultStatus=result==null?Result.CONNECTION_ERROR:Result.SUCCESS;
		return resultStatus;
	}

}
