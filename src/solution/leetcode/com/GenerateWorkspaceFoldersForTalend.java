package solution.leetcode.com;

import java.io.File;

/**
 * Created by huijiej on 12/8/2016.
 */
public class GenerateWorkspaceFoldersForTalend {
    public static void main(String[] args) {
        GenerateWorkspaceFoldersForTalend s = new GenerateWorkspaceFoldersForTalend();
        s.helper();


    }

    public void helper(){
        String dir = "C:\\Users\\huijiej\\Desktop\\talend\\Talend_jobs\\BULKUPLOAD\\process\\hqr";
        String dir2 = "C:\\ProjectRepo\\git\\workspace\\";
        File folder = new File(dir);
        File[] folders = folder.listFiles();
        for (File file:folders){
            if (file.isDirectory()){
                String folderName = helper1(file.getName());
                System.out.println(folderName);
                File wpFolder = new File(dir2+folderName);
                wpFolder.mkdirs();
//                System.out.println(helper2(file.getName()));
            }


        }

    }
    public String helper1(String fileName){
        String folderName = "";
        String[] words = fileName.split("_");
        for (String word: words){
            folderName+=word.substring(0,1).toUpperCase()+word.substring(1);
        }
        folderName+="Workspace";
        return folderName;
    }

    public String helper2(String fileName){
        String folderName =fileName.replaceAll("_","").toUpperCase();
        return folderName;
    }

}
