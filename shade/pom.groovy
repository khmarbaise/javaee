project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'shade'
  dependencies {
    dependency {
      groupId '${project.groupId}'
      artifactId 'webgui'
      version '${project.version}'
      type 'war'
    }
    dependency {
      groupId '${project.groupId}'
      artifactId 'service'
      version '${project.version}'
      type 'ejb'
    }
  }
  build {
    plugins {
      plugin {
        artifactId 'maven-shade-plugin'
        executions {
          execution {
            id 'test'
            phase 'package'
            goals {
              goal 'shade'
            }
            configuration {
              shadedClassifierName 'test'
            }
          }
          execution {
            id 'dev'
            phase 'package'
            goals {
              goal 'shade'
            }
            configuration {
              shadedClassifierName 'dev'
            }
          }
          execution {
            id 'prod'
            phase 'package'
            goals {
              goal 'shade'
            }
            configuration {
              shadedClassifierName 'prod'
            }
          }
        }
        configuration {
          shadedArtifactAttached 'true'
        }
      }
    }
  }
}
