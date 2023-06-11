# JUnit Test Cases for Instagram and Twitter Classes

This project contains JUnit test cases for the `InstagramClass` and `TwitterClass` Java classes.

## Description

The purpose of this project is to verify the functionality and behavior of the `InstagramClass` and `TwitterClass` implementations using JUnit tests. The test cases cover various aspects of the classes' methods and properties.

## Prerequisites

To run the JUnit tests, make sure you have the following prerequisites installed:

- Java Development Kit (JDK) - version 8 or higher
- JUnit - version 4 or higher

## Getting Started

Follow the steps below to get started with running the JUnit tests:

1. Clone the repository:

   ```bash
   git clone <repository_url>


2. Compile the source code:

    javac -cp junit.jar:. newone/*.java

3. Run the tests
    java -cp junit.jar:. org.junit.runner.JUnitCore newone.TwitterClassTest newone.InstagramClassTest

This will execute the JUnit tests for the TwitterClass and InstagramClass.

## Test Cases

### TwitterClassTest:

    1. tweeted(): Verifies that the initial value of tweet is false.
    2. tweet_count(): Verifies the expected total count of tweets.
    3. newTweet(): Sets tweet to true and checks if it is true.
### InstagramClassTest:

    1. firstTimeRun(): Checks that the initial value of running is false.
    2. secondTimeRun(): Sets running to true and asserts that it is true.
    3. checkUsername(): Verifies the expected values of username and password.

## Contributing
Contributions to this project are welcome. If you find any issues or have suggestions for improvement, please feel free to open an issue or submit a pull request.


## License
MIT License

Copyright (c) 2023 Aditya_Sharma

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

