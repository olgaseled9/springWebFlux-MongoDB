## How to build.

#### Java SE version 11 is required to run the application

1.Open terminal in project directory. Build project:

```bash
$ ./gradlew clean build
```

2. Start database

```bash
$ docker-compose up
```
To stop, type 'Ctrl +C' in the terminal window where the command is running.

2. Open terminal in project directory, run server:

```bash
$ ./gradlew bootRun
```
Server started :  [http://localhost:8888](http://localhost:8888)

To stop, type 'Ctrl +C' in the terminal window where the command is running.
