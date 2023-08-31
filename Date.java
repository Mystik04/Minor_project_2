public class Date {
	int day,month,year;
	Date(int x,int y, int z){
		day=x;
		month=y;
		year=z;
	}
	public String getDate() {
        return (day + "-" + month + "-" + year);
    }

}
