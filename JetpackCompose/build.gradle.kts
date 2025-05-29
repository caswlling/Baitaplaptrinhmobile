plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace 'com.example.myjetpackcomposeapp'
    compileSdk 34 // Hoặc phiên bản mới nhất

    defaultConfig {
        applicationId "com.example.myjetpackcomposeapp"
        minSdk 24 // Tối thiểu 21, khuyến nghị 24+ cho Compose
        targetSdk 34 // Hoặc phiên bản mới nhất
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary true
        }
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion '1.5.1' // Hoặc phiên bản mới nhất tương thích
    }
    packaging {
        resources {
            excludes '/META-INF/{AL2.0,LGPL2.1}'
        }
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.12.0' // Hoặc phiên bản mới nhất
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.7.0' // Hoặc phiên bản mới nhất
    implementation 'androidx.activity:activity-compose:1.8.2' // Hoặc phiên bản mới nhất
    implementation platform('androidx.compose:compose-bom:2023.08.00') // Hoặc phiên bản mới nhất
    implementation 'androidx.compose.ui:ui'
    implementation 'androidx.compose.ui:ui-graphics'
    implementation 'androidx.compose.ui:ui-tooling-preview'
    implementation 'androidx.compose.material3:material3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
    androidTestImplementation platform('androidx.compose:compose-bom:2023.08.00')
    androidTestImplementation 'androidx.compose.ui:ui-test-junit4'
    debugImplementation 'androidx.compose.ui:ui-tooling'
    debugImplementation 'androidx.compose.ui:ui-test-manifest'
}