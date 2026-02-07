class Solution {
    public int compareVersion(String version1, String version2) {
        //Time comp O(N+M+Z) Space O(N+M)
        // String[] v1 = version1.split("\\.");// \\ is used to separate out the char on the bases of .
        // String[] v2 = version2.split("\\.");

        // int n = Math.max(v1.length, v2.length);

        // for (int i = 0; i < n; i++) {
        //     int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
        //     int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

        //     if (num1 > num2) return 1;
        //     if (num1 < num2) return -1;
        // }

        // return 0;

        //Optimize approach

        int n1 = version1.length();
        int n2 = version2.length();

        int p1=0;
        int p2=0;

        while(p1<n1 || p2<n2){
            int num1=0;
            while(p1<n1 && version1.charAt(p1)!='.'){
                num1=num1*10+(version1.charAt(p1)-'0');
                p1++;
            }

             int num2=0;
            while(p2<n2 && version2.charAt(p2)!='.'){
                num2=num2*10+(version2.charAt(p2)-'0');
                p2++;
            }

            if(num1!=num2){
                return (num1>num2)?1:-1;
            }
            p1++;//Skip the dot in this case
            p2++;
        }
        return 0;
    }
}
