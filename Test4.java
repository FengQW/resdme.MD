
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {

		
		args =  new String[]{"������ɫ˼�����������󲻵�"+"�����Ů���������������δʶ"
				+"��������������һ��ѡ�ھ�����"+"����һЦ������������������ɫ"
				+"������ԡ�������Ȫˮ��ϴ��֬"+"�̶���������ʼ���³ж���ʱ"
				+"���޻��ս�ҡܽ����ů�ȴ���"+"��������ո���Ӵ˾������糯"
		  		+"�л���������Ͼ���Ӵ���ҹרҹ"+"�󹬼�����ǧ����ǧ�谮��һ��"
		  		+"����ױ�ɽ���ҹ��¥�����ʹ�"+"��õ��ֽ���ʿ����������Ż�"
		  		+"�������¸�ĸ�Ĳ�����������Ů"+"�깬�ߴ����������ַ�Ʈ������"
		  		+"����������˿���վ���������"+"����ܱ�Ķ�������������������"+
		  		"���س����̳���ǧ������������<δ�꣬����>"};
		String str=args[0];
		int y=0;
		int z=0;
		try{
		for(int i =0;i<str.length();i++){
			if((i+1)%7==0){
				if(z%2!=0){
				System.out.println(str.substring(y, i+1)+"��");
				}else{
				System.out.print(str.substring(y, i+1)+",");	
				}
				z++;
				y+=7;
			}
		}}
		catch(Exception e){
			System.err.println("�����쳣��"+e.toString());
			e.printStackTrace();
			}
			article(str,"��");
	}
		
	 public static void article(String str,String s){
			int	result = 0;
			for(int i=0;i<str.length();i++){
				if(str.indexOf(s,i)==i){
					result++;
			}
		}
		System.out.println("ʫ����:"+s+"  �ֳ�����   "+result+" ��");
}
		

}
