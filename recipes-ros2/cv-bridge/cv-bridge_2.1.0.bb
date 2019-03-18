# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "  boost libopencv-dev python3-numpy python-cmake-module sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/crystal/cv_bridge/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b4e7531aece620dcfec7e81228d21ea"
SRC_URI[sha256sum] = "13c70c9ab1a1a243b1e8c6cd77384e9f037ef7e5b0daf94e1d70ffc6dda2ce53"
S = "${WORKDIR}/vision_opencv-release-release-crystal-cv_bridge-2.1.0-0"

inherit ament
