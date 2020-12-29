#### multi-project that use gradle

##### build all
```
gradle clean build
```

##### build any
```
gradle :hello-gradle-common:build
gradle :hello-gradle-app:build
gradle :hello-gradle-app2:build
```

##### run app
```
gradle :hello-gradle-app:bootRun
gradle :hello-gradle-app2:bootRun
```
