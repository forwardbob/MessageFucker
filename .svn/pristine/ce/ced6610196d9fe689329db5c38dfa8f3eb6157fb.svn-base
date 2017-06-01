package cn.whitecao.messagefucker.service.yifuw;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class YifuwFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus = Result.CONNECTION_ERROR;
		String result = HttpUtil.sendPost(UrlConsts.yifuw_url, "version=V1.30&phone="+phone+"&codetype=1&authKey=1BE218F26811CD5BC01D92E0E220D9D5&I10o=XUTPXtO4HtS2ENOnM0M1MuXmXUM5XuUmHJSyXOM5HNU%3D&channel=1");
		if (result != null) {
			Map<String, Object> map = JSON.parseObject(result, new TypeReference<Map<String, Object>>() {});
			resultStatus=map.get("status").equals("1")?Result.SUCCESS:Result.SEND_ERROR;
		}
		return resultStatus;
	}

}
