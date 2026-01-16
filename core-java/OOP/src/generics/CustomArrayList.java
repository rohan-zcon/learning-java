package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int pointer = 0;

    private boolean isFull(){
        return this.pointer == DEFAULT_SIZE;
    }

    private int getCurrentSize(){
        return this.pointer;
    }

//    copies the existing data into a new array of double the size of prev arr ay
    private void resize(){
        int[] temp = new int[DEFAULT_SIZE*2];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private StringBuilder truncate(){
        int currentSize = getCurrentSize();
//        int[] temp = new int[currentSize];
//        for (int i = 0; i < currentSize; i++) {
//            temp[i] = data[i];
//        }
//        return Arrays.toString(temp);

        StringBuilder sb = new StringBuilder();

        if(currentSize == 0){
            sb.append('[');
            sb.append(']');
            return sb;
        } else{
            int i = 0;
            sb.append('[');
            while(true){
                sb.append(this.data[i]);
                if(i == currentSize-1){
                    sb.append(']');
                    return sb;
                }
                sb.append(", ");
                i++;
            }
        }

    }


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
//        check if existing array is full
        if(isFull()){
            resize();
        }
//        add the ele
        data[pointer] = num;
        this.pointer += 1;
    }

    public int remove(){
        int removedEle = this.data[pointer--];
        return removedEle;
    }

    public int get(int index){
        return  this.data[index];
    }

    public int size(){
        return pointer--;
    }

    public boolean set(int index, int value){
        this.data[index] = value;
        return true;
    }

    @Override
    public String toString() {
        return "CustomArrayList{ " +
                "data: " + truncate() +
                ", size: " + getCurrentSize() +
                '}';
    }
}

