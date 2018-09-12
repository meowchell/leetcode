package solution.leetcode.com;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by huijiej on 12/9/2016.
 */
public class FindItemFileInProcessFolder {
    ArrayList<String> workspacePaths = new ArrayList<>();
    public static void main(String[] args) {
        String workspaceDir = "C:\\Users\\huijiej\\Desktop\\talend\\workspace";
        String exportedDir = "C:\\Users\\huijiej\\Desktop\\talend\\Talend_jobs\\BULKUPLOAD";

        FindItemFileInProcessFolder e = new FindItemFileInProcessFolder();

      HashSet<String> itemfileset= e.printOriginalItems(exportedDir);
        HashSet<String> itemfileset1 = e.printWorkspaceItems(workspaceDir);
        for (String s:itemfileset1) {
            if (itemfileset.contains(s)){
                itemfileset.remove(s);
            }else {
                System.out.println("only exists in new workspace : "+s);
            }
        }

        for (String s:itemfileset) {
            System.out.println("not exists in new workspace : "+s);

        }

    }


    public HashSet<String> printOriginalItems(String exportedDir){
        int count = 0;
        HashSet<String> itemfileset = new HashSet<>();
        String processDir = findFolderNamedProcess(exportedDir);
        count+= findItemFiles(processDir, itemfileset);
        System.out.println(count);
        return itemfileset;
    }
    public HashSet<String> printWorkspaceItems(String workspaceDir){
        HashSet<String> itemfileset = new HashSet<>();
        int count = 0;
        findWorkspaceFolders(workspaceDir);
        for (String workspacepath:workspacePaths) {
//            System.out.println(workspacepath);
            String path = findFolderNamedProcess(workspacepath);
//            System.out.println(path);
            count+= findItemFiles(path, itemfileset);
//            System.out.println(count);
        }
        System.out.println(count);
        return itemfileset;
    }



    public void findWorkspaceFolders(String dir){

        File root = new File(dir);
        if (root.isDirectory()) {
            File[] files = root.listFiles();
            for (File f:files) {
                if (f.isDirectory()&&f.getName().endsWith("Workspace")){
                    workspacePaths.add(f.getAbsolutePath());

                }
            }

        }

    }




    public int findItemFiles(String dir, HashSet<String> itemfileset){
        File root = new File(dir);
        int count = 0;
        if (root.isDirectory()) {
            File[] files = root.listFiles();
            for (File f: files) {
              if (!f.isDirectory()){
                if (f.getAbsolutePath().endsWith(".item")){
//                    System.out.println(f.getName());
                    itemfileset.add(f.getName());
                    count++;
                }
              }else {
                  count += findItemFiles(f.getAbsolutePath(), itemfileset);
              }
            }
        }
        return count;

    }



    public String findFolderNamedProcess(String dir){
        String result = "";
        File root = new File(dir);
        if (root.isDirectory()){
            if ("process".compareTo(root.getName())==0) {
                return root.getAbsolutePath();
            }

            File[] files = root.listFiles();
            for (File f: files) {
                if (f.isDirectory()){
                    if ("process".compareTo(f.getName())==0){
                        result = f.getAbsolutePath();
                        break;
                    } else{
                        result = findFolderNamedProcess(f.getAbsolutePath());
                    }
                }
            }
        }
            return result;

    }


}
