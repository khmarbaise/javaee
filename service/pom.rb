project 'service' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:service:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'ejb'

  jar '${project.groupId}:service-client:${project.version}'
  jar( 'javax:javaee-api:6.0',
       :scope => 'provided' )
  jar 'junit:junit'
  jar 'org.testng:testng'
  jar 'log4j:log4j'

  plugin( :ejb,
          'ejbVersion' =>  '3.1',
          'archive' => {
            'manifest' => {
              'addClasspath' =>  'true'
            }
          } )
end
