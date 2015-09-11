package org.kevoree.modeling.idea.action;

import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by duke on 7/17/14.
 */
public class GenerateJSAction extends GenerateJavaAction {

    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        generate(anActionEvent, true);
    }
}
