package com.xunmeng.pinduoduo.sdk;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * glide
 * Created by ChenRui on 2017/8/10 0010 23:15.
 */
@GlideModule
public class CnblogsGlideModule extends AppGlideModule {

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
