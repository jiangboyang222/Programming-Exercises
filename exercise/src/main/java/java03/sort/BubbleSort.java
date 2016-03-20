package java03.sort;

/**
 * 冒泡排序
 * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 3. 针对所有的元素重复以上的步骤，除了最后一个。
 * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *
 * 参考网址：http://www.cnblogs.com/kkun/archive/2011/11/23/2260280.html
 */
public class BubbleSort {

    //定义数组
    public int[] nums = {6, 2, 4, 1, 5, 9};

    //输出数组
    public void outPut(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    //解法一
    //从小至大排序
    public int[] bubbleSort(int[] nums){
        int length = nums.length;
        int temp;
        for(int i = 0; i < length; i++){//比较的回数
            for(int j = 0; j < length - 1 - i; j++){//两个数比较的次数 = 数据长度 - 1，但是每次比较后确定的数值则无需再比较 ，所以 - i
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){

        BubbleSort bs = new BubbleSort();
        bs.outPut(bs.bubbleSort(bs.nums));
    }
}
