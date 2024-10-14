FROM ubuntu:24.10 AS packages_install

RUN apt-get update && apt-get upgrade

RUN apt-get install wget -y

FROM packages_install AS graalvm_install

WORKDIR /opt/

RUN wget https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_linux-x64_bin.tar.gz

RUN tar -xvf graalvm-jdk-21_linux-x64_bin.tar.gz

RUN mv graalvm-jdk-21.0.4+8.1 graalvm-jdk-21

ENV PATH="$PATH:/opt/graalvm-jdk-21/bin"

CMD ["javac", "-version"]

FROM graalvm_install AS maven_install

WORKDIR /opt/

RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz

RUN tar -xvf apache-maven-3.9.9-bin.tar.gz

ENV PATH="$PATH:/opt/apache-maven-3.9.9/bin"

FROM maven_install

WORKDIR /opt

WORKDIR /vollmed

COPY . .

RUN mvn native:compile -Pnative -DskipTests -e -X

RUN ls -la > ls.txt

CMD ["cat", "ls.txt"]
