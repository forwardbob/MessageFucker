package cn.whitecao.messagefucker.service.izhejiang;

import java.util.Date;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.common.UrlConsts;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.util.HttpUtil;

public class IzhejiangFucker implements MessageFucker {

	public int send(String phone) {
		int resultStatus=Result.CONNECTION_ERROR;
		String result = HttpUtil
				.sendGet(
						UrlConsts.i_Zhejiang_url,
						"mobile="
								+ phone
								+ "&wlanAcName=0208.0571.571.00&wlanUserIp=10.24.237.87&wlanAcIp=");
		if (result!=null) {
			Map<String, Object> map = JSON.parseObject(result,
					new TypeReference<Map<String, Object>>() {
					});
			
			if(map.get("code").equals("0")){
				resultStatus=Result.SUCCESS;
			}else if(map.get("code").equals("3")){
				resultStatus=Result.BUSY;
			}else {
				System.err.println(new Date()+":"+"i-zhejiang "+result);
			}
			
		}
		
		return resultStatus;
	}
}
