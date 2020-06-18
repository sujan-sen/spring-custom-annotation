# spring-custom-annotation
 Demo project to show the usage of custom annotation to detect spring bean

 Summary: This project is used to demonstrate, the use of custom annotation to detect different spring bean implementation type.

 Purpose: The main reason for creating this project is to help users, who need to implement 2 different types of system to cater the project requirement.
 e.g. Here we have 2 different search engines(Google, Bing) which can be used based on user choice. The business logic for runnning Google Search Engine and Bing Search Engine will differ, hence there are 2 different types of Service Implementation classes. Similarly, user can annotate any subsequent classes as per requirement to get the respective variant using the utility method.

 Changes required to plugin new system: The following changes are required::
 	1. New Annotation.
 	2. New version of Service Impl for the new system.
 	3. Any other classes required specifically for the purpose should be annotated by the new Annotation.

 Running the project: It is a simple spring boot project just run it in any ide or create a jar using mvn build and then run using java -jar <path-name>\spring-custom-annotation-0.0.1-SNAPSHOT.jar

  Use browser to hit the URL as 
   1. http://localhost:8080/search?searchString=zoo&searchEngine=BING
   2. http://localhost:8080/search?searchString=zoo&searchEngine=GOOGLE

  Check the static string printed. 
