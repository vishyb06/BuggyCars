
# BuggyCars Test automation  
This repository contains browser automation tests for the BuggyCars 5 features

## Tools and Frameworks:
1. Development IDE IntelliJ - V2020.3(Community Edition)
2. Test Automation tools - Selenium Webdriver with Cucumber and Junit


# BuggyCars Test automation  
This repository contains browser automation tests for the BuggyCars with 5 features

## Tools and Frameworks:
1. Development IDE IntelliJ - V2020.3(Community Edition)
2. Test Automation tools - Selenium Webdriver with Cucumber 
3. Framework Stye - POM (Page object modal)
4. Maven as build tool

## Framework features:
* Flexibility to configure test environment using build profiles
* Based on test environment specified in build profiles it will pick the environment and read reaspective properties files to fetch ulrs
* Fancy reporting using net.masterthought plugin
* Suppoert for multiple browsers and flxibility for extending it to cloud execution to e.g. Saucelabs, Bitbar etc. (This is work in progress)
* Support for multiple browsers and flxibility for extending it to cloud execution 


## Pre-requisite:
1. Maven - Development done with Apache Maven V3.6.3
2. Java  - Development done with Java 1.8.0_261
3. Preferred platform - Windows (Provision has been added for mac os but it is work in progress)

## Setup for execution
1. Install Java (*JDK 1.8*) and add JAVA_HOME and add it to your windows environment variable (test your installation using `java -version` command)
2. Install maven locally and add it your windows environment variable (test your installation using `mvn -version` command) - 
   Please refer this for [reference] (https://howtodoinjava.com/maven/how-to-install-maven-on-windows/)
3. Install any git tool of your choice and clone the repositort to your local machine using comman `git clone <clone url>` 
4. Execute maven command `mvn -Dcucumber.options="--tags <tagename>" clean test` (Use @KiwisaverCalculator in place of tagename) from command line e.g *GitBash*
5. On successful execution this should generate `/target` folder under your local project repository


## Development 
1. Clone code to your local using above instractions
2. Configure Maven, Jave and Git as per above instructions
3. Open proejct in IntelliJ IDE - This should resolve dependencies by iteself

### Notes:
1. Code is written and tested on Windows10 machine
2. Tested with chrome browser (Framework has provision for Edge and Firefox but testing needs to be done)


## Cucumber Reports
* In latest commit added support for cucumber reports
* This allows uploading reports directly to cucumber cloud


## 3 critical bugs
1. Unable to go Home page from Popular Make Page and also from 
2. Author column value is empty in the Popular Model page
3. Lancia Car model details missing when click on Lancia from overall rating page

