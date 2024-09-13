package Test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "13:33";
//		inttime(str);
//		
		String[] commands = new String[] {"next"};
		int video_len = inttime("07:22");
		int pos = inttime("04:05");
		int op_start = inttime("00:15");
		int op_end = inttime("04:07");
		

		
		
		for(int i = 0; i < commands.length; i++) {
			
			
			if(op_start <= pos && pos  <= op_end) {
				pos = op_end;
			}
			
			
			if(commands[i] == "next") {
				pos = pos + 10;
			}else if()
			
			
			
			if(commands[i] == "prev") {
				pos = pos - 10;
				if(pos < 0) {
					pos = 0;
				}
			}
			
			
			
			if(op_start <= pos && pos  <= op_end) {
				pos = op_end;
			}
			
			
		}
		
		System.out.print(strtime(pos));
		
	
    }

public static String strtime(int pos){
    int min = pos/60;
    int sec = pos%60;
    
    
    
    String secs = "";
    String mins = "";
    
    if(min < 10){
        mins ="0" + Integer.toString(min);
    }else {
        mins = Integer.toString(min);
    }

    if(sec < 10){
    	secs ="0" +  Integer.toString(sec);
    }else {
    	secs = Integer.toString(sec);
    }
    
    String times =mins + ":" + secs ;
    
    return times ;
}
    
    
	
	public static int inttime(String a) {	 
		String[] b = a.split(":");
		int min = Integer.parseInt(b[0]);
		int sec = Integer.parseInt(b[1]);
		int time = min*60 + sec;
		return time;
		
	}
	
}


	

