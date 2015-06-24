project 'parent' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  inherit 'com.soebes.smpp:smpp:1.0.0'
  packaging 'pom'

  source_control( :url => 'https://github.com/khmarbaise/javaee',
                  :connection => 'scm:git:git://github.com/khmarbaise/javaee.git',
                  :developer_connection => 'scm:git:git@github.com:khmarbaise/javaee.git' )

  distribution do
    repository( :id => 'releases',
                :url => 'http://localhost:8081/nexus/content/repositories/releases/' )
    snapshot_repository( :id => 'snapshots',
                         :url => 'http://localhost:8081/nexus/content/repositories/snapshots/' )
    site( :id => 'site',
          :url => 'file://${HOME}/distribution/site/' )
  end

  properties( 'project.build.sourceEncoding' => 'UTF-8' )

  jar 'junit:junit:4.11'
  jar 'org.testng:testng:6.8.8'
  jar 'log4j:log4j:1.2.16'

  modules [ 'webgui',
            'app',
            'domain',
            'service',
            'service-client',
            'appasm',
            'assembly',
            'shade' ]

end
