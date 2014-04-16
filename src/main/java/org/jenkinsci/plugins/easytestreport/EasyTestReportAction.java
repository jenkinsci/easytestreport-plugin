package org.jenkinsci.plugins.easytestreport;

import hudson.model.Action;
import hudson.model.Api;
import hudson.model.Run;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
@ExportedBean
public class EasyTestReportAction implements Action {



    public EasyTestReportAction(Run build) {
        // compute(build);
    }

    public String getIconFileName() {
        return "/plugin/easytestreport/test.png";
    }

    public String getDisplayName() {
        return "easy test report";
    }

    public String getUrlName() {
        return "easyTestReport";
    }

    @Exported
    public int getFoo() {
        return -1;
    }

    public Api getApi() {
        return new Api(this);
    }
}
