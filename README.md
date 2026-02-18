Registration Automation Test

This project automates the user registration for the Jack Entertainment staging site (https://jackentertainment.lv-stg.gameaccount.com) 
using Selenium WebDriver and TestNG.

The automation validates successful registration of a new user.

Before running the tests, ensure the following are installed:

Java JDK 24 
Maven 
Chrome browser (latest version)
IDE: IntelliJ IDEA
TestNG plugin 

Project Structure
registration-automation/
│
├── src/main/java/test/Registration.java  # Main test class for registration
├── pom.xml                               # Maven dependencies (if used)
└── README.md                             # Project documentation

Technology Stack:

Java 
Selenium WebDriver – Browser automation
TestNG – Test framework
ChromeDriver – Browser driver for Chrome
Maven 

Test execution quide:

Open Registration.java.
Right-click the file and select Run 'Registration'.
Observe the browser opening, registration, and form submission.
The browser closes automatically after the test completes.

Design Patterns Used:

Page Object Model (POM) – Partial: Encapsulated cookie acceptance as a method for reusability.
Explicit Waits: Ensures stability by waiting for elements to become interactable.
TestNG Annotations: @BeforeMethod, @Test, and @AfterMethod manage test setup and teardown.

