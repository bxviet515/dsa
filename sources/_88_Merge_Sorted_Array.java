public class _88_Merge_Sorted_Array {

    public static void merge(int[] n1, int m,  int[] n2, int n){
        for(int ai : n2){
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }
    }
    public static void chenPhanTuVaoMang(int x, int[] a, int m){
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if(a[k] > x){
                timDuocK = true;
                for (int i = m-1; i >= k; i--) {
                    a[i+1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if(timDuocK == false){
            a[m] = x;
        }
    }

    public static void merge2(int[] n1, int m,  int[] n2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(k >= 0){
            if(j < 0){
                n1[k] = n1[i];
                i--;
            }else if(i < 0){
                n1[k] = n2[j];
                j--;
            }else if(n1[i] > n2[j]){
                n1[k] = n1[i];
                i--;
            }else{
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }
     public static void main(String[] args) {
        int[] n1= {2 , 3, 4, 0, 0, 0};
        int[] n2 = {0, 3, 6};
        merge2(n1, 3, n2, 3);
        for(int x : n1){
            System.out.println(x);
        }
     }
}