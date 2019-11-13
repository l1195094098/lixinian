package 字符串;
class  StrDemo
{
	public static void main(String[] args) 
	{
		StringBuffer u=new StringBuffer("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行 ");//创建字符串1
		StringBuffer u1=new StringBuffer("霓");//创建字符串2
		for (int i = 7;i<u.length();i+=8) {
	        u.insert(i, "，");
	            }
	       for (int a = 15;a<u.length();a+=15) {
	        u.deleteCharAt(a);
	            }
	        for (int b = 15;b<u.length();b+=16) {
	            u.insert(b, "。");
	            }
	        for (int c = 16;c<u.length();c+=17) {
	            u.insert(c, "\n");
	            }
	    System.out.println(u);
		boolean b=u.toString().contains(u1);//子字符串是否被包含在此字符串之中,包含输出true，否则输出false
		System.out.println("此段是否包含在主文章中:"+b);
		System.out.println("包含次数为："+count(u.toString(),u1.toString()));//调用count，输出包含次数
	}
		//统计子字符串被包含次数
	static int count(String s1,String s2)
	{
		int c=0;
		int index=-1;
		while((index=s1.indexOf(s2,index))>-1)//indexOf查找一个字符或字符串的第一次出现
		{
			index+=7;
			c++;

		}
		return c;
	}
}