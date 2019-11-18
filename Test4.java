
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {

		
		args =  new String[]{"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧"
		  		+ "回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉"
		  		+ "帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成"
		  		+ "娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处"
		  		+ "闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>"};
		String str=args[0];
		int y=0;
		int z=0;
		try{
		for(int i =0;i<str.length();i++){
			if((i+1)%7==0){
				if(z%2!=0){
				System.out.println(str.substring(y, i+1)+"。");
				}else{
				System.out.print(str.substring(y, i+1)+",");	
				}
				z++;
				y+=7;
			}
		}}
		catch(Exception e){
			System.err.println("发生异常："+e.toString());
			e.printStackTrace();
			}
			countString(str,"人");
	}
		
		public static void countString(String str,String s){
			int	count = 0;
			for(int i=0;i<str.length();i++){
				if(str.indexOf(s,i)==i){
				count++;
			}
		}
		System.out.println(s+"  出现了   "+count+" 次");
}
}
