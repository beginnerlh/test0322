
/*
 * �����������飬��дһ���������������ǵĽ�����

ʾ�� 1:

����: nums1 = [1,2,2,1], nums2 = [2,2]
���: [2]
ʾ�� 2:

����: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
���: [9,4]
*/
package lianxi0322;

import java.util.Arrays;

public class test0322 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] nums1 = new int[] { 4, 9, 5};
		int[] nums2 = new int[] { 9, 4, 9, 8};
		int[] a = S.intersection(nums1, nums2);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
class Solution{
	 public int[] intersection(int[] nums1, int[] nums2) {
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 int[] num = new int[] {};
		 for(int i = 0; i < nums1.length; i++) {
			 if(i == nums1.length - 1 || nums1[i] < nums1[i+1]) {
				 //ֻ�к�һλ��������ǰһλ�Ĳſ��Ի��������һλ��
				 for(int j = 0; j < nums2.length; j++) {
					 if(nums1[i] == nums2[j]) {
						 num = Arrays.copyOf(num, num.length+1);//��������
						 num[num.length-1] = nums1[i];
						 break;
					 }
				 }
			 }
		 }
		 return num;
	 }
}
