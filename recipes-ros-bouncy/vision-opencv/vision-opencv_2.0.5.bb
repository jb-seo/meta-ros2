# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS2 with OpenCV, a library of programming functions for real time computer vision."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-geometry"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/vision_opencv/2.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c7922277b6245ef022d5084f45ebb54c"
SRC_URI[sha256sum] = "42f2c63fa9816d6d646d3ce3ae4c6a845ff62f7a65dafa73a3bf5e04df350ef9"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-vision_opencv-2.0.5-0"

inherit ros
inherit ament


