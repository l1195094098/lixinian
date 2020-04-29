package zifuchuan;
import java.util.Scanner;
import java.util.*;


public class gushi {
		public static void main(String[] args) 
		{
			StringBuffer s = new StringBuffer();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("请输入七言律诗:");
	        s.append(scanner.next());
	        StringBuffer s1 = new StringBuffer();
	        Scanner scanner1 = new Scanner(System.in);
	        System.out.println("请输入要在本诗中所需要统计个数的文字:");
	        s1.append(scanner1.next());
			for (int i = 7;i<s.length();i+=8) {
		        s.insert(i, "，");
		            }
		       for (int a = 15;a<s.length();a+=15) {
		        s.deleteCharAt(a);
		            }
		        for (int b = 15;b<s.length();b+=16) {
		            s.insert(b, "。");
		            }
		        for (int c = 16;c<s.length();c+=17) {
		            s.insert(c, "\n");
		            }
		        System.out.println(s);
			boolean b=s.toString().contains(s1);//子字符串是否被包含在此字符串之中,包含输出true，否则输出false
			System.out.println("此段是否包含在主文章中:"+b);
			System.out.println("包含次数为："+count(s.toString(),s1.toString()));//调用count，输出包含次数
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