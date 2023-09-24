
This is an example of using the Selenide framework and showcasing tests using the Page Object pattern. The project includes basic tests for search/clearing the search/ displaying pop-up suggestions, as well as attempting to log in with incorrect data.

You can run tests in parallel by adding param `-Psuite="Parallel"`also you can configure thread amount by adding param `-Pthreads="2"` into 'arguments'.

In case of no additional params tests will start with default configuration (`single` thread with a `single` suite).
Also, you can add a param `-PbaseUrl` to change a start URL for example:

- `-PbaseUrl="google.com"`

To see a test report after passing tests, you need following the instruction:

- Run tests (when tests finish you will see a new folder 'build' inside a project, inside 'build' folder you will see 'allure-results' folder)

- Change your directory into 'build' and run a command `allure serve` in command line (report will be formed automatically)