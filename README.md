# Test Automation Framework with Selenium, Maven, and Java

## Introduction
This project is a simple sample of a test automation framework that uses Selenium, Maven, and Java. The primary idea behind this project is to create a proof of concept for performing i18n (internationalization) tests. The framework includes various packages and classes designed to make it easier to automate testing across multiple languages.

## Framework Structure

### Core Package
1. **LangController.java**: This class is responsible for extracting data from the "lang" package, which contains language-specific `.txt` files. These files are read during testing and stored in a hashmap for quick access. Storing data in a hashmap ensures efficient retrieval with a logarithmic time complexity (O(log n).

2. **WebDriverController.java**: This class is used to generate and manage WebDriver instances. It's a fundamental component for interacting with web pages during testing.

### Sample.Page Package
1. **CommonPage.java**: This class contains common methods that can be used across different pages for test object interaction. It promotes reusability and reduces duplication of code.

2. **HomePage.java**: This class serves as a test case base for testing the homepage page. It's where specific test cases related to the homepage are written.

### Lang Package
This package contains `.txt` files for different languages. The data from these files is loaded into a hashmap for i18n testing.

### Test Package
This package contains test suite classes that are responsible for running test cases. These classes orchestrate the execution of various tests across different parts of the application.

## Prerequisites
Before getting started with this framework, ensure you have the following prerequisites installed on your system:
- Java
- Maven
- WebDriver-compatible browser (e.g., Chrome, Firefox)
- Git (for cloning the repository)

## Usage

1. **Cloning the Repository**: Start by cloning this repository to your local machine using Git:

    ```bash
    git clone https://github.com/your/repo.git
    ```

2. **Setting Up Dependencies**: Before using this framework, ensure that you have Selenium, Maven, and Java installed on your system.

3. **Maven Configuration**: This project utilizes Maven for dependency management and project build. You can build the project by running:

    ```bash
    mvn clean install
    ```

4. **Create Test Cases**: To create test cases, utilize the classes in the `Sample.Page` package. Extend the `CommonPage` for reusability and create specific test cases in classes like `HomePage`.

5. **Execute Tests**: Use test suite classes in the `Test` package to execute test cases. These classes define the sequence of tests to be run.

6. **I18n Testing**: Modify or add `.txt` files in the `Lang` package to support different languages. The `LangController` class can then be used to load and manage language-specific data for testing.

7. **WebDriver Management**: The `WebDriverController` class can be used to manage WebDriver instances. Make sure to configure it according to your needs.

8. **Running Tests and Generating Surefire Report**: To run the tests and generate a Surefire report, use the following Maven command:

    ```bash
    mvn surefire-report:report
    ```

## Contributing
We welcome contributions to improve and extend this framework. If you have suggestions or would like to contribute, please submit a pull request or open an issue in the project's repository.

## License
This framework is available under the [MIT License](LICENSE).

## Contact
If you have any questions or need assistance, feel free to contact the project maintainers at frx.michael.widjaja@gmx.de or evagundam@gmail.com.

Thank you for using this test automation framework! Happy testing!
