package zifuchuan;
import java.util.Scanner;
import java.util.*;


public class gushi {
		public static void main(String[] args) 
		{
			StringBuffer s = new StringBuffer();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("������������ʫ:");
	        s.append(scanner.next());
	        StringBuffer s1 = new StringBuffer();
	        Scanner scanner1 = new Scanner(System.in);
	        System.out.println("������Ҫ�ڱ�ʫ������Ҫͳ�Ƹ���������:");
	        s1.append(scanner1.next());
			for (int i = 7;i<s.length();i+=8) {
		        s.insert(i, "��");
		            }
		       for (int a = 15;a<s.length();a+=15) {
		        s.deleteCharAt(a);
		            }
		        for (int b = 15;b<s.length();b+=16) {
		            s.insert(b, "��");
		            }
		        for (int c = 16;c<s.length();c+=17) {
		            s.insert(c, "\n");
		            }
		        System.out.println(s);
			boolean b=s.toString().contains(s1);//���ַ����Ƿ񱻰����ڴ��ַ���֮��,�������true���������false
			System.out.println("�˶��Ƿ��������������:"+b);
			System.out.println("��������Ϊ��"+count(s.toString(),s1.toString()));//����count�������������
		}
			//ͳ�����ַ�������������
		static int count(String s1,String s2)
		{
			int c=0;
			int index=-1;
			while((index=s1.indexOf(s2,index))>-1)//indexOf����һ���ַ����ַ����ĵ�һ�γ���
			{
				index+=7;
				c++;

			}
			return c;
		}
	}