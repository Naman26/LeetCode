class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < paths.size(); i++){
            hs.add(paths.get(i).get(0));
        }
        for(int i = 0; i < paths.size(); i++){
            if(!hs.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
            
        }
        return null; 
    }
}
