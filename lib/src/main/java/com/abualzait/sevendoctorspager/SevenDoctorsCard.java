package com.abualzait.sevendoctorspager;

import android.graphics.Color;

import com.abualzait.sevendoctorspager.views.SevenDoctorsImageView;

import java.io.Serializable;

public class SevenDoctorsCard implements Serializable{

    private int mImageRes;

    private String mDescription;

    private String mTitle;
    private int mTitleColor;
    private int mTitleSizeDP;

    private String mSubTitle;
    private int mSubTitleColor;
    private int mSubTitleSizeDP;

    private int mTextMarginDP;
    private int mLineSpacingDP;

    private boolean mAutoTint;
    private int mTintColor;
    private int mTintAlpha;

    private SevenDoctorsImageView.ImageCutType mImageCutType;
    private int mImageCutCount;
    private int mImageCutHeightDP;

    private int mBackgroundColor;

    public SevenDoctorsCard() {

        mImageRes = SevenDoctorsImageView.DEF_IMAGE_RES;
        mDescription = "";

        mTitle = SevenDoctorsImageView.DEF_TITLE_TEXT;
        mTitleColor = SevenDoctorsImageView.DEF_TITLE_TEXT_COLOR;
        mTitleSizeDP = SevenDoctorsImageView.DEF_TITLE_TEXT_SIZE_DP;

        mSubTitle = SevenDoctorsImageView.DEF_SUB_TITLE_TEXT;
        mSubTitleColor = SevenDoctorsImageView.DEF_SUB_TITLE_TEXT_COLOR;
        mSubTitleSizeDP = SevenDoctorsImageView.DEF_SUB_TITLE_TEXT_SIZE_DP;

        mTextMarginDP = SevenDoctorsImageView.DEF_TEXT_MARGIN_DP;
        mLineSpacingDP = SevenDoctorsImageView.DEF_LINE_SPACING_DP;

        mAutoTint = SevenDoctorsImageView.DEF_AUTO_TINT_MODE;
        mTintColor = SevenDoctorsImageView.DEF_TINT_COLOR;
        mTintAlpha = SevenDoctorsImageView.DEF_TINT_ALPHA;

        mImageCutType = SevenDoctorsImageView.DEF_IMAGE_CUT_TYPE;
        mImageCutCount = SevenDoctorsImageView.DEF_CUT_COUNT;
        mImageCutHeightDP = SevenDoctorsImageView.DEF_CUT_HEIGHT;

        mBackgroundColor = Color.parseColor("#FFF1F1F1");
    }

    public SevenDoctorsCard(String title, String description, int imageRes) {
        this();
        mTitle = title;
        mDescription = description;
        mImageRes = imageRes;
    }

    /*
     * Setters:
     */

    public SevenDoctorsCard withImageRes(int imgRes) {
        mImageRes = imgRes;
        return this;
    }

    public SevenDoctorsCard withDescription(String desc) {
        mDescription = desc;
        return this;
    }

    public SevenDoctorsCard withTitle(String title) {
        mTitle = title;
        return this;
    }

    public SevenDoctorsCard withTitleColor(int color) {
        mTitleColor = color;
        return this;
    }

    public SevenDoctorsCard withTitleSizeDP(int size)
    {
        mTitleSizeDP = size;
        return this;
    }

    public SevenDoctorsCard withSubTitle(String subTitle) {
        mSubTitle = subTitle;
        return this;
    }

    public SevenDoctorsCard withSubTitleColor(int color) {
        mSubTitleColor = color;
        return this;
    }

    public SevenDoctorsCard withSubTitleSizeDP(int size) {
        mSubTitleSizeDP = size;
        return this;
    }

    public SevenDoctorsCard withTextMarginDP(int margin) {
        mTextMarginDP = margin;
        return this;
    }

    public SevenDoctorsCard withLineSpacingDP(int spacing) {
        mLineSpacingDP = spacing;
        return this;
    }

    public SevenDoctorsCard withAutoTint () {
        mAutoTint = true;
        return this;
    }

    public SevenDoctorsCard withTintColor (int color) {
        mTintColor = color;
        mAutoTint = false;
        return this;
    }

    public SevenDoctorsCard withTintAlpha (int alpha) {
        mTintAlpha = alpha;
        return this;
    }

    public SevenDoctorsCard withImageCutType(SevenDoctorsImageView.ImageCutType cutType) {
        mImageCutType = cutType;
        return this;
    }

    public SevenDoctorsCard withImageCutCount(int count) {
        mImageCutCount = count;
        return this;
    }

    public SevenDoctorsCard withImageCutHeightDP(int height) {
        mImageCutHeightDP = height;
        return this;
    }

    public SevenDoctorsCard withBackgroundColor(int bgColor) {
        mBackgroundColor = bgColor;
        return this;
    }

    /*
     * Getters:
     */

    public int getImageRes() {
        return mImageRes;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getTitleColor() {
        return mTitleColor;
    }

    public int getTitleSizeDP() {
        return mTitleSizeDP;
    }

    public String getSubTitle() {
        return mSubTitle;
    }

    public int getSubTitleColor() {
        return mSubTitleColor;
    }

    public int getSubTitleSizeDP() {
        return mSubTitleSizeDP;
    }

    public int getTextmatginDP() {
        return mTextMarginDP;
    }

    public int getLineSpacingDP() {
        return mLineSpacingDP;
    }

    public boolean isAutoTint() {
        return mAutoTint;
    }

    public int getTintColor() {
        return mTintColor;
    }

    public int getTintAlpha() {
        return mTintAlpha;
    }

    public SevenDoctorsImageView.ImageCutType getImageCutType() {
        return mImageCutType;
    }

    public int getImageCutCount() {
        return mImageCutCount;
    }

    public int getImageCutHeightDP() {
        return mImageCutHeightDP;
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }
}
