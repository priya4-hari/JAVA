class Solution {
    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String st = sb.toString();
        if(str.equals(st))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
