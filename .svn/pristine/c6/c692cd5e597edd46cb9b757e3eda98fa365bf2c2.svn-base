package cn.whitecao.messagefucker.service.yunjiazheng;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class YunJiaZhengFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendPost(UrlConsts.yunjiaz_url, "mobile="
				+ phone + "&code=");
		if (result != null) {
			Map<String, Object> map = JSON.parseObject(result,
					new TypeReference<Map<String, Object>>() {
					});
			int flag =(Integer) map.get("flag");
			if (flag==0) {
				resultStatus=Result.SUCCESS;
			}else {
				resultStatus=Result.SEND_ERROR;
			}
		}
		return resultStatus;
	}

}
