package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,5,6};
        int target = 4;
        int index =0;
        System.out.println(search(arr,target,index));
        System.out.println(searchIndex(arr,target,index));
        searchIndexArray(arr,target,index);
        System.out.println(list);
        System.out.println(searchIndexArrayR(arr,target,index,new ArrayList()));
        System.out.println(searchIndexArrayList(arr,target,index));


    }
    static boolean search(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index]==target) || search(arr,target,index+1);
    }
    static int searchIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchIndex(arr,target,index+1);
    }
    static ArrayList list = new ArrayList();
    static void searchIndexArray(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        searchIndexArray(arr,target,index+1);
    }
    static ArrayList searchIndexArrayR(int[] arr, int target, int index,ArrayList list1){
        if(index == arr.length){
            return list1;
        }
        if(arr[index]==target){
            list1.add(index);
        }
        searchIndexArrayR(arr,target,index+1,list1);
        return list1;
    }

    static ArrayList searchIndexArrayList(int[] arr, int target, int index){
        ArrayList list = new ArrayList();
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList answerFromBelow = searchIndexArrayList(arr,target,index+1);
        list.addAll(answerFromBelow);
        return list;
    }
}
