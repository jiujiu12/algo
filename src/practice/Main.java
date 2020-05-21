package practice;

import java.util.Scanner;

/**
 * 
 * @author furry
 设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。
这个类的构造函数是：

Fraction(int a, int b)

    构造一个a/b的分数。

这个类要提供以下的功能：
double toDouble();

    将分数转换为double

Fraction plus(Fraction r);

    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。

Fraction multiply(Fraction r);

    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。

void print();

    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。

注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。

 */


public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}


}
class Fraction {
//	成绩
	private int score;
//	分子
	private int numerator;
//	分母
	private int denominator;
//	构造函数
	Fraction(int a, int b){
		if(a==0){
			this.numerator=0;
			this.denominator=1;
		}else{
			int c=f(a,b);
			if(c==0){
				this.numerator=a;
				this.denominator=b;
			}else{
				this.numerator=a/c;
				this.denominator=b/c;
			}
		}	
	}
//	成绩	
	public int getScore() {
		return score;
	}
//	分子
	public int getNumerator() {
		return numerator;
	}
//	分母
	public int getDenominator() {
		return denominator;
	}
//将分数转化为double
	double toDouble(){
		return numerator/denominator;
	}
//	加法运算
	Fraction plus(Fraction r){
		int a=r.numerator;
		int b=r.denominator;
		int newNumerator=this.numerator*b+a*this.denominator;
		int newDenominator=this.denominator*b;
		return new Fraction(newNumerator, newDenominator);
	}
//	乘法运算
	Fraction multiply(Fraction r){
		int newNumerator=this.numerator*r.numerator;
		int newDenominator=this.denominator*r.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
//	用辗转相除法计算最大公约数
	int f(int a,int b){
		int c;
		Boolean flag=false;
//		定义被除数
		int d=0;
		while(!flag){
			c=a%b;
			a=b;b=c;
			if(b==0){
				flag=true;
				d=a;
			}
		}
		return d;
	}
//	打印
	void print(){
		int a=this.numerator;
		int b=this.denominator;
		if(a%b==0){
			System.out.println(a/b);
		}else{
			System.out.println(a+"/"+b);
		}
	}
}


