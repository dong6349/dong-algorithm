package com.base.algorithm;

/**
 * Created by yuxin on 2016/7/11.
 */
public class InsertionSort<T extends  Comparable<T>> {

    public static<T extends Comparable<T>> T[] sort(T[] unsorted){

        for(int i = 1; i < unsorted.length; i++){
            swap(i, unsorted);
        }

        return unsorted;
    }

    public static<T extends Comparable<T>> void swap(int index, T[] unsorted){
        for(int j = index; j > 0; j--){
            T value = unsorted[j];
            if(unsorted[j].compareTo(unsorted[j - 1]) < 0){
                unsorted[j] = unsorted[j - 1];
                unsorted[j - 1] = value;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args){
        Integer[]  a = new Integer[] {2,12,3,8,1,79,5};
        a = InsertionSort.sort(a.clone());
        for(Integer value : a){
            System.out.println(String.valueOf(value));
        }
    }
}
