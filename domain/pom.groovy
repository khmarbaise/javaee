project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'domain'
  dependencies {
    dependency {
      groupId 'junit'
      artifactId 'junit'
    }
    dependency {
      groupId 'org.testng'
      artifactId 'testng'
    }
    dependency {
      groupId 'log4j'
      artifactId 'log4j'
    }
  }
}
