package java03.sort;

/**
 * ð������
 * 1. �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 * 2. ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
 * 3. ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * 4. ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
 *
 * �ο���ַ��http://www.cnblogs.com/kkun/archive/2011/11/23/2260280.html
 */
public class BubbleSort {

    //��������
    public int[] nums = {6, 2, 4, 1, 5, 9};

    //�������
    public void outPut(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    //�ⷨһ
    //��С��������
    public int[] bubbleSort(int[] nums){
        int length = nums.length;
        int temp;
        for(int i = 0; i < length; i++){//�ȽϵĻ���
            for(int j = 0; j < length - 1 - i; j++){//�������ȽϵĴ��� = ���ݳ��� - 1������ÿ�αȽϺ�ȷ������ֵ�������ٱȽ� ������ - i
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
