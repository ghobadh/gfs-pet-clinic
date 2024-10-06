# Getting Start in using MVN Release pluging
  mvn release:clear release:prepare
  mvn release:clean  release:prepare
  mvn release:perform
  mvn release:rollback

For Further learning please check [Maven Release](https://maven.apache.org/guides/mini/guide-releasing.html)

### Chaging POM for Maven Release  
```
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <configuration>
                    <goals>install</goals>
                    <autoVersionSubmodules>true</autoVersionSubmodules>
               </configuration>
            </plugin>
```


### Spring framework stereotype
* @Component

    Indicates that an annotated class is a "component" and it will be created as a bean
* @Controller

  Indicates that an annoated class has the role of Spring MVC "Controller"
* @RestController

  Convenience Annotation which extends @Controller and adds @ResponseBody
* Repository

  Indicates class is a "Repository", originally defined by Domain-Driven Design as 
  "a mechanism for encapsulating storage , retrieval, and search behaviour which a collection of objects "
* @Service

  Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design as
  "an operation offered as an interface that stands alone in the model, with no encapsulated state"

### Spring Component Scan
* Spring Beans defined with Spring Stereotypes are detected with Spring Component scan
* On Start up Spring is told to scan pkgs for classes with Spring Stereotype annoation
* This configuration is Spring Framework specific , NOT spring Boot
* Spring Boot's auto configuration will tell spring to perform a component scan of the package of the main class. This includes all sup packages of the main class package
* When using Spring Boot, if a class is outside of the main class package tree, you must declare the package scan

# Spring Bean Lifecycle

Instantiate --> Populate Properties --> Call setBeanName of BeanNameAware -->
Call setBeanFactory of BeanFactoryAware --> Call setApplicationContext of ApplicationContestAware --> Preinitialization (Bean PostProcessors) -->
afterPropertiesSet of Initializing Beans --> Custom Init Method --> Post Initialization (BeanPostProcessors) --> Bean ready to use



When the container is shutdown
Container Shutdown --> @PreDestroy annotated Method --> Disposable Bean's destroy() --> Terminated



* [Tutorials point](https://www.tutorialspoint.com/spring/spring_bean_life_cycle.htm)
* [Geeks For Geeks](https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/)

Spring has 14 'Aware' interfaces. These are can be useful when you want to modify Spring framework.

### Spring Bean Scope

* Singleton (default) - Only one instance of the bean is created in the IoC container
* Prototype - A new instance is created each time the bean is requested
* Request - A single instance per http request. Only valid in the context of the web-aware Spring ApplicationContext
* Session - A single instance per http session. Only valid in the context of the a web-aware Spring ApplicationContext
* Global Session - A single instance per global session. Typically only used in a portlet context. only valid in the
  context of a web-aware Spring ApplicationContext
* Application - bean is scoped to lifecycle of the ServletContext. only valid in the context of the web aware.
* Websocket - scope a single bean definition to the lifecycle of a webscoket . only valid in the context of a web-aware
  Spring ApplicationContext
* Custom Scope - Spring scope are extensible and you define your own scope by implementing spring 'scope' interface. You
  cannot override in the build in Singleton and Prototype Scope

#### Declaring Bean Scope

* No declaration needed for singleton scope
* in Java Configuration use @Scope annotation
* in XML configuration scope in an xml attribute of the bean tag
* 99% of the time singlton scope is fine