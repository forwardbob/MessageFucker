package cn.whitecao.messagefucker.service.kuwo;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class KuwoFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendPost("http://www.kuwo.cn/api/sms/register", "mobile=" + phone);
		if (result != null) {
			Map<String, Object> map = JSON.parseObject(result, new TypeReference<Map<String, Object>>() {});
			resultStatus=(Integer)map.get("status")==200?Result.SUCCESS:Result.SEND_ERROR;
		}
		return resultStatus;
	}

}
