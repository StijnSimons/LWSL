# LWSL
Lightweight socket library (lwsl for short) is an open source socket library created in Java.
It is created to assist in the usage of sockets, both TCP and (reliable) UDP (soon).

Currently, this repository is unfinished and under construction but will soon have its first release.

## Usage
Under construction

## Installation
Under construction

### Maven

```xml
<repositories>
    <repository>
        <id>solaris-repo</id>
        <url>https://maven.baddeveloper.xyz/repository/solaris</url>
    </repository>
</repositories>
```

```xml
<dependencies>
    <dependency>
        <groupId>xyz.baddeveloper</groupId>
        <artifactId>lwsl-tcp</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

### Gradle

```gradle
allprojects {
    repositories {
        maven { url 'https://maven.baddeveloper.xyz/repository/solaris' }
    }
}
```

```gradle
dependencies {
    implementation 'xyz.baddeveloper:lwsl-tcp:1.0.0-SNAPSHOT'
}
```

## Contributing
Check the CONTRIBUTING.md (soon) for more information.