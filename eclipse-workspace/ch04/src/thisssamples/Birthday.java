package thisssamples;

public class Birthday {
	int day;
	int month;
	int year;
	
	public void setyear(int year) {
		this.year = year;
	}
	
	//this를 리턴하는 메소드 정의
	public void printThis() {
		System.out.println(this);
	}

}
