package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Main01{
		public  static void main(String[] args)  
	    {  
	        //��ʼ��һ��Kmean���󣬽�k��Ϊ3
			int num;
			System.out.println("����Ҫ��Ϊ��������");			
			num=(new Scanner(System.in)).nextInt();
	        KMeansClustering k=new KMeansClustering(num);  
	        ArrayList<float[]> dataSet=new ArrayList<float[]>();  
	        ReadData rd=new ReadData();
	        String fileName="./src/practice/data/11.txt";
			dataSet=rd.read(fileName);
	        //����ԭʼ���ݼ�  
	        k.setDataSet(dataSet);  
	        //ִ���㷨  
	        k.kmeans();
	        //�õ�������  
	        ArrayList<ArrayList<float[]>> cluster=k.getCluster();  
	        //�鿴���  
	        for(int i=0;i<cluster.size();i++)  
	        {  
	            k.printDataArray(cluster.get(i), "cluster["+i+"]");  
	        }    
	    }  
	}
