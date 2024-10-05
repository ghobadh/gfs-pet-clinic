# gfs-pet-clinic
The G-Froce Software version of Pet Clinic for Spring 5

# Getting Start in using MVN Release pluging
mvn release:clear release:prepare
mvn release:clean  release:prepare
mvn release:perform
mvn release:rollback

For Further learning please check [Maven Release](https://maven.apache.org/guides/mini/guide-releasing.html)

### Chaginge POM
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
