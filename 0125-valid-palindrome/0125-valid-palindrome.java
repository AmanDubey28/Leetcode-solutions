class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);

        if(!isValid(ch1)){ i++; continue; }
        if(!isValid(ch2)) {j--; continue;}

        if(ch1>='A' && ch1<='Z') {ch1+=32;}
        if(ch2>='A' && ch2<='Z') {ch2+=32;}

        if(ch1!=ch2){
            return false; 
        }

            i++; 
            j--;
        
        }
        return true;   
    }
    static boolean isValid(char c){
        return (c>='A' && c<='Z') ||
                (c>='a' && c<='z') ||
                (c>='0' && c<='9');
    }
}