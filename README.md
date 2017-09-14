The given function converts any input date format to required output format. The function takes three arguments, the date, original format of date and the required output format.

## Example

convertDate("05-10-2017","mm-dd-yyyy","dd/mm/yyyy") 
convertDate("25-10-1999","dd-mm-yyyy","dd*yyyy/mm")
convertDate("01/2003-15","mm/yyyy-dd","mm/dd-yyyy")

These calls will return the following dates

10/05/2017
25*1999/10
01/15-2003 
