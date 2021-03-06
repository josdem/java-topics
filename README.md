CSV Transformer
----------------------------

How to read and write a CSV file using Apache Commons CSV

#### Read this as reference

* http://josdem.io/techtalk/java/csv_apache_commons/

#### To run the project

```bash
gradle test
```

Date And Time
-----------------------------

A quick review to the `java.util.Date` API in Java 8


#### Read this as reference

* http://josdem.io/techtalk/java/java_time_api/

#### To run the project

```bash
javac BetweenDays.java
java BetweenDays

javac DateOperations.java
java DateOperations
```

Excel Reader
-----------------------------------------------

How to read an Excel file using Apache POI

#### Read this as reference

* http://josdem.io/techtalk/java/apache_poi_excel/

#### To run the project

```bash
gradle test
```

Excel Filter Reader
-----------------------------------------------

How to read filtered rows in Excel file using Apache POI

#### Read this as reference

* http://josdem.io/techtalk/java/apache_poi_excel_filter_reader/

#### To run the project

```bash
gradle test
```

Hello AWS Lambda
--------------------------------------------

Hello World using AWS Lambda

#### Read this as reference

* http://josdem.io/techtalk/java/hello_aws_lambda/

#### To build the project

```bash
gradle buildJar
```

Java NIO Copy
--------------------------------------------

Since Java 7 we can copy files in a easy way

#### Read this as reference

* http://josdem.io/techtalk/java/java_nio_copy/

#### To build the project

```bash
javac FileCopier.java
java FileCopier
```

Properties Apache Commons
--------------------------------------------

Generic configuration interface which enables a Java application to read configuration data

#### Read this as reference

* http://josdem.io/techtalk/java/configuration_apache_commons/

#### To build the project

```bash
gradle buildJar
```

#### To run the project

```bash
java -jar properties-apache-commons-all-0.0.1.jar
```

S3 AWS Lambda
--------------------------------------------

Read and copy files using AWS Lambda

#### Read this as reference

* http://josdem.io/techtalk/java/s3_aws_lambda/

#### To build the project

```bash
gradle buildZip
```

#### To invoke the project

```bash
aws lambda invoke \
--invocation-type Event \
--function-name s3-aws-lambda \
--region us-west-1 \
--payload file://inputfile.txt \
outputfile.txt
```

Mailbox Reader
------------------------------------

#### Configuration

In your computer's home directory: `${home}`, create a directory called: `.mailbox-reader` then inside create a file called `application.properties` with this content

```properties
username=user@gmail.com
password=secret
pop3.server=pop.gmail.com
pop3.port=995
imap.server=imap.gmail.com
imap.port=993
ews.username=user@outlook.com
ews.password=secret
ews.server=https://exchange/EWS/Exchange.asmx
ews.protocol=https://
```

#### Build

```bash
gradle build
```

#### Run

```bash
 java -jar mailbox-reader-0.0.1-SNAPSHOT.jar
```

#### Features

* This approach is using Gmail account with IMAP enabled (Settings > Forwarding and POP/IMAP)
* Using Exchange Web Services [EWS Java API](https://github.com/OfficeDev/ews-java-api)
* Read body email usgin text/plain as ContentType
* Read body email using  multipart/mixed as ContenType

#### Read this as reference

* http://josdem.io/techtalk/camel/mailbox_reader/
* http://josdem.io/techtalk/java/mailbox_reader_pop3/
* http://josdem.io/techtalk/java/mailbox_reader_imap/
* http://josdem.io/techtalk/java/mailbox_reader_exchange/
* http://josdem.io/techtalk/spring/spring_unit_testing_spock/
* http://josdem.io/techtalk/spring/spring_boot/
* http://josdem.io/techtalk/spring/spring_gradle/

Stream
--------------------------------------------

Stream interface is defined in `java.util.stream package`. In Java 8, collections will start having methods that return Stream. Streams support Aggregate Operations. The common aggregate operations are filter, map, reduce, find, match and sort.

#### Read this as reference

* http://josdem.io/techtalk/java/streams/

#### To build the project

```bash
javac ${JAVA_PROGRAM}.java
java -ea ${JAVA_PROGRAM}
```

Stream Filters
--------------------------------------------

A stream represents a sequence of elements and supports different operations to perform calculations in those elements, here we review the filters:

#### Read this as reference

* http://josdem.io/techtalk/java/stream_filters/

#### To build the project

```bash
javac ${JAVA_PROGRAM}.java
java -ea ${JAVA_PROGRAM}
```

Stream Collectors
--------------------------------------------

How use collectors over streams to group by, concatenate, map and list.

#### Read this as reference

* http://josdem.io/techtalk/java/stream_collectors/

#### To run the project

```bash
javac ${JAVA_PROGRAM}.java
java -ea ${JAVA_PROGRAM}
```

Executors
--------------------------------------------

How use Executors, Callable and Futures

#### Read this as reference

* http://josdem.io/techtalk/java/executors/

#### To run the project

```bash
javac ${JAVA_PROGRAM}.java
java ${JAVA_PROGRAM}
```

Generics
--------------------------------------------

How we can use Generics in Java.

#### Read this as reference

* http://josdem.io/techtalk/java/generics/

To run the code:

```bash
javac ${JAVA_PROGRAM}.java
java -ea ${JAVA_PROGRAM}
```

To test the code:

```bash
gradle test
```

Functional Interfaces
--------------------------------------------

A functional interface in Java is any with @FunctionalInterface annotation and with SAM(Single Abstract Method). It was introduced to facilitate [Lambda expressions](http://josdem.io/techtalk/java/lambda_expressions/). Since a lambda function can only provide the implementation for one method, it is mandatory for the functional interfaces to have only one abstract method.

#### Read this as reference

* http://josdem.io/techtalk/java/functional_interfaces/

#### To run the code

```bash
javac ConsumerExample.java
java ConsumerExample
```

#### To test the code using Gradle

```bash
gradle test
```

#### To test the code using Maven

```bash
mvn test
```


Lambda Expressions
--------------------------------------------

Since Java 8 we have Lambda expressions which is a function defined under some interface contract and the main purpose is to implement functional programming in Java.

#### Read this as reference

* http://josdem.io/techtalk/java/lambda_expressions/

#### To test the code using Gradle

```bash
gradle test
```

#### To test the code using Maven

```bash
mvn test
```

Using Optional
--------------------------------------------

Once called a Billion-dollar mistake. NullPointerException is by far one of the most frequent exceptions in Java and since version 8 we can use it as a way to avoid this exception. Optional is a container that can has a value or not.

#### Read this as reference

* https://josdem.io/techtalk/java/optional/

#### To test

```bash
gradle test
```

