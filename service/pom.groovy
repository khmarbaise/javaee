project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'service'
  packaging 'ejb'
  dependencies {
    dependency {
      groupId '${project.groupId}'
      artifactId 'service-client'
      version '${project.version}'
    }
    dependency {
      groupId 'javax'
      artifactId 'javaee-api'
      version '6.0'
      scope 'provided'
    }
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
  build {
    plugins {
      plugin {
        artifactId 'maven-ejb-plugin'
        configuration {
          ejbVersion '3.1'
          archive {
            manifest {
              addClasspath 'true'
            }
          }
        }
      }
    }
  }
}
