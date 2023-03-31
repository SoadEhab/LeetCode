class Solution {
  public boolean isIsomorphic(String s, String t) {
        if(s.length()==t.length()){
            HashMap<Character,Character> smap = new HashMap<>();
            HashMap<Character,Character> tmap = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(smap.containsKey(s.charAt(i))){
                        if(!(smap.get(s.charAt(i))==t.charAt(i))){
                            return false;
                        }
                }
                else{
                    smap.put(s.charAt(i),t.charAt(i));
                }
            }
            for(int i=0;i<s.length();i++){
                if(tmap.containsKey(t.charAt(i))){
                        if(!(tmap.get(t.charAt(i))==s.charAt(i))){
                            return false;
                        }
                }
                else{
                    tmap.put(t.charAt(i),s.charAt(i));
                }
            }        
        }
        return true;
    }
}