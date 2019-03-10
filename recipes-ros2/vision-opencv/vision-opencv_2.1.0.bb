# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS2 with OpenCV, a library of programming functions for real time computer vision."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake cv-bridge image-geometry"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/crystal/vision_opencv/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3be38279c30e2e794fe1a7f8adda1df1"
SRC_URI[sha256sum] = "c5c3156bb5a3c568428b126aa2f70fc9f811283d834d0a01b74c452dbde8f2e9"
S = "${WORKDIR}/vision_opencv-release-release-crystal-vision_opencv-2.1.0-0"

inherit catkin
