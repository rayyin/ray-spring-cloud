FROM ${docker_harbor_ip}/library/oracle-jdk:1.8.0_211

MAINTAINER Ray Yin

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

EXPOSE 8761

ADD ./target/ray-cloud-eureka.jar ./

ENTRYPOINT ["java","-jar","./ray-cloud-eureka.jar"]
