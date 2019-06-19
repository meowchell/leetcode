package solution.leetcode.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/**
 * Created by huijiej on 4/5/2017.
 */
public class collate {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(3);
        String a= collateList(10,aList );
        Logger.getLogger(collate.class.getName()).info(a);

    }

    private static String collateList(int fromFolder, ArrayList<Integer> homeFolderStructure) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = homeFolderStructure.iterator();
        while (it.hasNext()){
            Integer folder = it.next();
            sb.append(folder);
            if (it.hasNext()){
                sb.append(",");
            }
        }
        if (fromFolder > 0) {
            if (!homeFolderStructure.isEmpty()){
                sb.append(",");
            }
            sb.append(fromFolder);
        }
        return sb.toString();
    }
}

