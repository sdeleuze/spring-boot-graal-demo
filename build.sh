#!/usr/bin/env sh
./mvnw clean install
unzip target/spring-boot-graal-demo-0.0.1-SNAPSHOT.jar -d target/spring-boot-graal-demo-0.0.1-SNAPSHOT
native-image -H:ReflectionConfigurationFiles=graal.json -Dio.netty.noUnsafe=true -H:+ReportUnsupportedElementsAtRuntime -Dfile.encoding=UTF-8 -cp ".:$(echo target/spring-boot-graal-demo-0.0.1-SNAPSHOT/BOOT-INF/lib/*.jar | tr ' ' ':')":target/spring-boot-graal-demo-0.0.1-SNAPSHOT/BOOT-INF/classes com.example.graaldemo.GraalDemoApplication
