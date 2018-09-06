= Spring Boot GraalVM demo

Repro project for https://github.com/oracle/graal/issues/655[graal#655]. This application works fine with Graal 1.0.0-RC5 but not 1.0.0-RC6 due to a regression.

See other branches for other Graal issues repro projects.

This project is a minimal Spring Boot Reactive webapp designed to compile and run with GraalVM.

To build it, run `./build.sh`, and then to run it execute `com.example.graaldemo.graaldemoapplication`, and browse `http://localhost:8080/`.

See https://jira.spring.io/browse/SPR-16991?focusedCommentId=160597&page=com.atlassian.jira.plugin.system.issuetabpanels:comment-tabpanel#comment-160597[SPR-16991] for a status of remaining Spring + Graal issues.