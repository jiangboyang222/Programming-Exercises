package Java03;

/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153 = 1的三次方＋5的三次方＋3的三次方。
 */
public class For01_NarcissisticNumber {

    public int onesDigit;      //个位数
    public int tensDigit;      //十位数
    public int hundredsDigit; //百位数

    public static void main(String[] args){
        For01_NarcissisticNumber f = new For01_NarcissisticNumber();

        f.getResult2();
    }

    //解法一

    //解法二
    public void getResult2(){
        for(int i = 100; i < 1000; i++){
            onesDigit = i % 10;
            tensDigit = i / 10 % 10;// i % 100 /10
            hundredsDigit = i / 100;
            if(i == onesDigit * onesDigit * onesDigit + tensDigit * tensDigit * tensDigit + hundredsDigit * hundredsDigit * hundredsDigit){
                System.out.println(i);
            }
        }
    }


    //解法三_Java8

    //解法四_多线程

}


