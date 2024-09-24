Api testing with Serenity Restassured with Junit5


To run this project 'Java 17 is required'
Start application java -jar studentApp.jar

Tests can be run on different environments by passing command line  arguments : mvn verify -Denvironment="your env" provided in serenity.conf

To run test with a given tag
mvn clean verify -Dtags=pttest

Tu run tests in parallel update property in pom.xml under maven-failsafe-plugin
junit.jupiter.execution.parallel.enabled=true