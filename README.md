# org_rd_template_gradle
Some useful gradle projects for java.

# TODO
settings.gradle
dependencyResolutionManagement {
repositoriesMode.set(RepositoriesMode.PREFER_PROJECT) // DEfault.
repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
repositories {
mavenCentral()
}
}


configurations {
ITtestImplementation.extendsFrom testImplementation
}

dependencies {
testImplementation("junit:junit:4.13")
ITtestImplementation("org.apache.httpcomponents:httpclient:4.5.5")
}

dependencies {
implementation 'org.springframework:spring-web'
}
dependencies {
constraints {
implementation 'org.springframework:spring-web:5.0.2.RELEASE'
}
}

dependencies {
implementation('commons-beanutils:commons-beanutils:1.9.4') {
exclude group: 'commons-collections', module: 'commons-collections'
}
}

dependencies {
// get recommended versions from the platform project
api platform(project(':platform'))
// no version required
api 'commons-httpclient:commons-httpclient'
}


https://docs.gradle.org/current/userguide/plugins.html#sec:plugin_version_management

luginManagement {
  plugins {
        id 'com.example.hello' version "${helloPluginVersion}"
    }
}
build.gradle
plugins {
    id 'com.example.hello'
}
gradle.properties
helloPluginVersion=1.0.0