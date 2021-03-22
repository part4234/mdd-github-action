import java.io.FileWriter;
import java.io.IOException;
import java.io.File; 

public class TestGithubAction {

     public static void main(String []args){
        String parsedData  = """name: Feature Branch
        
        on:
        
        
        	push:
         	branchesIgnore: master
        jobs:
        	test:
        		name: Unit Test
        	runsOn: ubuntu-18.04
        	steps:
        		- uses: actions/checkout@v1
        
        		- name: Set up JDK 11
        		uses: actions/setup-java@v1
        
        		with:
        	java-version:1.11
        		- name: Maven Package
        
        		run:  mvn -B clean package -DskipTests 
        		- name: Maven Verify
        
        		run:  mvn -B clean verify 
        
        name: Master Branch
        
        on:
        
        
        	push:
        	branches: [master]
        jobs:
        	test:
        		name: Test - Units & Integrations
        	runsOn: ubuntu-18.04
        	steps:
        		- uses: actions/checkout@v1
        
        		- uses: actions/setup-java@v1
        
        		with:
        	java-version:11.0.4
        		- name: Maven Package
        
        		run:  mvn -B clean package -DskipTests 
        		- name: Maven Verify
        
        		run:  mvn -B clean verify -Pintegration-test 
        	sonar:
        		name: Test - SonarCloud Scan
        	runsOn: ubuntu-18.04
        	steps:
        		- uses: actions/checkout@v1
        
        		- name: Set up JDK 11
        		uses: actions/setup-java@v1
        
        		with:
        	java-version:11.0.4
        		- name: SonarCloudScan
        
        		run:  mvn -B clean verify -Psonar -Dsonar.login=${{ secrets.SONAR_TOKEN }} 
        		env: GITHUB_TOKEN:${{ secrets.GITHUB_TOKEN }}
        	artifact:
        		name: Publish - GitHub Packages
        	runsOn: ubuntu-18.04
        	needs: [name:, sonar]
        	steps:
        		- uses: actions/checkout@v1
        
        		- name: Set up JDK 11
        		uses: actions/setup-java@v1
        
        		with:
        	java-version:11.0.4
        		- name: Publish artifact on GitHub Packages
        
        		run:  mvn -B clean deploy -DskipTests 
        		env: GITHUB_TOKEN:${{ secrets.GITHUB_TOKEN }}
        	docker:
        		name: Publish - Docker Hub
        	runsOn: ubuntu-18.04
        	needs: [name:, sonar]
        		env:
        		REPO: ${{ secrets.DOCKER_REPO }}
        	steps:
        		- uses: actions/checkout@v1
        
        		- name: Set up JDK 11
        		uses: Set up JDK 11
        
        		with:
        	java-version:11.0.4
        		- name: Login to Docker Hub
        
        		run:  docker login -u ${{ secrets.DOCKER_USER }} -p ${{ secrets.DOCKER_PASS }} 
        		- name: Build Docker image
        
        		run:  docker build -t $REPO:latest -t $REPO:${GITHUB_SHA::8} . 
        		- name: Publish Docker image
        
        		run:  docker push $REPO 
        """;
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
