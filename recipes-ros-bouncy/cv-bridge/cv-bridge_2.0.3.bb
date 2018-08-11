# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ament-index-python boost python-cmake-module sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/cv_bridge/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c3b6ca777b6cb145d2b5f0072d1ec84"
SRC_URI[sha256sum] = "448a41c641121c7227ad965185199bff915ecd8991e95c04fdf96dfc31f4fb10"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-cv_bridge-2.0.3-0"

inherit catkin
