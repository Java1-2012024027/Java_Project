package Sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = false;
		
		mytv.volumeUP(10);
//		System.out.println(mytv.channel + " " + mytv.volume + " " + mytv.onOff);
		mytv.pr();
		
		yourtv.channel = 13;
		yourtv.volume = 10;
		yourtv.onOff = true;
		
		yourtv.pr();
//		System.out.println(yourtv.channel + " " + yourtv.volume + " " + yourtv.onOff);
//		testtv=null;
//		System.out.println(testtv.channel + " " + testtv.volume + " " + testtv.onOff);
		testtv.pr();
	}

}
