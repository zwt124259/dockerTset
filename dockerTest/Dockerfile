FROM jdk_1.8
MAINTAINER developtao@163.com
RUN mkdir /work
ADD /Users/wt/.jenkins/workspace/dockerTest/dockerTest/target/demo-0.0.1-SNAPSHOT.jar  /work 
ENTRYPOINT [ "java","-jar",/"work/demo-0.0.1-SNAPSHOT.jar" ]
EXPOSE 8082