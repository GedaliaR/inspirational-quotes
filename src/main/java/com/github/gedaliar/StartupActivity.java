package com.github.gedaliar;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class StartupActivity implements com.intellij.openapi.startup.StartupActivity {

    @Override
    public void runActivity(@NotNull Project project) {
        Messages.showMessageDialog(project, "Hello World!", "Quote of the Day", Messages.getInformationIcon());



    }


}
