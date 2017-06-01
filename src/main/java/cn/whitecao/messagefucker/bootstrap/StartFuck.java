package cn.whitecao.messagefucker.bootstrap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import cn.whitecao.messagefucker.common.Result;
import cn.whitecao.messagefucker.service.MessageFucker;
import cn.whitecao.messagefucker.service.coocaa.CoocaaFucker;
import cn.whitecao.messagefucker.service.eleme.ElemeFucker;
import cn.whitecao.messagefucker.service.izhejiang.IzhejiangFucker;
import cn.whitecao.messagefucker.service.jzsec.JzsecFucker;
import cn.whitecao.messagefucker.service.kejuwang.KejuFucker;
import cn.whitecao.messagefucker.service.kuwo.KuwoFucker;
import cn.whitecao.messagefucker.service.m10086.M10086fucker;
import cn.whitecao.messagefucker.service.ruijie.RuiJieFucker;
import cn.whitecao.messagefucker.service.yifuw.YifuwFucker;
import cn.whitecao.messagefucker.service.yunjiazheng.YunJiaZhengFucker;

public class StartFuck {
	public static void main(String[] args) {
		
		String phone = "";
		StartFuck sf=new StartFuck();
		List<MessageFucker> list = sf.init();
		
		System.out.println("接口数:" + list.size());
		System.out.println("输入手机号");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (true) {
			phone = s.next();
			if (phone.length() == 11) {
				break;
			}
		}
		int n = 0;
		for (;;) {
			n++;
			System.out.println("第" + n + "轮");
			for (MessageFucker mfList : list) {
				try {
					if (mfList.send(phone) == Result.SUCCESS) {
						System.out.println(new Date() + ":"
								+ mfList.getClass().getSimpleName() + "---成功");
					} else {
						System.out.println(new Date() + ":"
								+ mfList.getClass().getSimpleName() + "---失败");
					}
					Thread.sleep(6666);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public  List<MessageFucker> init() {
		List<MessageFucker> list = new ArrayList<MessageFucker>();

		MessageFucker ef = new ElemeFucker();
		list.add(ef);

		MessageFucker izj = new IzhejiangFucker();
		list.add(izj);

		MessageFucker jzsec = new JzsecFucker();
		list.add(jzsec);

		MessageFucker kuwo = new KuwoFucker();
		list.add(kuwo);

		MessageFucker yifuw = new YifuwFucker();
		list.add(yifuw);

		MessageFucker m10086 = new M10086fucker();
		list.add(m10086);

		MessageFucker ruiFucker = new RuiJieFucker();
		list.add(ruiFucker);

		MessageFucker coocaa = new CoocaaFucker();
		list.add(coocaa);

		MessageFucker keju = new KejuFucker();
		list.add(keju);

		MessageFucker yunzj = new YunJiaZhengFucker();
		list.add(yunzj);

		return list;
	}
}
