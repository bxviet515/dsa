public class _1295_Find_Number_with{
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int a: nums){
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int tinhSoChuSo(int a){
        int count = 0;
        int kq = a;
        while(kq != 0){
            kq = a / 10;
            a = kq;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1, 12, 321, 1998};
        System.out.println(findNumbers(nums));
    }
}