class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++){
            if (mode == 0){
                if ((code.charAt(i)!='1') && (i % 2 == 0)) {
                    // ret.append(code.charAt(i));String에는 .append()불가
                    ret += code.charAt(i);
                } else if (code.charAt(i) == '1'){	
                    mode = 1;
                }
            } else if (mode == 1){
                if ((code.charAt(i) != '1') && (i % 2 != 0)){
                    ret += code.charAt(i);
                } else if (code.charAt(i) == '1'){
                    mode = 0;
                }
            }
          }

        if (ret.equals("")){
            return "EMPTY";
        } else {
        return ret;
        }
    }
}