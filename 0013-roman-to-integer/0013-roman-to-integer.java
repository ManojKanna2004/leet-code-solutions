class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int count=0;
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for(int i = 0; i < s.length()-1; i++)
        {
            if(hm.get(s.charAt(i+1)) > hm.get(s.charAt(i)) )
            count -= hm.get(s.charAt(i));
            else 
            count += hm.get(s.charAt(i));
        }

        return count + hm.get(s.charAt(s.length() -1));
    }
}