spring.config.import=/etc/config/myfile.yml # import a file from the filesystem
#---
spring.config.import=resource:/etc/config/myfile.yml # more explicit version of above
#---
spring.config.import=classpath:extra.properties # import a classpath resource
#---
spring.config.import=resource:classpath:extra.properties # more explicit version of above
#---
spring.config.import=configtree:/etc/config/folder # import a config tree