package uk.ac.kcl.inf.mdd.project.githubaction.xpect;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File; 

public class GeneratorClass{

     public static void main(String []args){
        String parsedData  = "";
        generateYamlFiles(parsedData);
     }
     
     public static void generateYamlFiles(String parsedData){
         if (parsedData.contains("branchesIgnore: master")){
             //generate feature and master file
             createAndWriteFile(parsedData.substring(0,parsedData.indexOf("name: Master Branch")-1),"featureBranch.yaml");
         }
          createAndWriteFile(parsedData.substring(parsedData.indexOf("name: Master Branch")),"MasterBranch.yaml");
  
     }
     
    public static void createAndWriteFile(String confData, String filename){
        try {
          File fileObj = new File("./../"+filename); // use 'backslash' for win and '/' unix-like os
          FileWriter myWriter = new FileWriter(fileObj);
          myWriter.write(confData);
          myWriter.close();
          System.out.println("Successfully created yaml file: "+filename);
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
   }

}