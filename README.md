# Serenity JUnit Starter project


This is the simplest possible build script setup for Serenity BDD using Java. 

This is a very minimal sample project using JUnit and Serenity BDD in Java. 
You can use this project as a quick starting point for your own projects.

## Get the code

Git:

    git clone https://github.com/raj-fords/serenity-junit-starter.git
    cd serenity-junit-starter


Or simply [download a zip](https://github.com/raj-fords/serenity-junit-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify -DtestENV=INTEGRATION -DappName=TEST-APP

## Use Gradle

Open a command window and run:

    gradlew test 


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

