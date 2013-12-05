package com.aquent.viewtools;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class TwitterToolInfo extends ServletToolInfo {

    @Override
    public String getKey () {
        return "twitter";
    }

    @Override
    public String getScope () {
        return ViewContext.APPLICATION;
    }

    @Override
    public String getClassname () {
        return TwitterTool.class.getName();
    }

    @Override
    public Object getInstance ( Object initData ) {

        TwitterTool viewTool = new TwitterTool();
        viewTool.init( initData );

        setScope( ViewContext.APPLICATION );

        return viewTool;
    }

}
