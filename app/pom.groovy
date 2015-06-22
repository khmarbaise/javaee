project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'app'
  packaging 'ear'
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
}
