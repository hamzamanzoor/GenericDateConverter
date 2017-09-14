public static String convertDate(String origDate,String oldFormat, String newFormat) {
	DateFormat df = new SimpleDateFormat(oldFormat); 
	Date startDate=null;
	try {
	    startDate = df.parse(origDate);
	   
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	SimpleDateFormat formatter = new SimpleDateFormat(newFormat);
	String formattedDate = formatter.format(startDate);
	return formattedDate;
}