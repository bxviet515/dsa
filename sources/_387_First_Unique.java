    public class _387_First_Unique {
        public static  int firstUniqChar(String s){
            char[] s1 = s.toCharArray();
            int[] count = new int[123];

            for (int i = 0; i < s1.length; i++) {
                char c = s1[i];
                int index = (int) c;
                count[index]++;
            }

            for (int i = 0; i < s1.length; i++) {
                char c = s1[i];
                int index = (int)c;
                if(count[index] == 1){
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            String s = "aabb";
            System.out.println(firstUniqChar(s));
        }
    }
