# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains nodelets for processing depth images such as those      produced by OpenNI camera. Functions include creating disparity      images and point clouds, as well as registering (reprojecting)      a depth image into another camera frame."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " class-loader cv-bridge image-geometry image-transport message-filters sensor-msgs stereo-msgs tf2 tf2-eigen tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/image_pipeline-release/archive/release/crystal/depth_image_proc/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "027231754dc674cda242e8a929f823f2"
SRC_URI[sha256sum] = "ffea92a4b087654cdee1786eda631c4a98b1e7725e9824630a5706a8309b2f58"
S = "${WORKDIR}/image_pipeline-release-release-crystal-depth_image_proc-2.0.0-0"

inherit ament
