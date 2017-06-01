package cn.whitecao.messagefucker.service.jzsec;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class JzsecFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendPost(UrlConsts.jzsec_url, "appVer=186&envType=1&deviceCode=&roleName=&roleCode=&city=&mobilephone="+phone+"&useVoice=0&token=&deviceType=Android&userId=&province=&trade_url=https%3A%2F%2Fc.jzsec.com%3A444%2Fservlet%2F&client_id=&appType=11");
		if (result != null) {
			Map<String, Object> map = JSON.parseObject(result, new TypeReference<Map<String, Object>>() {});
			resultStatus=(Integer)map.get("code")==0?Result.SUCCESS:Result.BUSY;
		}
		return resultStatus;
	//	String result = HttpUtil.sendPost("https://c.jzsec.com/cuser/sendauthcode","appVer=186&envType=1&deviceCode=&roleName=&roleCode=&city=&mobilephone=17682442613&useVoice=0&token=&deviceType=Android&userId=&province=&trade_url=https%3A%2F%2Fc.jzsec.com%3A444%2Fservlet%2F&client_id=&appType=11");
	}

}
