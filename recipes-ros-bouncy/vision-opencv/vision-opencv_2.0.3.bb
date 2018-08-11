# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS2 with OpenCV, a library of programming functions for real time computer vision."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake cv-bridge image-geometry"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/vision_opencv/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef4a046355e546874c9b6d307bd4b47f"
SRC_URI[sha256sum] = "9732d677deb06931d51156f213ff2207f6706cecfc85c7164a3ec4ca09e630a1"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-vision_opencv-2.0.3-0"

inherit catkin
