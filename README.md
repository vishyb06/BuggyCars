# BuggyCars Test automation  
This repository contains browser automation test for the BuggyCarsRating feature file with 5 scenarios

## Tools and Frameworks:
1. Development IDE IntelliJ - V2020.3(Community Edition)
2. Test Automation tools - Selenium Webdriver with Cucumber and Junit

## Tools and Frameworks:
1. Development IDE IntelliJ - V2020.3(Community Edition)
2. Test Automation tools - Selenium Webdriver with Cucumber 
3. Framework Style - POM (Page object modal)
4. Maven as build tool

## Framework features:
* Flexibility to configure test environment using build profiles
* Based on test environment specified in build profiles it will pick the environment and read respective properties files to fetch ulrs
* Support for multiple browsers and flexibility for extending it to cloud execution to e.g. Saucelabs, Bitbar etc. (This is work in progress)
* Support for multiple browsers and flexibility for extending it to cloud execution 


## Pre-requisite:
1. Maven - Development done with Apache Maven V3.6.3
2. Java  - Development done with Java 1.8.0_261
3. Preferred platforms - Windows (Provision has been added for mac os but it is work in progress)

## Setup for execution
1. Install Java (*JDK 1.8*) and add JAVA_HOME and add it to your windows environment variable (test your installation using `java -version` command)
2. Install maven locally and add it your windows environment variable (test your installation using `mvn -version` command) - 
   Please refer this for [reference] (https://howtodoinjava.com/maven/how-to-install-maven-on-windows/)
3. Install any git tool of your choice and clone the repository to your local machine using comman `git clone <clone url>` 
4. Execute maven command `mvn -Dcucumber.options="--tags <tagename>" clean test` (Use @BuggyCarsRatingTest in place of tag name) from command line e.g *GitBash*
5. On successful execution this should generate `/target` folder under your local project repository
   e.g. mvn test -Dcucumber.option="--tags @BuggyCarsRatingTest"
6. Check \target\site\cucumber-reports\cucumber-html-reports folder for cucumber reports

## Development 
1. Clone code to your local using above instructions
2. Configure Maven, Java and Git as per above instructions
3. Open project in IntelliJ IDE - This should resolve dependencies by itself

### Notes:
1. Code is written and tested on Windows10 machine
2. Tested with Chrome browser (Framework has provision for Edge and Firefox but testing needs to be done)


## 3 critical bugs
1. Unable to go Home Page from Popular Make Page 
2. Author column value is empty in the Popular Model page
3. Lancia Car model details missing when click on Lancia from overall rating page

