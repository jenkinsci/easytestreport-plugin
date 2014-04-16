package org.jenkinsci.plugins.easytestreport;

import hudson.Extension;
import hudson.model.Action;
import hudson.model.Run;
import hudson.model.TransientBuildActionFactory;

import java.util.Collection;
import java.util.Collections;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
@Extension
public class EasyTestReportActionFactory extends TransientBuildActionFactory {

    @Override
    public Collection<? extends Action> createFor(Run target) {
        return Collections.singleton(new EasyTestReportAction(target));
    }
}
