package com.github.tobiastao.intellijmarkdown.services

import com.intellij.openapi.project.Project
import com.github.tobiastao.intellijmarkdown.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
