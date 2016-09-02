package test;

public class FabRc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fab(5));
		
	}
	static int fab(int a ){
		if(a == 1 || a == 2){
			return 1;
		}else{
			return fab(a-1)+fab(a-2);
		}
		
	}

}
