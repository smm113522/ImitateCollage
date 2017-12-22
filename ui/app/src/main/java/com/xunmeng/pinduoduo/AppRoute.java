package com.xunmeng.pinduoduo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;


import com.xunmeng.pinduoduo.activity.MainActivity;

import java.util.ArrayList;

/**
 * 路由
 * Created by ChenRui on 2016/12/6 23:49.
 */
public final class AppRoute {

    // WEB 登录
    public static final int REQ_CODE_WEB_LOGIN = 100;
    // 图片选择
    public static final int REQ_IMAGE_SELECTION = 106;
    // 图片选择
    public static final int REQ_CODE_IMAGE_SELECTED = 107;

    private static void startActivity(Context context, Intent intent) {
        context.startActivity(intent);
    }

    private static void startActivity(Context context, Class<?> cls) {
        startActivity(context, new Intent(context, cls));
    }

    private static void startActivityForResult(Activity context, Intent intent, int requestCode) {
        context.startActivityForResult(intent, requestCode);
    }

    private static void startActivityForResult(Activity context, Class<?> cls, int requestCode) {
        startActivityForResult(context, new Intent(context, cls), requestCode);
    }

    /**
     * 网页
     *
     * @param url 路径
     */
    public static void jumpToWeb(Context context, String url) {
//        Intent intent = new Intent(context, WebActivity.class);
//        intent.setData(Uri.parse(url));
//        startActivity(context, intent);
    }

    /**
     * 用户反馈
     */
    public static void jumpToFeedback(Context context) {
//        Intent intent = new Intent(context, FeedbackActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(context, intent);
    }


    /**
     * 网页，新线程
     *
     * @param url 路径
     */
    public static void jumpToWebNewTask(Context context, String url) {
//        Intent intent = new Intent(context, WebActivity.class);
//        intent.setData(Uri.parse(url));
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(context, intent);
    }

    /**
     * 主界面
     */
    public static void jumpToMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
        intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }


    /**
     * 登录
     */
    public static void jumpToLogin(Context context) {
//        startActivity(context, LoginActivity.class);
    }

    /**
     * 登录
     */
    public static void jumpToLogin(Activity context, int req) {
//        startActivityForResult(context, LoginActivity.class, req);
    }

    /**
     * 登录，有回调结果
     */
    public static void jumpToWebLogin(Activity context) {
//        startActivityForResult(context, WebLoginActivity.class, REQ_CODE_WEB_LOGIN);
    }

    /**
     * 图片大图预览
     *
     * @param images   图片数组
     * @param position 跳转到低几张图片，默认传0
     */
    public static void jumpToImagePreview(Activity context, @NonNull ArrayList<String> images, int position, ArrayList<String> selectedImages, int maxCount) {
//        Intent intent = new Intent(context, ImagePreviewActivity.class);
//        intent.putStringArrayListExtra("images", images);
//        if (selectedImages != null) {
//            intent.putStringArrayListExtra("selectedImages", selectedImages);
//        }
//        intent.putExtra("position", position);
//        intent.putExtra("maxCount", maxCount);
//        startActivityForResult(context, intent, REQ_CODE_IMAGE_SELECTED);
    }

    /**
     * 图片大图预览
     *
     * @param images   图片数组
     * @param position 跳转到低几张图片，默认传0
     */
    public static void jumpToImagePreview(Activity context, @NonNull ArrayList<String> images, int position) {
        jumpToImagePreview(context, images, position, null, 0);
    }

    /**
     * 图片大图预览
     *
     * @param images   图片数组
     * @param position 跳转到低几张图片，默认传0
     */
    public static void jumpToImagePreview(Context context, @NonNull ArrayList<String> images, int position) {
//        Intent intent = new Intent(context, ImagePreviewActivity.class);
//        intent.putStringArrayListExtra("images", images);
//        intent.putExtra("position", position);
//        startActivity(context, intent);
    }


    /**
     * 图片查看
     *
     * @param imgUrl 图片路径
     */
    public static void jumpToImagePreview(Activity context, @NonNull String imgUrl) {
        ArrayList<String> data = new ArrayList<>();
        data.add(imgUrl);
        jumpToImagePreview(context, data, 0);
    }


    /**
     * 图片查看
     *
     * @param imgUrl 图片路径
     */
    public static void jumpToImagePreview(Context context, @NonNull String imgUrl) {
        ArrayList<String> data = new ArrayList<>();
        data.add(imgUrl);
        jumpToImagePreview(context, data, 0);
    }


    /**
     * 设置
     */
    public static void jumpToSetting(Context context) {
//        startActivity(context, SettingActivity.class);
    }

    /**
     * 搜索
     */
    public static void jumpToSearch(Context context) {
//        startActivity(context, SearchActivity.class);
    }


    /**
     * 系统消息
     */
    public static void jumpToSystemMessage(Context context) {
//        startActivity(context, SystemMessageActivity.class);
    }

    /**
     * 字体设置
     */
    public static void jumpToFontSetting(Context context) {
//        startActivity(context, FontSettingActivity.class);
    }

    /**
     * 跳转到图片选择
     */
    public static void jumpToImageSelection(Activity context, ArrayList<String> selectedImages) {
//        Intent intent = new Intent(context, ImageSelectionActivity.class);
//        if (selectedImages != null)
//            intent.putStringArrayListExtra("selectedImages", selectedImages);
//        startActivityForResult(context, intent, REQ_IMAGE_SELECTION);
    }
}
