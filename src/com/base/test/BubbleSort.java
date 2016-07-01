package com.base.test;

/**
 * Created by yuxin on 2016/7/1.
 */
public class BubbleSort<T extends Comparable<T>> {

    public static<T extends  Comparable<T>> T[] sort(T[] unsorted){
        boolean isSort = true;
        int length = unsorted.length;
        while(isSort){
            isSort = false;
            for(int i = 1; i < length; i++){
                if(unsorted[i].compareTo(unsorted[i - 1]) < 0){
                    isSort = true;
                    swap(unsorted, i, i - 1);
                }
            }
        }
        return unsorted;
    }

    public static<T extends Comparable<T>> void swap(T[] unsorted, int index1, int index2){
        T value = unsorted[index1];
        unsorted[index1] = unsorted[index2];
        unsorted[index2] = value;
    }

    public static void main(String[] args){
        Integer[] a = new Integer[]{2,12,3,8,1,79,5};
        a = BubbleSort.sort(a.clone());
        for(int i = 0; i < a.length; i++){
            System.out.println(String.valueOf(a[i]));
        }
    }
}
