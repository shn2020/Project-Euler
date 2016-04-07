package Ex3;

import java.math.BigInteger;

public class Main {
	static BigInteger so0= new BigInteger("0");
	static BigInteger so1= new BigInteger("1");
	static BigInteger so2 = new BigInteger("2");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger num= new BigInteger("600851475143");
		
		for (BigInteger i = num; i.compareTo(so0)==1; i=i.subtract(so1)){
			if ((num.mod(i).compareTo(so0)==0)&&(Check(i)==true)){
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean Check(BigInteger x){
		
		for (BigInteger i = new BigInteger("2"); i.compareTo(x.divide(so2))==-1; i=i.add(so1)){
			if (x.mod(i).compareTo(so0)==0){
				return false;
			}
		}
		return true;
	}
}
