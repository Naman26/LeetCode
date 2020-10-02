class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitStr = s.split("\\s+");
        if(splitStr.length > 0)
        return ((splitStr[splitStr.length-1]).length());
        return 0;
    }
}