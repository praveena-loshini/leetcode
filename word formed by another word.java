class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
List<Character> l= new ArrayList<>();
List<Character> l1= new ArrayList<>();
for(int i=0;i<ransomNote.length();i++){
    l.add(ransomNote.charAt(i));
}
for(int i=0;i<magazine.length();i++){
   l1.add(magazine.charAt(i));
}int c1=0;
for(char c:l){
    if(l1.contains(c)){
    c1++;  
    l1.remove(Character.valueOf(c));
    }
}if(c1==l.size()) return true;
        
        return false;
    }
}/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/
