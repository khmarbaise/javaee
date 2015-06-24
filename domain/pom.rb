project 'domain' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:domain:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'jar'

  jar 'junit:junit'
  jar 'org.testng:testng'
  jar 'log4j:log4j'

end
