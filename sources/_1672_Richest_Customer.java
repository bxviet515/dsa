public class _1672_Richest_Customer {
    public static int maximumWealth(int[][] a) {
        
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int max = 0;

        for(int i = 0; i < soKhachHang; i++){
            int tongHangI = 0;
            for(int j =0; j < soNganHang; j++){
                tongHangI += a[i][j];
            }
            if(tongHangI > max){
                max = tongHangI;
            }
        }

        
        

        return max;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(a));
    }
}
