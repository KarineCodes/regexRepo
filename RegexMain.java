import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^(\\w{3})(\\d{3,4})\\/(0[1-9]|1[0-2])\\/(19[0-9][0-9]|2[0-9][0-9][0-9])$");
//		Matcher matcher = p.matcher("cor123/01/1900");

//		Locale locale = new Locale("en", "EN");
////		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
//		//String date = dateFormat.format(new Date());
//		String pattern = "MM/dd/yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		System.out.println("Date: " + date);
		
//		String patternH = "HH";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternH);
//		String dateH = simpleDateFormat.format(new Date());
//		System.out.println("hours: " + dateH);
		
		String patternM = "MM";
		SimpleDateFormat simpleDateFormatM = new SimpleDateFormat(patternM);
		String dateM = simpleDateFormatM.format(new Date());
		System.out.println("month: " + dateM);
		
		String patternY = "yyyy";
		SimpleDateFormat simpleDateFormatS = new SimpleDateFormat(patternY);
		String dateY = simpleDateFormatS.format(new Date());
		System.out.println("year: " + dateY);
		
		String mmo = "06";
		String date = "cor1234/"+ mmo+"/" + dateY;
		System.out.println(date);
		
		Matcher matcher = p.matcher(date);

		int dateMint = Integer.parseInt(mmo);

		if (matcher.find()) {

			if(Integer.parseInt(dateM) - dateMint == 1)
			{
				String tmp = matcher.group(2); 
				int size = tmp.length();
				String tempInt = ("0").repeat(size).toString();
				//int tmpInt = Integer.parseInt(tmp);
				System.out.println("Corr Ref: " + tempInt);
				//tmpInt = 0000;
				String sTmpInt = String.valueOf(tempInt);
				System.out.println("cor"+ tempInt+ "/" + dateM +"/"+ dateY);

			}
				
//			String tmp = matcher.group(2);
//			int tmpInt = Integer.parseInt(tmp);
//			System.out.println("Corr Ref: " + tmpInt);

			String corrMonth = matcher.group(3);
			int tmpMonth = Integer.parseInt(corrMonth);
			System.out.println("Month: " + tmpMonth);

			String corrYear = matcher.group(4);
			int tmpYear = Integer.parseInt(corrYear);
			System.out.println("Year: " + tmpYear);

		}
	}

}
