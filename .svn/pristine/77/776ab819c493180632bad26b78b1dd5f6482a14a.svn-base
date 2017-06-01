package cn.whitecao.messagefucker.service.ruijie;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class RuiJieFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendRuiJiePost(UrlConsts.ruijie_url,
				"codeType=mobile&txtValue="+phone);
		if (result!=null) {
			resultStatus=result.equals("1")?Result.SUCCESS:Result.SEND_ERROR;
		}	
		return resultStatus;
	}

}
