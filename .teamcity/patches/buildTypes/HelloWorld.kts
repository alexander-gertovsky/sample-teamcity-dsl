package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'HelloWorld'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("HelloWorld")) {
    expectSteps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
        script {
            scriptContent = "git --version"
        }
    }
    steps {
        insert(0) {
            maven {
                runnerArgs = "--version"
            }
        }
    }
}
