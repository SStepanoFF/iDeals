# iDeals
Test Automation project for the tasks:
[UI Website](http://automationpractice.com/)
[API](https://reqres.in/)

#1. About

##1.1 Environment:
- Operation system: Windows, Mac OS, Linux //tested only on Mac OS
- Chrome browser version 84.0.4147.135
- FireFox browser version 76.0.1
- Java JDK 1.8 or higher

##1.2 Used tools:
- UI WebDriver - [Serenity](http://thucydides.info/docs/serenity-staging/#introduction), wrapper for Selenium WebDriver
- REST API - [RestAssured](http://rest-assured.io/)
- BDD approach - [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)
- Report - Serenity report
- [Lombok](https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok) - for reducing code

#2. How to setup and execute 

##2.1 Setup environment:
  - setup Java JDK 1.8 or later
  - setup Chrome/FireFox browser
  - Download project dependencies from build.gradle file
#3. How to execute tests

##3.1 Sequential tests execution
###3.1.1 All tests
`$ ./gradlew`
For the Chrome/Firefox browser need to set `-Dwebdriver.driver` property `chrome` or `firefox`.
If it's not set Chrome browser will be used by default

`$ ./gradlew -Dwebdriver.driver=chrome`

###3.1.2 Execute with special tags
It is possible to execute tests by tag ('@ui', '@api')
`$ ./gradlew -Dtags=@api`

##3.2 Parallel test execution
###3.2.1 All tests
`$ ./gradlew parallel`
For the Chrome/Firefox browser need to set `-Dwebdriver.driver` property `chrome` or `firefox`.
If it's not set Chrome browser will be used by default.
`$ ./gradlew parallel`

###3.2.2 Execute with special tags
`$ ./gradlew parallel -Dtags=@api -Dwebdriver.driver=firefox`

##3.3 Remote execution on Selenium Grid
###3.3.1 Selenium grid configuration
On the remote server have to run Selenium Grid hub and register nodes. Json configurations for the hub and node are in 'gridConfig' folder.

####3.3.1.1 Start Selenium grid hub
`$  java -jar ./gridConfig/selenium-server-standalone-3.141.59.jar -role hub -hubConfig hubConfig.json`

####3.3.1.2 Register Selenium grid nodes
`$  java -jar ./gridConfig/selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -nodeConfig nodeConfig.json`

###3.3.2 Serenity configuration
At the 'serenity.properties' set up `webdriver.remote.url`

###3.3.3 Execute
Execute with the same commands, but it will be use hud url and registered nodes for the test run.

##3.4 Remote execution on Jenkins
To execute tests on Jenkins have to set up a job with the same commands as for the local

#4. How it works:
- Gradle is a building tool
- `CucumberRunnerTest.class` runs cucumber features with serenity
- Serenity is responsible for the webbDriver and report generation. Serenity properties in `serenity.properties` file
- `/src/test/resources/features` - path to the feature files

#5. Tests Report
Test reports are generated to the `build/test-results`.

UI HTML Cucumber report is generated to `/build/test-results/cucumber-reports/html/cucumber-html-reports/overview-features.html`.

UI HTML Serenity report is generated automatically after sequential execution to `./build/reports/serenity-reports/index.html`.
Screenshots are generated for the Serenity report for  failed UI tests (configurable)
