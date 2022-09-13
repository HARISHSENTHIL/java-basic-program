package com.exercise;

class test
{
	void show(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
}
	
	public class arraymethod{
		public static void main(String[]arg) {
			int arr[]= {1,2,3,4,5};
			test obj = new test();
			obj.show(arr);

	}

}
