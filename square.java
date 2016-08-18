
public class square {

	int x1,y1;
	static int a=0;
	void add(int x,int y){
		x1=x;
		y1=y;
	}
	static int ab(square s,square s1,square s2,square s3){
		if((s1.x1-s.x1)==(s3.x1-s2.x1)){
			if((s1.y1-s.y1)==(s3.y1-s2.y1)){
				a=0;
			}
			a=1;
		}
		return a;
	}
	public static void main(String[] args) {
		
square s=new square();
square s1=new square();
square s2=new square();
square s3=new square();
s.add(10,0 );
s1.add(10,10);
s2.add(20,10);
s3.add(20,20);
int c=ab(s,s1,s2,s3);
if(c!=0){
	System.out.println("square");
}
else{
	System.out.println(" square");
}
	}

}
