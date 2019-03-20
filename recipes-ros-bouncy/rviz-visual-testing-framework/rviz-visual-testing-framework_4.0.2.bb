# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D testing framework for RViz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rviz-common qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_visual_testing_framework/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ec3fa778c486fbd7f0fb1342cde6230"
SRC_URI[sha256sum] = "dd8637ec65a201b22e709d0c43fad4b1291b6bb015dad5909e8b2c867c084e99"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_visual_testing_framework-4.0.2-0"


inherit ros
inherit ament

