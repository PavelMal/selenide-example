
This is an example of using the Selenide framework and showcasing tests using the Page Object pattern. The project includes basic tests for search/clearing the search/ displaying pop-up suggestions, as well as attempting to log in with incorrect data.

You can run tests in parallel by adding param `-Psuite="Parallel"`also you can configure thread amount by adding param `-Pthreads="2"` into 'arguments'.

In case of no additional params tests will start with default configuration (`single` thread with a `single` suite).
Also, you can add a param `-PbaseUrl` to change a start URL for example:

- `-PbaseUrl="google.com"`
