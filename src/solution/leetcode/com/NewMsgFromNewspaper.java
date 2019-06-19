package solution.leetcode.com;

/**
 * Created by huijiej on 4/25/2018.
 */
public class NewMsgFromNewspaper {
    public static void main(String[] args) {
//        Example:
//“HELLO WORLD” is the newspaper text
//        From this, you can form: [“LOW”, “DOLL”]
//        But you can’t form: [“WOOD”, “LORD”]

        NewMsgFromNewspaper n = new NewMsgFromNewspaper();
        System.out.println(n.canFormNewMessage("HELLO WORLD", new String[]{"LOWC", "DOLL"}));

    }
    public boolean canFormNewMessage(String newpaper, String[] newMsg){
        int[] count = new int[26];
        char[] cs = newpaper.toCharArray();
        for(int i= 0; i < cs.length; i++){
            if(cs[i]==' '){continue;}
            count[cs[i]-'A']++;
        }

        for(int i = 0; i < newMsg.length; i++){
            char[] msgcs = newMsg[i].toCharArray();
            for(int j= 0; j < msgcs .length; j++){
                if(count[msgcs[j] -'A']==0){
                    return false;
                }else{
                    count[msgcs[j] -'A']--;
                }
            }
        }


        return true;

    }

}
