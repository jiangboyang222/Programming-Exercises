package Java03;

/**
 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153 = 1�����η���5�����η���3�����η���
 */
public class For01_NarcissisticNumber {

    public int onesDigit;      //��λ��
    public int tensDigit;      //ʮλ��
    public int hundredsDigit; //��λ��

    public static void main(String[] args){
        For01_NarcissisticNumber f = new For01_NarcissisticNumber();

        f.getResult2();
    }

    //�ⷨһ

    //�ⷨ��
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


    //�ⷨ��_Java8

    //�ⷨ��_���߳�

}


