package funcinterface.lamdaint;

//에너테이션
@FunctionalInterface
public interface MyNumber2 {
	
	int getMax(int n1, int n2);

	//int getMin(int n1, int n2);	//1개만 가능
}
