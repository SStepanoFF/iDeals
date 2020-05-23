# Propine
Test Automation project for [Date Converter](https://vast-dawn-73245.herokuapp.com/)

#1. About

##1.1 Environment:
- Operation system: Windows, Mac OS, Linux //tested only on Mac OS
- Chrome browser version 83.0.4103.39
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
  - setup Java JDK
  - setup Chrome/FireFox browser
  - Download project dependencies from build.gradle file
#2. How to execute tests

##2.1 Execute for the Chrome/Firefox browser 
Set `-Dwebdriver.driver` property `chrome` or `firefox`
`$ ./gradlew -Dwebdriver.driver=chrome`

##2.2 Execute with special tags
It is possible to execute tests by tag ('ui', 'api')
`$ ./gradlew -Dtags=api`

#3. How it works:
- Gradle is a building tool
- `CucumberRunnerTest.class` runs cucumber features with serenity
- Serenity is responsible for the webbDriver and report generation. Serenity properties in `serenity.properties` file
- `/src/test/resources/features` - feature files with tests folder

#4. Report
UI HTML report is generates automatically after run to `/build/reports/serenity-reports/index.html`
