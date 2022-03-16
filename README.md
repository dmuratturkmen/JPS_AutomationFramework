# Cucumber Automation Framework
A sample Cucumber BDD automation framework with Java and Selenium Webdriver which is based on Page Object Model that creates and deletes user on http://www.way2automation.com/angularjs-protractor/webtables/

## Framework set up
Clone repository from [here](https://github.com/dmuratturkmen/JPS_AutomationFramework.git) or download zip and set it up in your local workspace.
## The Structure Overview

### pom.xml:
```pom.xml```
A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project. The project dependencies, plugins are stored here.    
```script
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.JPS</groupId>
    <artifactId>JPS_AutomationFramework</artifactId>
    <version>1.0-SNAPSHOT</version>
```
#
#### Configuration properties:
```
configuration.properties
```
Re-usable and sensitive data like ```browser```, ```urls```, ```user credentials``` are stored here.    
```script
browser=chrome
url=https://www.way2automation.com/angularjs-protractor/webtables/
```
#
#### Features package:
```
src/test/resources/features
```
Stores feature files where Test Scenarios are created in plain English using Gherkin language with keywords such as ```Feature```, ```Scenario```, ```Given```, ```When```, ```Then``` etc.
Tags used in the feature file helps to specify the flow and run order.
# ![featurescr](https://user-images.githubusercontent.com/96667168/158705179-725ab69d-0944-4f53-9759-a4af2bebcb00.jpg)
#### Pages package:
```
src/test/java/com/JPS/pages
```
Inside of this package, we create pages for each feature separately and store locators related to those pages. In other words, it's an ```object repository``` that stores ```web elements```. 
# ![pagescr](https://user-images.githubusercontent.com/96667168/152035134-b963a036-fad8-4ebd-a321-cbcbf78c453d.png)


#### Steps package:
```
src/test/java/com/JPS/steps
```
Inside of this package we have step classes where we create scripts to automate Scenarios (feature files).    
# ![stepsscr](https://user-images.githubusercontent.com/96667168/152036582-fc4bade5-0854-4a88-85d8-d9a8ec0b97eb.png)

## How execute tests?
Through runner class.
```script
com/JPS/runner/Runner.java
```
Use runner class to trigger the framework. It is more like a starting point for the Junit to start executing tests through Junit ```@RunWith()``` annotation. ```@RunWith``` annotation tells JUnit that tests should run using Cucumber class present in ```'Cucumber.api.junit'``` package. Another important thing to mention is ```
  @CucumberOptions annotation```. This annotation tells Cucumber a lot of things like where to look for feature files, steps, what reporting system to use and other plugins like rerun for failed tests. Cucumber finds the Step Definition file with the help of the Glue code in Cucumber Options.
# ![runnerscr](https://user-images.githubusercontent.com/96667168/158706202-86cb1d08-5be0-445a-8e33-2449d3c751b9.jpg)
## Reports
The framework uses Cucumber Html Report which can be found under target folder. 
```script
target/cucumber-report.html
```
The report can be reached through this path:
```
target/target/cucumber-html-reports/overview-features.html
```
![scr1](https://user-images.githubusercontent.com/96667168/158706268-a771c296-3b4e-4f86-a4fd-8b5a46f3c23a.jpg) 
# ![scr2](https://user-images.githubusercontent.com/96667168/152039460-75ff532f-1e07-42f1-9467-6b0ae99fe205.png)
