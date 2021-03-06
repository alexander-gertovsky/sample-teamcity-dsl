import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.2"

project {
    buildType(HelloWorld)
}

object HelloWorld: BuildType({
    name = "Hello world"
    steps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
        script {
            scriptContent = "git --version"
        }
        maven {
            runnerArgs = "--version"
        }
        maven {
            runnerArgs = "--version"
        }
    }
})