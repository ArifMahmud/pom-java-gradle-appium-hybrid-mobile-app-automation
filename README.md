# pom-java-gradle-appium-hybrid-mobile-app-automation
Hybrid Mobile App automation with POM structure and using of Gradle/Java/TestNG. Most importantly, added singleton structure to handle a single driver throughout the test process.

# Prerequisites
* JDK `8` or higher
* Gradle use `4.0.1`
* Selenium-firefox-driver `3.5` or higher
* Appium `V1.8.0` or higher
* Firefox version `64.0`

### How to run test and check the test report
1. After cloning the project, go to the directory `".\pom-java-gradle-appium-hybrid-mobile-app-automation`
2. Start Appium server
3. Connect your device with your machine thru USB cable
4. Build the automation project with gradle.

### Building with Gradle
```sh
$ gradle clean test
```
Downloaded files (including the Gradle distribution itself) will be stored in the Gradle user home directory (typically `user_home/.gradle`).
