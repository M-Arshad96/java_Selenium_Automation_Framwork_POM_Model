🧪 PageObjectModel – Selenium Test Automation Framework
This project is a Java-based Selenium Test Automation Framework built using the Page Object Model (POM) design pattern. It uses TestNG for test execution and reporting, and Maven for build and dependency management.

🚀 Features
Page Object Model for clean, maintainable test code

Selenium WebDriver for browser automation

TestNG for test orchestration and reporting

Maven for dependency management

Supports Java 11

Easily extendable for new test cases and page classes

📂 Project Structure
Code
PageObjectModel/
├── src/
│   ├── main/java/com/...   # Page classes and utilities
│   └── test/java/com/...   # Test classes
├── pom.xml                 # Maven configuration
└── README.md
🛠 Prerequisites
Java 11 installed and configured in JAVA_HOME

Maven 3.6+

A supported browser (e.g., Chrome, Firefox) and matching WebDriver binaries

⚙️ Installation
bash
# Clone the repository
git clone https://github.com/M-Arshad96/PageObjectModel.git
cd PageObjectModel

# Install dependencies
mvn clean install
🧪 Running Tests
bash
# Run all tests
mvn test

# Run tests with a specific TestNG suite file
mvn test -DsuiteXmlFile=testng.xml
📦 Dependencies
From pom.xml:

TestNG – 7.9.0

Selenium Java – 3.141.59

📝 Example Test (TestNG + POM)
java
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("username", "password");
        assertTrue(loginPage.isLoginSuccessful(), "Login should be successful");
    }
}
📚 References
Selenium Documentation

TestNG Documentation

Maven Documentation
