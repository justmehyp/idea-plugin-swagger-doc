package com.github.justmehyp.ideapluginswaggerdoc.services

import com.intellij.openapi.project.Project
import com.github.justmehyp.ideapluginswaggerdoc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
