package uk.ac.kcl.inf.mdd.project.githubaction.xpect;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File; 

public class GeneratorClass{

     public static void main(String []args){
        String parsedData  = "name: Feature Branch\r\n"
        		+ "\r\n"
        		+ "on:\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "	push:\r\n"
        		+ " 	branchesIgnore: master\r\n"
        		+ "jobs:\r\n"
        		+ "	test:\r\n"
        		+ "		name: Unit Test\r\n"
        		+ "	runsOn: ubuntu-18.04\r\n"
        		+ "	steps:\r\n"
        		+ "		- uses: actions/checkout@v1\r\n"
        		+ "\r\n"
        		+ "		- name: Set up JDK 11\r\n"
        		+ "		uses: actions/setup-java@v1\r\n"
        		+ "\r\n"
        		+ "		with:\r\n"
        		+ "	java-version:1.11\r\n"
        		+ "		- name: Maven Package\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean package -DskipTests \r\n"
        		+ "		- name: Maven Verify\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean verify \r\n"
        		+ "\r\n"
        		+ "name: Master Branch\r\n"
        		+ "\r\n"
        		+ "on:\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "	push:\r\n"
        		+ "	branches: [master]\r\n"
        		+ "jobs:\r\n"
        		+ "	test:\r\n"
        		+ "		name: Test - Units & Integrations\r\n"
        		+ "	runsOn: ubuntu-18.04\r\n"
        		+ "	steps:\r\n"
        		+ "		- uses: actions/checkout@v1\r\n"
        		+ "\r\n"
        		+ "		- uses: actions/setup-java@v1\r\n"
        		+ "\r\n"
        		+ "		with:\r\n"
        		+ "	java-version:11.0.4\r\n"
        		+ "		- name: Maven Package\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean package -DskipTests \r\n"
        		+ "		- name: Maven Verify\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean verify -Pintegration-test \r\n"
        		+ "	sonar:\r\n"
        		+ "		name: Test - SonarCloud Scan\r\n"
        		+ "	runsOn: ubuntu-18.04\r\n"
        		+ "	steps:\r\n"
        		+ "		- uses: actions/checkout@v1\r\n"
        		+ "\r\n"
        		+ "		- name: Set up JDK 11\r\n"
        		+ "		uses: actions/setup-java@v1\r\n"
        		+ "\r\n"
        		+ "		with:\r\n"
        		+ "	java-version:11.0.4\r\n"
        		+ "		- name: SonarCloudScan\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean verify -Psonar -Dsonar.login=${{ secrets.SONAR_TOKEN }} \r\n"
        		+ "		env: GITHUB_TOKEN:${{ secrets.GITHUB_TOKEN }}\r\n"
        		+ "	artifact:\r\n"
        		+ "		name: Publish - GitHub Packages\r\n"
        		+ "	runsOn: ubuntu-18.04\r\n"
        		+ "	needs: [name:, sona]\r\n"
        		+ "	steps:\r\n"
        		+ "		- uses: actions/checkout@v1\r\n"
        		+ "\r\n"
        		+ "		- name: Set up JDK 11\r\n"
        		+ "		uses: actions/setup-java@v1\r\n"
        		+ "\r\n"
        		+ "		with:\r\n"
        		+ "	java-version:11.0.4\r\n"
        		+ "		- name: Publish artifact on GitHub Packages\r\n"
        		+ "\r\n"
        		+ "		run:  mvn -B clean deploy -DskipTests \r\n"
        		+ "		env: GITHUB_TOKEN:${{ secrets.GITHUB_TOKEN }}\r\n"
        		+ "	docker:\r\n"
        		+ "		name: Publish - Docker Hub\r\n"
        		+ "	runsOn: ubuntu-18.04\r\n"
        		+ "	needs: [name:, sona]\r\n"
        		+ "		env:\r\n"
        		+ "		REPO: ${{ secrets.DOCKER_REPO }}\r\n"
        		+ "	steps:\r\n"
        		+ "		- uses: actions/checkout@v1\r\n"
        		+ "\r\n"
        		+ "		- name: Set up JDK 11\r\n"
        		+ "		uses: Set up JDK 11\r\n"
        		+ "\r\n"
        		+ "		with:\r\n"
        		+ "	java-version:11.0.4\r\n"
        		+ "		- name: Login to Docker Hub\r\n"
        		+ "\r\n"
        		+ "		run:  docker login -u ${{ secrets.DOCKER_USER }} -p ${{ secrets.DOCKER_PASS }} \r\n"
        		+ "		- name: Build Docker image\r\n"
        		+ "\r\n"
        		+ "		run:  docker build -t $REPO:latest -t $REPO:${GITHUB_SHA::8} . \r\n"
        		+ "		- name: Publish Docker image\r\n"
        		+ "\r\n"
        		+ "		run:  docker push $REPO \r\n"
        		+ "";
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
          System.out.println("Successfully created yaml files");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
   }

}