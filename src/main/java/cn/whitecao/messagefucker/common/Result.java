package cn.whitecao.messagefucker.common;

//返回状态
public class Result {
	//成功
	public static final int SUCCESS = 0x0;
	//繁忙
	public static final int BUSY = 0x1;
	//连接失败
	public static final int CONNECTION_ERROR =0x2;
	//發送失敗
	public static final int SEND_ERROR =0x3;
}
