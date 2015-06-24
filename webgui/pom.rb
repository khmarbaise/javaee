project 'webgui' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:webgui:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'war'

  jar '${project.groupId}:service-client:${project.version}'
  jar( 'javax:javaee-api:6.0',
       :scope => 'provided' )


  build do

    resource do
      directory '${project.basedir}'
      includes 'README.md'
      excludes 
    end
  end

end
