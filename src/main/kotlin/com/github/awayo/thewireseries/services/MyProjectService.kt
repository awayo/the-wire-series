package com.github.awayo.thewireseries.services

import com.intellij.openapi.project.Project
import com.github.awayo.thewireseries.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
