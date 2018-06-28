# 7 Doctors-viewpager

ViewPager template with cool animation.

#Demo

![7 Doctors View Pager for android](https://github.com/7-drs/7Doctors-View-Pager/blob/master/app/src/main/res/drawable-nodpi/demo.gif)




### Dependencies
```groovy
compile 'com.android.support:palette-v7:25.2.0'
```

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
```	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### gradle
Add it in your root build.gradle at the end of repositories:

```	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.7-drs:7Doctors-View-Pager:v1.2'
	}
```
### Usage
Using the View Pager is very easy as the following example :

```java
        SevenDoctorsViewPager mPager = findViewById(R.id.pager);
        SevenDoctorsFragmentPagerAdapter mPagerAdapter = new SevenDoctorsFragmentPagerAdapter
                (getSupportFragmentManager(), getApplicationContext());

                 Resources resources = getApplicationContext().getResources();
                        int ic_motasem = resources.getIdentifier("motasim", "drawable", getPackageName());
                        int ic_dana = resources.getIdentifier("dana", "drawable", getPackageName());
                        int ic_nagham = resources.getIdentifier("nagham", "drawable", getPackageName());
                        int ic_shadi = resources.getIdentifier("shadi", "drawable", getPackageName());
                        int ic_zaid = resources.getIdentifier("zaid", "drawable", getPackageName());

                        String desc_motasim = "الدكتور معتصم مسالمة ، طبيب مقيم طب وجراحة العيون في الخدمات " +
                                "الطبية الملكية الأردنية ، اشتهر من خلال برنامجه الطبي التوعوي الأطباء السبعة " +
                                "الذي يبث على قناة رؤيا الفضائية الأردنية كأول ظهور إعلامي طبي له ، محب للعمل " +
                                "التطوعي وكان له بصمات واضحة لنشر فكرة العمل التطوعي في الأردن وفلسطين\n" +
                                "\n";

                        String desc_dana = "الصيدلانية دانا الجعبري\n";

                        String desc_nagham = "الدكتورة نغم القرة غولي\n";

                        String desc_shadi = "الدكتور شادي الشيخ\n";

                        String desc_zaid = "";

                        mPagerAdapter.addCardItem(
                                new SevenDoctorsCard()
                                        .withTitle("Motasim Masalmeh")
                                        .withSubTitle("Doctor Title")
                                        .withDescription(desc_motasim)
                                        .withImageRes(ic_motasem)
                                        .withImageCutType(ImageCutType.WAVE)
                                        .withImageCutHeightDP(40)
                        );
                        mPagerAdapter.addCardItem(
                                new SevenDoctorsCard()
                                        .withTitle("Dr.Dana")
                                        .withSubTitle("Doctor Description")
                                        .withDescription(desc_dana)
                                        .withImageRes(ic_dana)
                                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                                        .withImageCutHeightDP(40)
                        );
                        mPagerAdapter.addCardItem(
                                new SevenDoctorsCard()
                                        .withTitle("Dr.Zaid Abu ghosh")
                                        .withSubTitle("Robotic Surgeon")
                                        .withDescription(desc_zaid)
                                        .withImageRes(ic_zaid)
                                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                                        .withImageCutHeightDP(40)
                        );
                        mPagerAdapter.addCardItem(
                                new SevenDoctorsCard()
                                        .withTitle("Dr.Nagham")
                                        .withSubTitle("Doctor Description")
                                        .withDescription(desc_nagham)
                                        .withImageRes(ic_nagham)
                                        .withImageCutType(ImageCutType.ARC)
                                        .withImageCutHeightDP(40)
                        );
                        mPagerAdapter.addCardItem(
                                new SevenDoctorsCard()
                                        .withTitle("Shadi Alshaikh")
                                        .withSubTitle("Doctor Description")
                                        .withDescription(desc_shadi)
                                        .withImageRes(ic_shadi)
                                        .withImageCutType(ImageCutType.LINE_POSITIVE)
                                        .withImageCutHeightDP(40)
                         );

                        mPager.setAdapter(mPagerAdapter);
                        mPager.setPageMargin(Utils.dpToPx(getApplicationContext(), 25));
                        mPager.setPageTransformer(false, new SevenDoctorsPagerTransformer());
```
###License
--------

    Copyright 2018 7 Doctors.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
