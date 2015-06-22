project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'service-client'
  dependencies {
    dependency {
      groupId '${project.groupId}'
      artifactId 'domain'
      version '${project.version}'
    }
  }
}
