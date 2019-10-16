// restrict individual repository Jenkinsfiles
allow_scm_jenkinsfile = false

// define application environment objects
application_environments{
    dev{
        long_name = "Development"
    }
    prod{
        long_name = "Production"
    }
}


/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/
libraries{
  merge = true 
  sonarqube
 // github
 // docker
  maven
  gradle
}
