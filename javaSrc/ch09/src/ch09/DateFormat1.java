package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat1 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf[] = new SimpleDateFormat[6];
		sdf[0] = new SimpleDateFormat("yyyy-MM-dd");
		sdf[1] = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		sdf[2] = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		sdf[3] = new SimpleDateFormat("yy/MM/dd (E)");
		sdf[4] = new SimpleDateFormat("yy-MM-dd (a)hh:mm:ss");
		sdf[3] = new SimpleDateFormat("yyyy/MM/dd (E) (a)hh:mm:ss");
		for(SimpleDateFormat sd : sdf) {
			System.out.println(sd.format(date));
		}
	}
}
