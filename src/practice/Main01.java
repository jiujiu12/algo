package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Main01{
		public  static void main(String[] args)  
	    {  
	        //初始化一个Kmean对象，将k置为3
			int num;
			System.out.println("输入要分为的类数：");			
			num=(new Scanner(System.in)).nextInt();
	        KMeansClustering k=new KMeansClustering(num);  
	        ArrayList<float[]> dataSet=new ArrayList<float[]>();  
	        ReadData rd=new ReadData();
	        String fileName="./src/practice/data/11.txt";
			dataSet=rd.read(fileName);
	        //设置原始数据集  
	        k.setDataSet(dataSet);  
	        //执行算法  
	        k.kmeans();
	        //得到聚类结果  
	        ArrayList<ArrayList<float[]>> cluster=k.getCluster();  
	        //查看结果  
	        for(int i=0;i<cluster.size();i++)  
	        {  
	            k.printDataArray(cluster.get(i), "cluster["+i+"]");  
	        }    
	    }  
	}
