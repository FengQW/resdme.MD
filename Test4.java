
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {

		
		args =  new String[]{"汉皇重色思倾国御宇多年求不得"+"杨家有女初长成养在深闺人未识"
				+"天生丽质难自弃一朝选在君王侧"+"回眸一笑百媚生六宫粉黛无颜色"
				+"春寒赐浴华清池温泉水滑洗凝脂"+"侍儿扶起娇无力始是新承恩泽时"
				+"云鬓花颜金步摇芙蓉帐暖度春宵"+"春宵苦短日高起从此君王不早朝"
		  		+"承欢侍宴无闲暇春从春游夜专夜"+"后宫佳丽三千人三千宠爱在一身"
		  		+"金屋妆成娇侍夜玉楼宴罢醉和春"+"姊妹弟兄皆列士可怜光采生门户"
		  		+"遂令天下父母心不重生男重生女"+"骊宫高处入青云仙乐风飘处处闻"
		  		+"缓歌慢舞凝丝竹尽日君王看不足"+"渔阳鼙鼓动地来惊破霓裳羽衣曲"+
		  		"九重城阙烟尘生千乘万骑西南行<未完，待续>"};
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
			article(str,"人");
	}
		
	 public static void article(String str,String s){
			int	result = 0;
			for(int i=0;i<str.length();i++){
				if(str.indexOf(s,i)==i){
					result++;
			}
		}
		System.out.println("诗句中:"+s+"  字出现了   "+result+" 次");
}
		

}
