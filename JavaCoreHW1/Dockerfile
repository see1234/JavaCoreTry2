FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR /app

COPY src ./src

RUN javadoc -d docs -sourcepath src/main/java src/main/java/*.java

RUN mkdir -p out/classes

RUN javac -sourcepath ./src/main/java -d ./out/classes ./src/main/java/Main.java

RUN mkdir -p docs

RUN javadoc -d ./docs -sourcepath ./src/main/java ./src/main/java/*.java

CMD ["java", "-classpath", "./out/classes", "Main"]
