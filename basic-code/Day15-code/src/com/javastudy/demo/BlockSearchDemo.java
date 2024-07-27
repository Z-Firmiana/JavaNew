package com.javastudy.demo;

public class BlockSearchDemo {
    public static void main(String[] args) {
        /*
        分块查找
        核心思想：块内无序，块间有序
        实现步骤：
        1.创建数组blockArr存放每一个块对象的信息
        2.先查找blockArr确定要查找的数据属于哪一块
        3.再单独遍历这一块数据即可
         */

        int[] arr = {
                27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};
        Block block1 = new Block(22, 40, 0, 4);
        Block block2 = new Block(13, 20, 5, 8);
        Block block3 = new Block(7, 10, 9, 10);
        Block block4 = new Block(43, 50, 11, 13);
        Block[] blockArr = {block1, block2, block3, block4};
        int number = 5022;
        int index = getIndex(blockArr, arr, number);
        System.out.println("index = " + index);

    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1) {
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax() && number >= blockArr[i].getMin()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
