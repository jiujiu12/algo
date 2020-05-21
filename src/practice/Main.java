package practice;

import java.util.Scanner;

/**
 * 
 * @author furry
 ���һ����ʾ��������Fraction�������������int���͵ı����ֱ��ʾ���Ӻͷ�ĸ��
�����Ĺ��캯���ǣ�

Fraction(int a, int b)

    ����һ��a/b�ķ�����

�����Ҫ�ṩ���µĹ��ܣ�
double toDouble();

    ������ת��Ϊdouble

Fraction plus(Fraction r);

    ���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���ע��Сѧ���꼶ѧ���������������ӵĹ���

Fraction multiply(Fraction r);

    ���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���

void print();

    ���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С����������1/1��Ӧ�����1�������Ӵ��ڷ�ĸʱ������Ҫ����������֣���31/30��һ����ȷ�������

ע�⣬�ڴ��������������Ӧ�û������Ϊ�����ʽ����2/4Ӧ�ñ�����Ϊ1/2��

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
//	�ɼ�
	private int score;
//	����
	private int numerator;
//	��ĸ
	private int denominator;
//	���캯��
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
//	�ɼ�	
	public int getScore() {
		return score;
	}
//	����
	public int getNumerator() {
		return numerator;
	}
//	��ĸ
	public int getDenominator() {
		return denominator;
	}
//������ת��Ϊdouble
	double toDouble(){
		return numerator/denominator;
	}
//	�ӷ�����
	Fraction plus(Fraction r){
		int a=r.numerator;
		int b=r.denominator;
		int newNumerator=this.numerator*b+a*this.denominator;
		int newDenominator=this.denominator*b;
		return new Fraction(newNumerator, newDenominator);
	}
//	�˷�����
	Fraction multiply(Fraction r){
		int newNumerator=this.numerator*r.numerator;
		int newDenominator=this.denominator*r.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
//	��շת������������Լ��
	int f(int a,int b){
		int c;
		Boolean flag=false;
//		���屻����
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
//	��ӡ
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


