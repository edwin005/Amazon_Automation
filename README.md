# Amazon Automation Project

## About
This project is to test the Amazon web page. The test report tool used
is Allure report. For static code analysis I'll be using Sonarlint.

The design pattern used is Page Object Model.

This framework contains a class called RepetitiveActions. This class has a singleton
pattern to make sure only one instance of the class is created during a run. This class
is built with a set of methods that are frequently used. 

Each method has a try-catch statement to get more details when an exception is thrown. Some methods
have an implicit wait to make sure the element is interactable before performing an action on it.

The driver is implemented in such a way that it can be accessed from anywhere in the project.
However, the driver is passed from class to class.

## Tech Stack

- Java.
- Selenium WebDriver.
- TestNG
- SonarLint
- Allure report.
- Apache POI
- Maven Surefire Plugin
- Aspectj

### Prerequisites
- You need to have java installed. For this project you will need the Java Runtime Environment
(JRE) and the Java Development Kit (JDK).

  - Please, visit [https://www.java.com/en/download/help/download_options.html] for
instructions.

  - Please, visit [https://www.oracle.com/java/technologies/downloads/] to download a JDK.
I would recommend the version 8 or 11.

- Install Maven.
  - On Windows [https://phoenixnap.com/kb/install-maven-windows]
  - On Mac OS [https://www.digitalocean.com/community/tutorials/install-maven-mac-os]
  
### Installation

Clone the repository from Github.
git clone https://github.com/edwin005/Amazon_Automation.git  

Install all packages and dependencies for the project.
- Go to the file pom.xml and reload all maven projects.

The credentials being used are:
{
"email": "",
"pass": ""
}
