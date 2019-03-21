# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-cmake-module sensor-msgs boost libopencv-dev python3-numpy"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/cv_bridge/2.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3367ac0b470d8625a70fa17201f6ded2"
SRC_URI[sha256sum] = "a2ec0f5b7b3b3c966c0fbc7c488922b15d7f931961350be9d1bbe105e54d27e3"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-cv_bridge-2.0.5-0"

inherit ros
inherit ament


