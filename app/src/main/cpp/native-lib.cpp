#include <jni.h>
#include <string>
#include <nfiq2_algorithm.hpp>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_aug12_12_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    NFIQ2::Algorithm a;

    return env->NewStringUTF(hello.c_str());
}