package com.github.drkcode.clasicharmonizedforintellij.services

import com.intellij.openapi.project.Project
import com.github.drkcode.clasicharmonizedforintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
