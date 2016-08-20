project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.smpp'
    artifactId 'smpp'
    version '2.2.1'
  }
  groupId 'com.soebes.examples.j2ee'
  artifactId 'parent'
  version '1.1.2-SNAPSHOT'
  packaging 'pom'
  modules {
    module 'webgui'
    module 'app'
    module 'domain'
    module 'service'
    module 'service-client'
    module 'appasm'
    module 'assembly'
    module 'shade'
  }
  scm {
    connection 'scm:git:git://github.com/khmarbaise/javaee.git'
    developerConnection 'scm:git:git@github.com:khmarbaise/javaee.git'
    url 'https://github.com/khmarbaise/javaee'
  }
  distributionManagement {
    repository {
      id 'releases'
      url 'http://localhost:8081/nexus/content/repositories/releases/'
    }
    snapshotRepository {
      id 'snapshots'
      url 'http://localhost:8081/nexus/content/repositories/snapshots/'
    }
    site {
      id 'site'
      url 'file://${HOME}/distribution/site/'
    }
  }
  properties {
    'project.build.sourceEncoding' 'UTF-8'
  }
  dependencies {
    dependency {
      groupId 'junit'
      artifactId 'junit'
      version '4.11'
    }
    dependency {
      groupId 'org.testng'
      artifactId 'testng'
      version '6.8.8'
    }
    dependency {
      groupId 'log4j'
      artifactId 'log4j'
      version '1.2.16'
    }
  }
}
