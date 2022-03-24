package com.github.ioexceptions.dhgpatch.services

import com.intellij.openapi.project.Project
import com.github.ioexceptions.dhgpatch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
